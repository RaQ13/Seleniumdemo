package pl.seleniumdemo.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.seleniumdemo.pages.HomePage;

public class RegisterTest extends BaseTest{

    @Test
    public void registerUserTest() {
        int random = (int) (Math.random() * 1000);

        WebElement dashboardLink = new HomePage(driver).openMyaccountPage()
                .registerUserValidData("tester" + random + "@test.pl", "tester12@test.pl")
                .getDashboardLink();
        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void registerUserWithExistingEmailTest() {
        WebElement error = new HomePage(driver).openMyaccountPage()
                .registerUserInvalidData("test@test.pl", "tester12@test.pl").getError();
        Assert.assertTrue(error.getText().contains(" An account is already registered with your email address."));
    }
}
