package com.TestNG_Jan_13_2024_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TN_SameClass {

	public WebDriver driver;
	@Test(dataProvider ="TNLoginData")
	public void tNLoginTest(String username,String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue((driver.findElement(By.linkText("Logout")).isDisplayed()));
	    
		
}
@DataProvider()	
	public Object[] [] TNLoginData() {
	Object [][] data= {{"seleniumpanda@gmail.com",     "Selenium@123"},
		            	{"seleniumpanda1@gmail.com",   "Selenium@123"},
		            	{"seleniumpanda2@gmail.com",   "Selenium@123"},
		            	{"seleniumpanda3@gmail.com",   "Selenium@123"},
		            	{"seleniumpanda4@gmail.com",   "Selenium@123"},
		            	{"seleniumpanda5@gmail.com",   "Selenium@123"},
		            	{"seleniumpanda6@gmail.com",   "Selenium@123"},
	            		{"seleniumpanda7@gmail.com",   "Selenium@123"}};
	
	return data ;
	
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}

