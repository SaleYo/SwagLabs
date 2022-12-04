package com.swag.labs.writtenTests;

import com.swag.labs.pageObj.PageObjPlpSorting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlpSorting {


    public static void sortingProductsZtoAMethod(WebDriver driver, WebDriverWait wait){

        List<WebElement> beforeFilterName = driver.findElements(PageObjPlpSorting.InventoryListName);
        List<String> beforeFilterNameList = new ArrayList<>();
        for (WebElement elementBefore : beforeFilterName) {
            beforeFilterNameList.add(elementBefore.getText());
        }

        Select dropdown = new Select(driver.findElement(PageObjPlpSorting.ProdSortContBtn));
        dropdown.selectByVisibleText("Name (Z to A)");


        List<WebElement> afterFilterName = driver.findElements(PageObjPlpSorting.InventoryListName);
        List<String> afterFilterNameList = new ArrayList<>();
        for (WebElement elementAfter : afterFilterName) {
            afterFilterNameList.add(elementAfter.getText());
        }

        Collections.reverse(beforeFilterNameList);
        Assert.assertEquals(beforeFilterNameList, afterFilterNameList);

    }
}











