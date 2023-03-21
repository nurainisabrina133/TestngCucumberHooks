package com.juaracoding.cucumber;


import  io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"/Users/sabrinalin13/IdeaProjects/juaracoding/sqabatch8/TestCucumber copy/src/main/resources/feature/Login.feature",
                "/Users/sabrinalin13/IdeaProjects/juaracoding/sqabatch8/TestCucumber copy/src/main/resources/feature/Recuritment.feature"},
        glue = {"com.juaracoding.cucumber"},
        plugin = {"pretty","html:target/cucumber-report.html"}

)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
