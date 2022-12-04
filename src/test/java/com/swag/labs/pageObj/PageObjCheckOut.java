package com.swag.labs.pageObj;

import org.openqa.selenium.By;

public class PageObjCheckOut {
    public static By AddToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    public static By CartBtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]");
    public static By checkOutBtn = By.id("checkout");
    public static By FirstNameField = By.id("first-name");
    public static By LastNameField = By.id("last-name");
    public static By PostalCodeField = By.id("postal-code");
    public static By ContinueBtn = By.id("continue");
    public static By FinishBtn = By.id("finish");
    public static String firstName = "Aleksandar";
    public static String lastName = "Jovanovic";
    public static String postalCode = "11000";
    public static By BckPck1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]");
    public static By BckPck2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]");
    public static By ThanksMsg = By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");
}
