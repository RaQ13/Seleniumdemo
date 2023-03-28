package pl.seleniumdemo.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.seleniumdemo.pages.HomePage;

public class RegisterTest extends BaseTest{

    @Test
    public void registerUserTest() {
        WebElement entryTitle = new HomePage(driver).openMyaccountPage()
                .registerUser("tester124@test.pl", "tester124@test.pl")
                .getEntryTitle();
        Assert.assertTrue(entryTitle.isDisplayed());
        Assert.assertEquals(entryTitle.getText(), "My account");
    }
}
