package com.TestNG.Dec_27_2023_Day9_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* There are 2 types of Assertion Techniques :
   1.At a Webpage Level :-driver.getTitle, driver.getCurrentUrl, driver.getPageSource.
   2.At a WebElement Level :- isEnabled, isDisplayed, isSelected.        */

public class Assertions_InTestNG {
  /* 1. Assert :- This is also called Hard Assert. It is a class which has lot of methods that
                 can help us in Assertions or Validations. Assert.assertTrue, Assert.assertEquals,
                 Assert.assertNotEquals, Assert.fail  
     2. Soft                                                                      */

public WebDriver driver;


@BeforeMethod
public void setup() {
driver = new ChromeDriver()	;
driver.manage().window().maximize();
driver.get("https://tutorialsninja.com/demo/"); 
driver.findElement(By.linkText("My Account")).click();	
Assert.assertTrue(driver.findElement(By.linkText("Login")).isDisplayed());
}

@Test(priority=1)
public void login() {
driver.findElement(By.linkText("Login")).click();	
driver.findElement(By.id("input-email")).sendKeys("seleniumpanda20@gmail.com");
driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
}


@Test(priority=2, dependsOnMethods = "login")
public void logout() {
driver.findElement(By.linkText("Login")).click();	
driver.findElement(By.id("input-email")).sendKeys("seleniumpanda20@gmail.com");
driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
driver.findElement(By.linkText("Logout")).click();	//div[@id='content']/child::p[1]
String actualLogoutMessage = driver.findElement(By.xpath("//div[@id='content']/child::p[1]")).getText();
String expectedLogoutMessage="You have been logged off your account. It is now safe to leave the computer.";
Assert.assertEquals(actualLogoutMessage, expectedLogoutMessage);
}


@Test(priority=3, dependsOnMethods = {"login", "logout" } )
public void continueButtonOnLogoutPage() {
driver.findElement(By.linkText("Login")).click();	
driver.findElement(By.id("input-email")).sendKeys("seleniumpanda20@gmail.com");
driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
driver.findElement(By.linkText("Logout")).click();			
driver.findElement(By.linkText("Continue")).click();	
Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
}


@AfterMethod
public void tearDown() {
driver.quit();	
}
}




