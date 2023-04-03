package pl.seleniumdemo.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pl.seleniumdemo.models.Customer;
import pl.seleniumdemo.pages.HomePage;
import pl.seleniumdemo.pages.OrderDetailsCheckPage;
import pl.seleniumdemo.pages.ProductPage;

public class CheckoutTest extends BaseTest{

    @Test
    public void checkoutTest() {

        Customer customer = new Customer();
//        customer.setFirstName("Ferdek");
//        customer.setLastName("Kiepski");
//        customer.setCompanyName("Bezrobotny");
//        customer.setCountrySelect("Poland");
//        customer.setStreetHouseAddress("Ćwiartki 3");
//        customer.setStreetApartmentAddress("4");
//        customer.setPostalCode("59-003");
//        customer.setCity("Wrocław");
//        customer.setPhone("66666666");
//        customer.setEmail("ferderkkiepski@gmail.com");
//        customer.setComments("dej mnie to kurde");

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
                .openOrderDetails()
                .fillOrderDetails(customer);
    }

    @Test
    public void checkoutTestInFluid() {

        Customer customer = new Customer();
//        customer.setFirstName("Ferdek");
//        customer.setLastName("Kiepski");
//        customer.setCompanyName("Bezrobotny");
//        customer.setCountrySelect("Poland");
//        customer.setStreetHouseAddress("Ćwiartki 3");
//        customer.setStreetApartmentAddress("4");
//        customer.setPostalCode("59-003");
//        customer.setCity("Wrocław");
//        customer.setPhone("66666666");
//        customer.setEmail("ferderkkiepski@gmail.com");
//        customer.setComments("dej mnie to kurde");

        OrderDetailsCheckPage orderDetailsCheckPage =
                new HomePage(driver)
                .openShopListPage()
                .openProduct("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openOrderDetails()
                .fillOrderDetails(customer)
                .placeOrder();

        Assert.assertEquals(orderDetailsCheckPage.getThankYouParam().getText(), "Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsCheckPage.getProdcutName().getText(), "Java Selenium WebDriver × 1");
    }
}
