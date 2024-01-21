package com.TestNG.Jan_20_2024_Day16_Application_Of_OOPS_Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {
public WebDriver driver;

@Test
public void loginValidCredentials() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	HomePage homepage  = new HomePage(driver);
	homepage.clickOnMyAccountDropdown();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}	
	@AfterMethod
	public void tearDown() {
	driver.quit();	
}
}
