package com.TestNG.Jan_13_Day14_TestNG_Repeat_DataDrivenTesting_ExcelSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class TN_LoginTest {
	public WebDriver driver;
@Test(priority =1,dataProvider="getExcelLoginData",dataProviderClass =ExcelCode.class)
	
	public void loginTNTest(String username, String password)  {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue((driver.findElement(By.linkText("Logout")).isDisplayed()));
	  
	
}
@AfterMethod
public void tearDown() {
	     driver.quit();
}
}