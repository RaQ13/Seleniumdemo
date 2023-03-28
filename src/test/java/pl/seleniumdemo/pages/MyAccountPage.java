package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    @FindBy(id = "reg_email")
    private WebElement regEmailInput;

    @FindBy(id = "reg_password")
    private WebElement regPasswordInput;

    @FindBy(name = "register")
    private WebElement registerButton;

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li")
    private WebElement error;

    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoggedUserPage registerUserValidData(String email, String pass) {
        registerUser(email, pass);
        return new LoggedUserPage(driver);
    }

    public MyAccountPage registerUserInvalidData(String email, String pass) {
        registerUser(email, pass);
        return this;
    }

    private void registerUser(String email, String pass) {
        regEmailInput.sendKeys(email);
        regPasswordInput.sendKeys(pass);
        registerButton.click();
    }

    public WebElement getError() {
        return error;
    }
}
