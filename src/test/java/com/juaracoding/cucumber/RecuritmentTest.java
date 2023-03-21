package com.juaracoding.cucumber;

import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.juaracoding.cucumber.Hooks.delay;

public class RecuritmentTest {

    public static WebDriver driver;
    public static LoginPage loginPage = new LoginPage();
    @Then("User get message hello")
    public void user_get_message_hello(){
        Assert.assertEquals(loginPage.getWelcomeText(), "FREE SHIPPING");
        System.out.println("Welcome in this web");
    }
    @When("User clicked toolsqa demo site")
    public void user_clicked_toolsqa_demo_site(){
      loginPage.getClickBtnToolsDemoSite();
        System.out.println("The user continues to the shopping page");
    }
    @And("User clicked image")
    public void user_clicked_image(){
        delay(1);
        loginPage.getBtnImgDash();
        System.out.println("Button image cliked");
    }
    @And("User chosse an option color")
    public void user_chosse_an_option_color() {
        delay(1);
        loginPage.setCompanyColor("pink");
        System.out.println("User chosse An Option Color");
    }
    @And("User choose an option size")
    public void user_choose_an_option_size() {
        delay(1);
        loginPage.setCompanySize("37");
        System.out.println("User choose an option Size");
    }
    @And("User add to cart")
    public void user_add_to_cart() {
        delay(9);
        loginPage.getSelectCart("PINK DROP SHOULDER OVERSIZED T SHIRT");
        System.out.println("the color and size of the shirt was successfully selected");
    }
    @And("User clicked button view")
    public void user_clicked_button_view(){
        loginPage.getButtonView();
        System.out.println("View item in the cart");
    }

    @Then("User get message about shirt")
    public void user_get_message_about_shirt(){
        delay(4);
        Assert.assertEquals(loginPage.getTxtCart(), "DISCOUNT CODE");
        System.out.println("Item successfully added to cart");
    }

}
