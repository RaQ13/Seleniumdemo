package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//span[text()='My account']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//span[text()='Shop']")
    private WebElement shopLink;

    private WebDriver driver;

    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MyAccountPage openMyaccountPage() {
        myAccountLink.click();
        return new MyAccountPage(driver);
    }

    public ShopListPage openShopListPage() {
        shopLink.click();
        return new ShopListPage(driver);
    }
}
