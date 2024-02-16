package com.automation.Feb_8_2024_Day21_Waits_In_Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_WaitConditions {
	public WebDriver driver;
	public WebDriverWait wait ;
	
	
	@BeforeMethod
	public void Launch() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		
		}
			

	@Test(priority =1)
	
	public void FacebookWebDriverWaitTest() throws Exception {
				
		driver.findElement(By.linkText("Create new account")).click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname"))).sendKeys("Selenium");
		
	}
		@ AfterMethod
		public void TearDown() {
			driver.quit();
}
}