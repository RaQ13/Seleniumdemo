package pl.seleniumdemo.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.seleniumdemo.pages.HomePage;
import pl.seleniumdemo.pages.ProductPage;

public class CheckoutTest extends BaseTest{

    @Test
    public void checkoutTest() {

        new HomePage(driver)
                .openShopListPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart();

        WebElement addedAlert = new ProductPage(driver).getAddedAlert();

        //Taki krok pomiędzy
        Assert.assertTrue(addedAlert.isDisplayed());
        Assert.assertEquals(addedAlert.getAttribute("textContent"), "\n" +
                "\t\tView cart “Java Selenium WebDriver” has been added to your cart.\t");

        new ProductPage(driver)
                .viewCart()
                .openOrderDetails();
    }

    @Test
    public void checkoutTestInFluid() {

        new HomePage(driver)
                .openShopListPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openOrderDetails();
    }
}
