package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetailsPage {

    @FindBy(id = "billing_first_name")
    private WebElement firstNameInput;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameInput;

    @FindBy(id = "billing_company")
    private WebElement companyNameInput;

    @FindBy(id = "select2-billing_country-container")
    private WebElement countrySelect;

    @FindBy(id = "//li[@class='select2-results__option' and text()='Poland']")
    private WebElement countrySelectMatch;

    @FindBy(id = "billing_address_1")
    private WebElement streetHouseAddressInput;

    @FindBy(id = "billing_address_2")
    private WebElement streetApartmentAddressInput;

    @FindBy(id = "billing_city")
    private WebElement cityInput;

    @FindBy(id = "billing_state")
    private WebElement countryInput;

    @FindBy(id = "billing_postcode")
    private WebElement postalCodeInput;

    @FindBy(id = "billing_phone")
    private WebElement phoneInput;

    @FindBy(id = "billing_email")
    private WebElement emailinput;

    private WebDriver driver;
    public OrderDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
