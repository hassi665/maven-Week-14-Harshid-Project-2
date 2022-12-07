package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.AccountInfoDetailsPage;
import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends BaseTest {

    ElectronicsPage electronicsPage = new ElectronicsPage();

    HomePage homePage = new HomePage();

    AccountInfoDetailsPage accountInfoDetailsPage = new AccountInfoDetailsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){

        //1.1 Mouse Hover on “Electronics” Tab
        electronicsPage.selectEleTab();

        //1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.CellPhoneTab();

        //1.3 Verify the text “Cell phones”
        veriFyText(By.xpath("//h1[contains(text(),'Cell phones')]"), "Cell phones", "Page with text is incorrect");

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        //2.1 Mouse Hover on “Electronics” Tab
        Thread.sleep(1000);
        electronicsPage.selectEleTab();

        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.CellPhoneTab();

        //2.3 Verify the text “Cell phones”
        veriFyText(By.xpath("//h1[contains(text(),'Cell phones')]"), "Cell phones", "Page with text is incorrect");

        //2.4 Click on List View Tab
        electronicsPage.clickListView();

        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(1000);
        electronicsPage.clickOnNokiaLumia();

        //2.6 Verify the text “Nokia Lumia 1020”
        veriFyText( By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"),"Nokia Lumia 1020","Not the Right Product");

        //2.7 Verify the price “$349.00”
        veriFyText(By.xpath("//span[@id='price-value-20']"), "$349.00", "Wrong Price");

        //2.8 Change quantity to 2
        electronicsPage.quantityChange();

        //2.9 Click on “ADD TO CART” tab
        electronicsPage.addToCart();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        veriFyText(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"), "The product has been added to your shopping cart","Product not added");

        //After that close the bar clicking on the cross button.
        electronicsPage.closingGreenNotificationBar();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronicsPage.shoppingCartOperation();

        //2.12 Verify the message "Shopping cart"
        veriFyText(By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping cart", "Can't see any shopping cart");

        //2.13 Verify the quantity is 2
        veriFyText(By.xpath("//span[contains(text(),'(2)')]"), "(2)", "Different Quantity");

        //2.14 Verify the Total $698.00
        veriFyText( By.xpath("//span[@class='value-summary'][1]/strong"), "$698.00", "Different price");

        //2.15 click on checkbox “I agree with the terms of service”
        electronicsPage.clickOnAgreement();

        //2.16 Click on “CHECKOUT”
        Thread.sleep(1000);
        electronicsPage.clickOnCheckout();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        veriFyText(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"),"Welcome, Please Sign In!", "Welcome page not display");

        //2.18 Click on “REGISTER” tab
        Thread.sleep(1000);
        electronicsPage.clickOnRegister();

        //2.19 Verify the text “Register”
        veriFyText(By.xpath("//h1[contains(text(),'Register')]"), "Register", "Register page not display" );

        //2.20 Fill the mandatory fields
        accountInfoDetailsPage.sendFirstName1();
        accountInfoDetailsPage.sendLastName1();
        accountInfoDetailsPage.sendEmail1();
        accountInfoDetailsPage.sendPassword();
        accountInfoDetailsPage.sendConfirmPassword();

        //2.21 Click on “REGISTER” Button
        electronicsPage.clickOnRegisterAfterDetails();
        Thread.sleep(1500);

        //2.22 Verify the message “Your registration completed”
        veriFyText(By.xpath("//div[contains(text(),'Your registration completed')]"), "Your registration completed", "Registration Failed");

        //2.23 Click on “CONTINUE” tab
        electronicsPage.clickOnContinueAfterReg();
        Thread.sleep(1500);

        //2.24 Verify the text “Shopping card”
        veriFyText(By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping cart", "Shopping cart not displayed");

        //2.25 click on checkbox “I agree with the terms of service”
        electronicsPage.clickOnAgreement();
        Thread.sleep(1000);

        //2.26 Click on “CHECKOUT”
        electronicsPage.clickOnCheckout();

        //2.27 Fill the Mandatory fields
        accountInfoDetailsPage.sendCountry1();
        accountInfoDetailsPage.sendCityName1();
        accountInfoDetailsPage.sendAddress11();
        accountInfoDetailsPage.sendPostCode1();
        accountInfoDetailsPage.sendTelephone1();
        Thread.sleep(1500);

        //2.28 Click on “CONTINUE”
        electronicsPage.clickOnCont1();

        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        Thread.sleep(1500);
        electronicsPage.clickOn2dayDelivery();

        //2.30 Click on “CONTINUE”
        electronicsPage.continueButton();

        //2.31 Select Radio Button “Credit Card”
        electronicsPage.creditCardSelect();

        //2.32 Select “Visa” From Select credit card dropdown
        electronicsPage.visaCardSelection();

        //2.33 Fill all the details
        accountInfoDetailsPage.sendHolderName();
        accountInfoDetailsPage.sendCardNumber();
        accountInfoDetailsPage.sendExpireMonth();
        accountInfoDetailsPage.sendExpireYear();
        accountInfoDetailsPage.sendCardCode();

        //2.34 Click on “CONTINUE”
        electronicsPage.clickContAfterCreditCardSel();
        Thread.sleep(1000);

        //2.35 Verify “Payment Method” is “Credit Card”
        veriFyText(By.xpath("//span[contains(text(),'Credit Card')]"), "Credit Card", "Payment Method Wrong");
        Thread.sleep(2000);

        //2.36 Verify “Shipping Method” is “2nd Day Air”
        veriFyText( By.xpath("//li[@class='shipping-method']/span[2]"), "2nd Day Air","Shipping method is wrong");

        //2.37 Verify Total is “$698.00”
        veriFyText(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]"), "2nd Day Air", "Price is wrong" );

        //2.38 Click on “CONFIRM”
        electronicsPage.clickOnConfirm();

        //2.39 Verify the Text “Thank You”
        veriFyText(By.xpath("//h1[contains(text(),'Thank you')]"), "Thank you", "Not confirm " );

        //2.40 Verify the message “Your order has been successfully processed!”
        veriFyText(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"),"Your order has been successfully processed!", "Order Not Placed");

        //2.41 Click on “CONTINUE”
        electronicsPage.clickOnContinue();

        //2.42 Verify the text “Welcome to our store”
        veriFyText( By.xpath("//h2[contains(text(),'Welcome to our store')]"), "Welcome to our store","Welcome page not display");


        //2.43 Click on “Logout” link
        electronicsPage.clickOnLogout();

        //2.44 Verify the URL is “https://demo.nopcommerce.com/"
        verifyUrl(driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Url is not right");


    }

}
