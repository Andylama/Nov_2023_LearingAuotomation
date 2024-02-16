package com.automation.Feb_10_2024_Day21_DynamicDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoSuggestive_Dropdown {
	public WebDriver driver;
	public ChromeOptions options;
	public WebDriverWait wait ;
	
	@BeforeMethod
	public void LaunchWebsite() {
		options= new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
	}
	
	@Test
	public void makeMyTripAutoSuggestiveDropdown() throws InterruptedException  {
	driver.findElement(By.id("fromCity")).click();	
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("New");
	
	int From = 0;
	while (From<5)  {
	Thread.sleep(1000)	;
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);	
	From ++ ;
	}
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	
	driver.findElement(By.id("toCity")).click();	
	
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Las");
	int To = 0;
	while ( To <5)  { 	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.DOWN);	
	To ++ ;
	}
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
	}
	
@ AfterMethod
public void TearDown() {
driver.quit();	
}
}



