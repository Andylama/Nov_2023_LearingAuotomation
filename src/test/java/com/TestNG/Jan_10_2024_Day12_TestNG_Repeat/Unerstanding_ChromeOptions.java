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

public class Unerstanding_ChromeOptions {
	/*   We are creating the Object of ChromwOpriona Class.
    We can contro the speed of our Execution Faster, Same Speed , Slow it down.
    options.setPageLoadStrategy(PageLoadStrategy.NONE);
    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
  	options.addArguments("--start-maximized"); :--- Maximizing the browser so we do not neeed
   driver.manage().window().maximize();
   options.addArguments("--incognito");   :---  to Open the browser in incognito mode.
   options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars")); :-- This will disable the infobar
   
*/
	public WebDriver driver;
	public 	ChromeOptions  options;
	@BeforeMethod
	public void setup() {
	
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
	driver = new ChromeDriver(options);
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	}
@Test(priority =1)
public void verifyLoginWithValidCredentials () {
	
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	
}
//----------------------------------------
@Test(priority =2)
public void verifyLoginWithInvalidCredetials () {
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda300@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123569");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	
	
	
	
}
//----------------------------------------------------
@Test(priority =3)
public void verifyLoginWithInvalidEmailValidPassword() {
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda5689@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	
	
	
	
}
//-----------------------------------------------
@Test(priority =4)
public void verifyLoginWithValidEmailInvalidPassword() {
	
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium@12345666");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	
	
	
}
//---------------------------------------------------
@Test(priority =5)
public void verifyLoginWithoutCredentials() {
	
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	
	
	
}	
	
	
@AfterMethod
public void tearDown() {
	driver.quit();
}
}

