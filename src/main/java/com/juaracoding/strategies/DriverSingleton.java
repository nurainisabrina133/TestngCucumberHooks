package com.juaracoding.strategies;


import com.juaracoding.pages.utils.Constants;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
public class DriverSingleton {
    private static DriverSingleton instance = null;
    private static WebDriver driver;
    private DriverSingleton(String driver){ //konstruktor
        instantiate(driver);

    }
    public WebDriver instantiate(String stategy){
        DriverStrategy driverStrategy = DriverStrategyImplementor.chooseStrategy(stategy);
        driver = driverStrategy.setStrategy(); // ini adalah interface
        driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
    public static  DriverSingleton getInstance(String driver){
        if(instance == null){
            instance = new DriverSingleton(driver);
        }
        return instance;
    }
    public  static  WebDriver getDriver(){
        return  driver;
    }

    public static void closeObjectInstance(){
        instance = null;
        driver.quit();
    }
}