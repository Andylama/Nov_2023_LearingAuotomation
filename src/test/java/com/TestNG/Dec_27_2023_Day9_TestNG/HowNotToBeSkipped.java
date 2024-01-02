package com.TestNG.Dec_27_2023_Day9_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowNotToBeSkipped {
	
	public WebDriver driver;
	// Logout is dependent on Login
		
		
		@BeforeMethod
		public void setup() {
			
		driver = new ChromeDriver()	;
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/"); 
		driver.findElement(By.linkText("My Account")).click();	

	}
		
		@Test(priority=1)
		public void login() {
		driver.findElement(By.linkText("Login")).click();	
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
		
		@Test(priority=2, dependsOnMethods = "login")
		public void logout() {
		driver.findElement(By.linkText("Login")).click();	
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();	
		Assert.fail(" I just want to fail to test FailAssert so that ContinueButtonOnLogoutPage Test will fail");
		
		}
		
		@Test(priority=3, dependsOnMethods = {"login", "logout" },alwaysRun= true )
		public void continueButtonOnLogoutPage() {
		driver.findElement(By.linkText("Login")).click();	
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();			
		driver.findElement(By.linkText("Continue")).click();	
		}
		
		@AfterMethod
		public void tearDown() {
		driver.quit();	
		}
	}
	
	
	


