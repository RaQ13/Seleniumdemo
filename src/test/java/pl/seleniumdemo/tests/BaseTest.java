package pl.seleniumdemo.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pl.seleniumdemo.utils.DriverFactory;

public class BaseTest {

    protected WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
