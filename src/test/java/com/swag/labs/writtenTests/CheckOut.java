package com.swag.labs.writtenTests;

import com.swag.labs.pageObj.PageObjCheckOut;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckOut {

    public static void checkOutMethod(WebDriver driver, WebDriverWait wait){

        String backPack1 = driver.findElement(PageObjCheckOut.BckPck1).getText();
        driver.findElement(PageObjCheckOut.AddToCartBtn).click();
        driver.findElement(PageObjCheckOut.CartBtn).click();
        String backPack2 = driver.findElement(PageObjCheckOut.BckPck2).getText();
        Assert.assertEquals(backPack1, backPack2);
        driver.findElement(PageObjCheckOut.checkOutBtn).click();
        driver.findElement(PageObjCheckOut.FirstNameField).sendKeys(PageObjCheckOut.firstName);
        driver.findElement(PageObjCheckOut.LastNameField).sendKeys(PageObjCheckOut.lastName);
        driver.findElement(PageObjCheckOut.PostalCodeField).sendKeys(PageObjCheckOut.postalCode);
        driver.findElement(PageObjCheckOut.ContinueBtn).click();
        driver.findElement(PageObjCheckOut.FinishBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageObjCheckOut.ThanksMsg));
    }
}
