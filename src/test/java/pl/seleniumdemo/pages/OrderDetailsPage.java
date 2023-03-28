package pl.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pl.seleniumdemo.models.Customer;

public class OrderDetailsPage {

    @FindBy(id = "billing_first_name")
    private WebElement firstNameInput;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameInput;

    @FindBy(id = "billing_company")
    private WebElement companyNameInput;

    @FindBy(id = "select2-billing_country-container")
    private WebElement countrySelect;

//zamiast tego Select linia 59
//    @FindBy(id = "//li[@class='select2-results__option' and text()='Poland']")
//    private WebElement countrySelectMatch;

    @FindBy(id = "billing_address_1")
    private WebElement streetHouseAddressInput;

    @FindBy(id = "billing_address_2")
    private WebElement streetApartmentAddressInput;

    @FindBy(id = "billing_city")
    private WebElement cityInput;

    @FindBy(id = "billing_postcode")
    private WebElement postalCodeInput;

    @FindBy(id = "billing_phone")
    private WebElement phoneInput;

    @FindBy(id = "billing_email")
    private WebElement emailinput;

    @FindBy(id = "order_comments")
    private WebElement orderCommentsInput;

    @FindBy(id = "place_order")
    private WebElement placeOrderBtn;

    private WebDriver driver;
    public OrderDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public OrderDetailsCheckPage fillOrderDetails(Customer customer) {
        firstNameInput.sendKeys(customer.getFirstName());
        lastNameInput.sendKeys(customer.getLastName());
        companyNameInput.sendKeys(customer.getCompanyName());
        Select select = new Select(countrySelect);
        select.selectByVisibleText(customer.getCountrySelect());
        streetHouseAddressInput.sendKeys(String.format("%s %s", customer.getStreetHouseAddress(), customer.getStreetApartmentAddress()));
        postalCodeInput.sendKeys(customer.getPostalCode());
        cityInput.sendKeys(customer.getCity());
        phoneInput.sendKeys(customer.getPhone());
        emailinput.sendKeys(customer.getEmail());
        orderCommentsInput.sendKeys(customer.getComments());
        placeOrderBtn.click();

        return new OrderDetailsCheckPage(driver);
    }
}
