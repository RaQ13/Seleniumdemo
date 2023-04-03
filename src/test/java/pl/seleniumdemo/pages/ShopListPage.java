package pl.seleniumdemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pl.seleniumdemo.utils.SeleniumHelper;

public class ShopListPage {

    private WebDriver driver;
    public ShopListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage openProduct(String title) {
        By productXpath = By.xpath("//h2[text()='"+title+"']");
        SeleniumHelper.waitForClickable(productXpath, driver);
        driver.findElement(productXpath).click();
        return new ProductPage(driver);
    }
}
