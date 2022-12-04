package com.swag.labs.writtenTests;

import com.swag.labs.pageObj.PageObjLogOut;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidLogOut {

    public static void logOutMethod (WebDriver driver, WebDriverWait wait){

        driver.findElement(PageObjLogOut.MenyBtn).click();
        driver.findElement(PageObjLogOut.LogOutBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageObjLogOut.LogInBtn));
    }
}
