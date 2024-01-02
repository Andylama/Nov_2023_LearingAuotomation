package com.automation.Dec_27_2023_Day9_ApplicationOfStrings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidatingStringMethods {

	public WebDriver driver;
	@Test
	public void checkingEqualsMethod()  {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/"); 
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda20@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	String actualEditAccountInfoLink = driver.findElement(By.linkText("Edit your account information")).getText();
	String expectedEditAccountInfoLink = "Edit your account information";
		
	/* This below .equals(): method compares the values (or content) of two String objects.   For comparing  two String objects based on their content, 
	   almost always use the .equals() method.            */
	System.out.println(actualEditAccountInfoLink.equals(expectedEditAccountInfoLink));// This output is = True so we only use this validation.
	
	String actualChangeYourpasswordLink = driver.findElement(By.linkText("Change your password")).getText();
	String expectedChangeYourpasswordLink = "Change your password";
	System.out.println(actualChangeYourpasswordLink.equals(expectedChangeYourpasswordLink));
	
	
	String actualModifyYourAddressBookEntriesLink = driver.findElement(By.linkText("Modify your address book entries")).getText();
	String expectedModifyYourAddressBookEntriesLink = "Modify your address book entries";
	System.out.println(actualModifyYourAddressBookEntriesLink.equals(expectedModifyYourAddressBookEntriesLink ));
	
	
	String actualModifyYourWishLink = driver.findElement(By.linkText("Modify your wish list")).getText();
	String expectedModifyYourWishLink = "Modify your wish list";
	System.out.println(actualModifyYourWishLink.equals(expectedModifyYourWishLink));
	
	String actualLogoutLink = driver.findElement(By.linkText("Logout")).getText();
	String expectedLogoutLink = "Logout";
	System.out.println(actualLogoutLink.equals(expectedLogoutLink));
	driver.findElement(By.linkText("Logout")).click();	
	
		
	driver.quit();	
		
}
}