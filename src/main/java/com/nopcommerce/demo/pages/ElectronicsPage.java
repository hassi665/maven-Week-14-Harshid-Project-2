package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ElectronicsPage extends Utility {

    By electronicTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By cellPhoneTab = By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");

    public void selectEleTab(){
        mouseHoverToElement(electronicTab);
    }
    public void CellPhoneTab(){
        mouseHoverToElementAndClick(cellPhoneTab);
    }

    public void clickListView(){
        clickOnElement(By.xpath("//a[contains(text(),'List')]"));
    }

    public void clickOnNokiaLumia(){
        clickOnElement(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]"));
    }

    public void quantityChange(){
        clearTextFromElement(By.id("product_enteredQuantity_20"));
        sendTextToElement(By.id("product_enteredQuantity_20"), "2");
    }

    public void addToCart(){
        clickOnElement(By.id("add-to-cart-button-20"));
    }

    public void closingGreenNotificationBar(){
        clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));
    }

    public void shoppingCartOperation(){
        mouseHoverToElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        clickOnElement(By.xpath("//button[contains(text(),'Go to cart')]"));
    }

    public void clickOnAgreement(){
        clickOnElement(By.id("termsofservice"));
    }

    public void clickOnCheckout(){
        clickOnElement(By.id("checkout"));
    }

    public void clickOnRegister(){
        clickOnElement(By.xpath("//button[contains(text(),'Register')]"));
    }

    public void clickOnRegisterAfterDetails(){
        clickOnElement(By.id("register-button"));
    }

    public void clickOnContinueAfterReg(){
        clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
    }

    public void clickOnCont1(){
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]"));
    }


    public void clickOn2dayDelivery(){
        clickOnElement(By.id("shippingoption_2"));
    }

    public void continueButton(){
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));
    }
    public void creditCardSelect(){
        clickOnElement(By.id("paymentmethod_1"));
        clickOnElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
    }

    public void visaCardSelection(){
        selectByValueFromDropDown(By.id("CreditCardType"), "visa");
    }

    public void clickContAfterCreditCardSel(){
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));
    }

    public void clickOnConfirm(){
        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));
    }

    public void clickOnContinue (){
        clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));
    }

    public void clickOnLogout (){
        clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));
    }












}
