package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ComputerPage extends Utility {

    By shoppingCart1 = By.xpath("//a[contains(text(),'shopping cart')]");
    By quantity = By.xpath("//td[@class='quantity']/input");
    By listOfProductsOptions = By.xpath("//div[@class='product-grid']//child::*");
    By addToCartButton = By.xpath("//div[@class='buttons']");
    By selectProduct = By.xpath("//select[@id='product_attribute_1']");

    public void sendTextToQuantityField(String qantity) {
        clearTextFromElement(quantity);
        sendTextToElement(quantity, qantity);
    }


    public void desktopMenu() {
        clickOnElement(By.xpath("//ul[@class='sublist']/li[1]/a[1]"));
    }

    public void sortZtoA() {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='products-orderby']"));
        Select select = new Select(dropDown);
        //finding element by value
        select.selectByValue("6");

    }

    public void sortAtoZ() {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='products-orderby']"));
        Select select = new Select(dropDown);
        //finding element by value
        select.selectByValue("5");

    }

    public void clickAddCart() {
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));
    }

    public void selectProduct(String product) {
        selectByVisibleTextFromDropDown(selectProduct, product);

    }

    public void selectProduct1() {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='product_attribute_2']"));
        Select select = new Select(dropDown);
        //finding element by value
        select.selectByValue("5");
    }

    public void selectProductForAddToCart(String product) {
        List<WebElement> productsList = driver.findElements(listOfProductsOptions);
        try {
            for (WebElement list : productsList) {
                if (list.getText().equalsIgnoreCase(product)) {
                    Actions actions = new Actions(driver);
                    WebElement addCart = driver.findElement(addToCartButton);
                    actions.click(addCart).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            productsList = driver.findElements(listOfProductsOptions);
        }
    }

    public void hDD() {
        clickOnElement(By.xpath("//input[@id='product_attribute_3_7']"));
    }

    public void vistaPremium() {
        clickOnElement(By.xpath("//input[@id='product_attribute_4_9']"));
    }

    public void MsOffice() {

        clickOnElement(By.xpath("//input[@id='product_attribute_5_12']"));

    }

    public void AddToCartPayment() {
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
    }

    public void clickOnShoppingCart() {
        mouseHoverToElementAndClick(shoppingCart1);
    }

    public void clickOnCheckBox(){
        clickOnElement(By.id("termsofservice"));
    }

    public void clickOnCheckoutBox(){
        clickOnElement(By.id("checkout"));
    }
    public void clickOnCheckoutAsGuest(){
        clickOnElement(By.xpath("//button[contains(text(),'Checkout as Guest')]"));
    }
    public void continueAfterDetails(){
        clickOnElement(By.name("save"));
    }

    public void deliveryNextDayAir(){
        clickOnElement(By.xpath("//input[@id='shippingoption_1']"));
    }

    public void continueDelivery(){
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
    }

    public void creditCardSelection(){
        clickOnElement(By.id("paymentmethod_1"));
        clickOnElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
    }

    public void masterCardSelection(){
        selectByValueFromDropDown(By.xpath("//select[@id='CreditCardType']"), "MasterCard");
    }

    public void continueForPayment(){
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));
    }

    public void confirmFurther() {
        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));
    }

    public void continueFinal(){
        clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));
    }

}

