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
                .registerUser("tester" + random + "@test.pl", "tester12@test.pl")
                .getDashboardLink();
        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }
}
