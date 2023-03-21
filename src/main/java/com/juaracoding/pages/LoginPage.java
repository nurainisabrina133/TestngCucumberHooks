package com.juaracoding.pages;

import com.juaracoding.strategies.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='username']")
    WebElement usernamee;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnOut;
    @FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    WebElement welcomeText;

    @FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    WebElement clickBtnToolsDemoSite;
    @FindBy(xpath = "//a[normalize-space()='pink drop shoulder oversized t shirt']")
    WebElement imgDash;
    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement pColor;
    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement org_size;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement selectCart;
    @FindBy(xpath = "//a[@class='button wc-forward wp-element-button']")
    WebElement buttonView;
    @FindBy(xpath = "//label[normalize-space()='Discount code']")
    WebElement txtCart;
    @FindBy(xpath = "//h2[normalize-space()='Login']")
    WebElement btnloginTitle;
    @FindBy(xpath = "//strong[normalize-space()='ERROR']")
    WebElement warningMessage;



    public void setCompanyColor(String comp_color) {
        Select dropdown;
        dropdown = new Select(pColor);
        dropdown.selectByValue(comp_color);
        pColor.click();
    }

    public void setCompanySize(String comp_size) {
        Select dropdown;
        dropdown = new Select(org_size);
        dropdown.selectByValue(comp_size);
        org_size.click();
    }

    public String getWarningMessage() {
        return warningMessage.getText();
    }

    public void getClickBtnToolsDemoSite(){
        clickBtnToolsDemoSite.click();
    }

    public String getWelcomeText() {
        return welcomeText.getText();
    }

    public String getTxtCart() {
        return txtCart.getText();
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void enterUsername(String username) {
        this.username.sendKeys(username);
    }

    public void getBtnloginTitle(String title) {
        btnloginTitle.click();
    }

    public void login() {
        btnLogin.click();
    }

    public void getButtonView(){
        buttonView.click();
    }
    public void getBtnImgDash() {
        imgDash.click();
    }

    public void getSelectCart(String addCart) {
        selectCart.click();
        selectCart.getText();
    }
}

