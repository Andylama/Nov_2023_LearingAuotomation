package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.java.Dec_30_2023_Day9_SpecialClasses_Date_Class.Util;

public class Assignment2 {
	public WebDriver driver;
	public 	ChromeOptions  options;
	@BeforeMethod
	public void registerSetup() {
	
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
	driver = new ChromeDriver(options);
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Register")).click();
}
	@Test(priority =1)
	public void verifyRegisterWithMandatoryDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("selenium");
     	driver.findElement(By.id("input-lastname")).sendKeys("panda");
       	driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
        driver.findElement(By.id("input-telephone")).sendKeys("987-654-3210");
        driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
        driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
       	driver.findElement(By.name("agree")).click();
    	driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); 	
		
		
		
		
}
	
	@Test(priority =2)
	public void verifyRegisterWithAllDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("selenium");
     	driver.findElement(By.id("input-lastname")).sendKeys("panda");
       	driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
        driver.findElement(By.id("input-telephone")).sendKeys("987-654-3210");
        driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
        driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
        driver.findElement(By.xpath("//input[@name ='newsletter' and @value ='1']")).click();
        driver.findElement(By.name("agree")).click();
    	driver.findElement(By.cssSelector("input.btn.btn-primary ")).click(); 	
    	
			
		
		
		
		
	}
	@Test(priority =3)
	public void verifyRegisterWithExistingEmail() {
		driver.findElement(By.cssSelector(" input#input-firstname")).sendKeys("Automation");
     	driver.findElement(By.cssSelector(" input#input-lastname")).sendKeys(" Lama");
     	driver.findElement(By.cssSelector(" input#input-email")).sendKeys(" Automationlama16@myyahoo.com");
        driver.findElement(By.cssSelector(" input#input-telephone")).sendKeys("9876543210");
        driver.findElement(By.cssSelector(" input#input-password")).sendKeys("Selenium");
        driver.findElement(By.cssSelector(" input#input-confirm")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@name ='newsletter' and @value ='1']")).click();
        driver.findElement(By.name("agree")).click();
    	driver.findElement(By.cssSelector("input.btn.btn-primary ")).click(); 	
    	
		
		
		
		
		
	}	
	@Test(priority =5)
	public void verifyRegisterWithNoDetails() {
	driver.findElement(By.cssSelector("input.btn.btn-primary ")).click(); 	
		
			
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
		
	}
}