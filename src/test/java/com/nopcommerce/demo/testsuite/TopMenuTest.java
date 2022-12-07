package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.AccountInfoDetailsPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();

    @Test
    public void verifyPageNavigation() {

        //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
        //1.2 This method should click on the menu whatever name is passed as parameter.
        homePage.selectMenu("Computers");

        //1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation
        veriFyText(By.xpath("//strong[contains(text(),'Categories')]"), "Categories", "Selected menu not open");

    }


}
