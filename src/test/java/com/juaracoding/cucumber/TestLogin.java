package com.juaracoding.cucumber;

import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.juaracoding.cucumber.Hooks.delay;

public class TestLogin {
    public static WebDriver driver;

    public static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
    }

    @Given("User open browser and url")
    public void user_open_browser_and_url() {
        driver.get("https://shop.demoqa.com/my-account/");
        System.out.println("Url detected");
    }
//................................................valid login
    @When("User enter valid username")
    public void user_enter_valid_username() {
        delay(2);
        WebElement query = driver.findElement(By.id("username"));
        query.sendKeys("Adminooooooooo");
        query.clear();
        loginPage.enterUsername("Adminoooooooooo");
        System.out.println("User Input Username");
    }
    @And("User enter valid password")
    public void user_enter_valid_password(){
        delay(4);
        WebElement query = driver.findElement(By.id("password"));
        query.sendKeys("fhguiy8oiuioj");
        query.clear();
        loginPage.enterPassword("fhguiy8oiuioj");
        System.out.println("User Input Password");
    }
    //..........................................invalid login


    @And("User enter invalid username")
    public void user_enter_invalid_username() {
        loginPage.enterUsername("Adminooooooooopp");
        System.out.println("User Input Username");
    }
    @And("User enter invalid password")
    public void user_enter_invalid_password(){
        loginPage.enterPassword("fhguiy8oiuiooo");
        System.out.println("User Input Password");
    }
    //..............................................button clicked
    @And("User clicked button login")
    public void user_clicked_button_login(){
        delay(1);
        loginPage.login();
        System.out.println("Login Clear");
    }

    //............................................ Message
    @Then("User reading warning message")
    public void  user_reading_warning_message() {
        Assert.assertEquals(loginPage.getWarningMessage(), "ERORR");
        System.out.println("User field login");
    }
    @Then("User go to page tools demo site")
    public void then_user_go_to_page_tools_demo_site(){
        Assert.assertEquals(loginPage.getWelcomeText(), "ToolsQA Demo Site");
        System.out.println("Login Clear");


    }
}

