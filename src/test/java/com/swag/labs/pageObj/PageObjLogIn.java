package com.swag.labs.pageObj;

import org.openqa.selenium.By;

public class PageObjLogIn {
   public static By UsernameField = By.id("user-name");
   public static By PassWordField = By.id("password");
   public static By LogInBtn = By.id("login-button");
   public static By ProductSortContainerBtn = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]");
   public static By ErrorTxtMsg = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]");
}
