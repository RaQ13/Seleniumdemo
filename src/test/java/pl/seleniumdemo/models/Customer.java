package pl.selenitring;

import org.openqa.selenium.support.FindBy;

public class Customer {

    private String firstNameInput;
    private String lastNameInput;
    private String companyNameInput;
    private String countrySelect;
    private String countrySelectMatch;
    private String streetHouseAddressInput;
    private String streetApartmentAddressInput;
    private String countryInput;
    private String postalCodeInput;
    private String phoneInput;
    private String emailinput;

    public String getFirstNameInput() {
        return firstNameInput;
    }

    public void setFirstNameInput(String firstNameInput) {
        this.firstNameInput = firstNameInput;
    }

    public String getLastNameInput() {
        return lastNameInput;
    }

    public void setLastNameInput(String lastNameInput) {
        this.lastNameInput = lastNameInput;
    }

    public String getCompanyNameInput() {
        return companyNameInput;
    }

    public void setCompanyNameInput(String companyNameInput) {
        this.companyNameInput = companyNameInput;
    }

    public String getCountrySelect() {
        return countrySelect;
    }

    public void setCountrySelect(String countrySelect) {
        this.countrySelect = countrySelect;
    }

    public String getCountrySelectMatch() {
        return countrySelectMatch;
    }

    public void setCountrySelectMatch(String countrySelectMatch) {
        this.countrySelectMatch = countrySelectMatch;
    }

    public String getStreetHouseAddressInput() {
        return streetHouseAddressInput;
    }

    public void setStreetHouseAddressInput(String streetHouseAddressInput) {
        this.streetHouseAddressInput = streetHouseAddressInput;
    }

    public String getStreetApartmentAddressInput() {
        return streetApartmentAddressInput;
    }

    public void setStreetApartmentAddressInput(String streetApartmentAddressInput) {
        this.streetApartmentAddressInput = streetApartmentAddressInput;
    }

    public String getCountryInput() {
        return countryInput;
    }

    public void setCountryInput(String countryInput) {
        this.countryInput = countryInput;
    }

    public String getPostalCodeInput() {
        return postalCodeInput;
    }

    public void setPostalCodeInput(String postalCodeInput) {
        this.postalCodeInput = postalCodeInput;
    }

    public String getPhoneInput() {
        return phoneInput;
    }

    public void setPhoneInput(String phoneInput) {
        this.phoneInput = phoneInput;
    }

    public String getEmailinput() {
        return emailinput;
    }

    public void setEmailinput(String emailinput) {
        this.emailinput = emailinput;
    }
}
