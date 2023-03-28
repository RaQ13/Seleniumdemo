package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(name = "add-to-cart")
    private WebElement addToCartBtn;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public ProductPage addProductToCart() {
        addToCartBtn.click();
        return this;
    }
}
