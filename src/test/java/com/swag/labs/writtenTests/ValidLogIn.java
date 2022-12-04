package com.swag.labs.writtenTests;

import com.swag.labs.pageObj.PageObjLogIn;
import com.swag.labs.utility.jsonFilesParser.JSONManagement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidLogIn {

    public static void logInMethod(WebDriver driver, WebDriverWait wait){

        driver.findElement(PageObjLogIn.UsernameField).sendKeys(JSONManagement.readProperty("username"));
        driver.findElement(PageObjLogIn.PassWordField).sendKeys(JSONManagement.readProperty("password"));
        driver.findElement(PageObjLogIn.LogInBtn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageObjLogIn.ProductSortContainerBtn));

    }
}
