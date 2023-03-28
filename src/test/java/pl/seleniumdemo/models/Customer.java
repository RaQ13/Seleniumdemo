package pl.seleniumdemo.models;

import org.openqa.selenium.support.FindBy;

public class Customer {

    private String firstName;
    private String lastName;
    private String companyName;
    private String countrySelect;
    private String streetHouseAddress;
    private String streetApartmentAddress;
    private String city;
    private String postalCode;
    private String phone;
    private String email;
    private String comments;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountrySelect() {
        return countrySelect;
    }

    public void setCountrySelect(String countrySelect) {
        this.countrySelect = countrySelect;
    }

    public String getStreetHouseAddress() {
        return streetHouseAddress;
    }

    public void setStreetHouseAddress(String streetHouseAddress) {
        this.streetHouseAddress = streetHouseAddress;
    }

    public String getStreetApartmentAddress() {
        return streetApartmentAddress;
    }

    public void setStreetApartmentAddress(String streetApartmentAddress) {
        this.streetApartmentAddress = streetApartmentAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
