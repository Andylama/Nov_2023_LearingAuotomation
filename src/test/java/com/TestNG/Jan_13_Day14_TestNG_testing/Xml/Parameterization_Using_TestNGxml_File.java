package com.TestNG.Jan_13_Day14_TestNG_testing.Xml;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Using_TestNGxml_File {

	public WebDriver driver;
	public ChromeOptions options;
	
	
	
	
	//---------------------------------------------------------------------------------------------	
		@Test(priority =1)
		@Parameters({"url", "email","password"})
		public void verifyLoginWithValidCredentials(String url, String email, String password) {
			options = new ChromeOptions();	
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximized");
			options.addArguments("--incogito");
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys(email);
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			/*  First you need to decide what you need to Assert Second you highlight or objectify that WebElement
			    Third you apply Assertion */
			WebElement editYourAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
			WebElement LogoutLink = driver.findElement(By.linkText("Logout"));
		//Assert.assertTrue(editYourAccountInfoLink.isDisplayed() && LogoutLink.isDisplayed());	
			Assert.assertFalse(editYourAccountInfoLink.isDisplayed() && LogoutLink.isDisplayed()); // Deleberatelely failing
			
		}
		@AfterMethod
		public void tearDown() {
		driver.quit();
		
		}
}