package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    @FindBy(name = "add-to-cart")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//div[@class='woocommerce-message' and text()=' “Java Selenium WebDriver” has been added to your cart.	']")
    private WebElement addedAlert;

    @FindBy(xpath = "//div[@class='woocommerce-message']//a[text()='View cart']")
    private WebElement viewCartBtn;

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage addProductToCart() {
        addToCartBtn.click();
        return this;
    }

    public WebElement getAddedAlert() {
        return addedAlert;
    }

    public CartPage viewCart() {
        viewCartBtn.click();
        return new CartPage(driver);
    }

}
