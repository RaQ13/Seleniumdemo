package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsCheckPage {

    @FindBy(xpath = "//div[@class='woocommerce-order']//p")
    private WebElement thankYouParam;

    @FindBy(xpath = "//td[contains(@class, 'product-name')]")
    private WebElement prodcutName;

    public OrderDetailsCheckPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getThankYouParam() {
        return thankYouParam;
    }

    public WebElement getProdcutName() {
        return prodcutName;
    }

}
