package pl.seleniumdemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShopListPage {

    private WebDriver driver;
    public ShopListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage openProduct(String title) {
        driver.findElement(By.xpath("//h2[text()='"+title+"']")).click();
        return new ProductPage(driver);
    }
}
