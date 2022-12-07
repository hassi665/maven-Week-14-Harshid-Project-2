package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.AccountInfoDetailsPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    AccountInfoDetailsPage accountInfoDetailsPage = new AccountInfoDetailsPage();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){

        //1.1 Click on Computer Menu.
        homePage.computerMenu();

        //1.2 Click on Desktop
        computerPage.desktopMenu();

        //1.3 Select Sort By position "Name: Z to A"
        computerPage.sortZtoA();

        //1.4 Verify the Product will arrange in Descending order.
        veriFyText(By.xpath("//select[@id='products-orderby']//option[@value='6']"),"Name: Z to A", "Products are not in descending order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homePage.computerMenu();

        //2.2 Click on Desktop
        computerPage.desktopMenu();

        //2.3 Select Sort By position "Name: A to Z"
        Thread.sleep(1000);
        computerPage.sortAtoZ();

        //2.4 Click on "Add To Cart"
        computerPage.selectProductForAddToCart("Build your own computer");
        Thread.sleep(1500);

        //2.5 Verify the Text "Build your own computer"
        veriFyText(By.xpath("//h1[contains(text(),'Build your own computer')]"), "Build your own computer", "Wrong Products Selected ");

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(1500);
        computerPage.selectProduct("2.2 GHz Intel Pentium Dual-Core E2200");

        //2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(500);
        computerPage.selectProduct1();

        //2.8 Select HDD radio "400 GB [+$100.00]"
        computerPage.hDD();

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        computerPage.vistaPremium();

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
        Thread.sleep(1000);
        computerPage.MsOffice();


        //2.11 Verify the price "$1,475.00"
        Thread.sleep(800);
        veriFyText(By.id("price-value-1"),"$1,475.00", "Wrong Price ");

        //2.12 Click on "ADD TO CARD" Button.
        Thread.sleep(1000);
        computerPage.clickAddCart();

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
        Thread.sleep(800);
        veriFyText(By.xpath("//h1[contains(text(),'Build your own computer')]"), "Build your own computer", "Wrong Products Selected");

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        computerPage.clickOnShoppingCart();

        //2.15 Verify the message "Shopping cart"
        veriFyText(By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping cart", "shopping cart is empaty");


        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        computerPage.sendTextToQuantityField("2");

        //2.17 Verify the Total"$2,950.00"
        veriFyText(By.xpath("//span[@class='value-summary']//strong"), "$2,950.00", "Total is not right");

        //2.18 click on checkbox “I agree with the terms of service”
        computerPage.clickOnCheckBox();

        //2.19 Click on “CHECKOUT”
        computerPage.clickOnCheckoutBox();

        //2.20 Verify the Text “Welcome, Please Sign In!”
        veriFyText(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"), "Welcome, Please Sign In!", "Welcome Text Screen Not Display");

        //2.21Click on “CHECKOUT AS GUEST” Tab
        computerPage.clickOnCheckoutAsGuest();

        //2.22 Fill the all mandatory field
        Thread.sleep(1000);
        accountInfoDetailsPage.sendFirstName();
        accountInfoDetailsPage.sendLastName();
        accountInfoDetailsPage.sendEmail();
        accountInfoDetailsPage.sendCountry();
        accountInfoDetailsPage.sendCityName();
        accountInfoDetailsPage.sendAddress1();
        accountInfoDetailsPage.sendPostCode();
        accountInfoDetailsPage.sendTelephone();

        //2.23 Click on “CONTINUE”
        Thread.sleep(500);
        computerPage.continueAfterDetails();

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        Thread.sleep(500);
        computerPage.deliveryNextDayAir();

        //2.25 Click on “CONTINUE”
        computerPage.continueDelivery();
        Thread.sleep(500);

        //2.26 Select Radio Button “Credit Card”
        computerPage.creditCardSelection();

        //2.27 Select “Master card” From Select credit card dropdown
        computerPage.masterCardSelection();

        //2.28 Fill all the details
        Thread.sleep(800);
        accountInfoDetailsPage.sendHolderName();
        accountInfoDetailsPage.sendCardNumber();
        accountInfoDetailsPage.sendExpireMonth();
        accountInfoDetailsPage.sendExpireYear();
        accountInfoDetailsPage.sendCardCode();

        //2.29 Click on “CONTINUE”
        computerPage.continueForPayment();
        Thread.sleep(800);

        //2.30 Verify “Payment Method” is “Credit Card”
        veriFyText(By.xpath("//span[contains(text(),'Credit Card')]"), "Credit Card", "Card Payment method Wrong");

        //2.32 Verify “Shipping Method” is “Next Day Air”
        veriFyText(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]"), "Next Day Air", "Next Day Delivery option not shown");

        //2.33 Verify Total is “$2,950.00”
        veriFyText(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"), "$2,950.00", "Total is Wrong");

        //2.34 Click on “CONFIRM”
        computerPage.confirmFurther();

        //2.35 Verify the Text “Thank You”
        veriFyText(By.xpath("//h1[contains(text(),'Thank you')]"), "Thank you", "Error with the page");

        //2.36 Verify the message “Your order has been successfully processed!”
        veriFyText(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"), "Your order has been successfully processed!", "Couldn't Proceed the Order");

        //2.37 Click on “CONTINUE”
        computerPage.continueFinal();

        //2.37 Verify the text “Welcome to our store”
        veriFyText(By.xpath("//h2[contains(text(),'Welcome to our store')]"), "Welcome to our store", "Welcome Page not shown");


    }
}
