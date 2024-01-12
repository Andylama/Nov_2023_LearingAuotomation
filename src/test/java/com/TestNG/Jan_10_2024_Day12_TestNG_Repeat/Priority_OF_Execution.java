package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_OF_Execution {
	public  WebDriver driver;
	/*   @BeforMethod- Create the Setup
	  
	 
	 *   @Test- verifyLoginWithValidCredentials
	 *   @Test- verifyLoginWithInvalidCredetials
	 *   @Test- verifyLoginWithInvalidEmailValidPassword
	 *   @Test- verifyLoginWithValidEmailInvalidPassword
	 *   @Test- verifyLoginWithoutCredentials
	 
	  
	 *   @AfterMethod- quit the browser.    	                  */


@BeforeMethod
public void setup() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	
	
}
//----------------------------------------------------
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
//-----------------------------------------------------
@AfterMethod
public void closing() {
	driver.quit();
	
	
	
	
	
	
}
}

