package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class AccountInfoDetailsPage extends Utility {

    //Details filling for Laptop account

    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By telephone = By.id("BillingNewAddress_PhoneNumber");

    By address1 = By.id("BillingNewAddress_Address1");
    By city = By.id("BillingNewAddress_City");
    By postCode = By.id("BillingNewAddress_ZipPostalCode");


    public void sendFirstName() {
        sendTextToElement(firstName, "Harshid");
    }

    public void sendLastName() {
        sendTextToElement(lastName, "Prime");
    }

    public void sendEmail() {
        sendTextToElement(email, "harshid.prime@gmail.com");
    }

    public void sendTelephone() {
        sendTextToElement(telephone, "07845123678");
    }

    public void sendAddress1() {
        sendTextToElement(address1, "1 London Street");
    }

    public void sendCityName() {
        sendTextToElement(city, "London");
    }

    public void sendPostCode() {
        sendTextToElement(postCode, "E16NJG");
    }

    public void sendCountry() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "233");
    }

    //---------------------     Card Details Page ----------------------------//

    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonth = By.name("ExpireMonth");
    By expireYear = By.name("ExpireYear");
    By cardSecretCode = By.id("CardCode");

    public void sendHolderName() {
        sendTextToElement(cardHolderName, "Harshid Prime");
    }

    public void sendCardNumber() {
        sendTextToElement(cardNumber, "5555555555554444");
    }

    public void sendExpireMonth() {
        selectByValueFromDropDown(expireMonth, "3");
    }

    public void sendExpireYear() {
        selectByValueFromDropDown(expireYear, "2031");
    }

    public void sendCardCode() {
        sendTextToElement(cardSecretCode, "189");
    }


    // -------------------Electronic page / Cell phone / registration page ----------//

    By firstName1 = By.id("FirstName");
    By lastName1 = By.id("LastName");
    By email1 = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");

    public void sendFirstName1() {
        sendTextToElement(firstName1, "Harshid1"+ getAlphaNumericString(2));
    }

    public void sendLastName1() {
        sendTextToElement(lastName1, "Prime1" + getAlphaNumericString(2));
    }

    public void sendEmail1() {
        sendTextToElement(email1, "harshid.prime" + getAlphaNumericString(3) + "@gmail.com");
    }

    public void sendPassword() {
        sendTextToElement(password, "harshid@7771");
    }

    public void sendConfirmPassword() {
        sendTextToElement(confirmPassword, "harshid@7771");
    }

    // -------------------Electronic page / Cell phone / Billing page ----------//

    By country = By.id("BillingNewAddress_CountryId");
    By city1 = By.id("BillingNewAddress_City");
    By address11 = By.id("BillingNewAddress_Address1");
    By postCode1 = By.id("BillingNewAddress_ZipPostalCode");
    By telephone1 = By.id("BillingNewAddress_PhoneNumber");


    public void sendCountry1() {
        selectByValueFromDropDown(country, "233");
    }

    public void sendCityName1() {
        sendTextToElement(city1, "London");
    }

    public void sendAddress11() {
        sendTextToElement(address11, "1 London Street");
    }


    public void sendPostCode1() {
        sendTextToElement(postCode1, "E16NJG");
    }

    public void sendTelephone1() {
        sendTextToElement(telephone1, "07784561231");
    }


}
