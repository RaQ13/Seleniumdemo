package pl.seleniumdemo.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.seleniumdemo.pages.HomePage;

public class LoginTest extends BaseTest{

    @Test
    public void LoginValidData() {
        WebElement dashboardLink = new HomePage(driver)
                .openMyaccountPage()
                .logInValidData("tester12@test.pl", "tester12@test.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Test
    public void LoginInvalidData() {
        WebElement error = new HomePage(driver)
                .openMyaccountPage()
                .logInInvalidData("test@test.pl", "abc").getError();
        Assert.assertTrue(error.getText().contains(" Incorrect username or password."), "Expected error doesn't match");
    }
}
