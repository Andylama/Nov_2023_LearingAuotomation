package com.TestNG_Jan_13_2024_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestCases_SeparateClass {

	
	public WebDriver driver;
	
	@Test(priority =1, dataProvider ="TNLoginData",dataProviderClass =DataProviders_SeparateClass.class)
			
	
		public void tnLoginTest(String username,String password) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			driver.findElement(By.id("input-email")).sendKeys(username);
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Assert.assertTrue((driver.findElement(By.linkText("Logout")).isDisplayed()));	
				
}

	@Test(priority =2, dataProvider ="rediffLoginData",dataProviderClass =DataProviders_SeparateClass.class)
	
		public void rediffLoginTest(String username,String password) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.id("login1")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@title='Sign in']")).click();
			Assert.assertTrue((driver.findElement(By.className("rd_logout")).isDisplayed()));
  	
	
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}