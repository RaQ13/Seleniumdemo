package pl.seleniumdemo.tests;

import org.testng.annotations.Test;
import pl.seleniumdemo.pages.HomePage;

public class CheckoutTest extends BaseTest{

    @Test
    public void checkoutTest() {

        new HomePage(driver)
                .openShopListPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart();
    }
}
