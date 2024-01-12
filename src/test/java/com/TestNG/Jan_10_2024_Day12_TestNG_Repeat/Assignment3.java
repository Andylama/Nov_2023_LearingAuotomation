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

public class Assignment3 {
	public WebDriver driver;
	public ChromeOptions options;
	@BeforeMethod
	public void searchProductSetup() {

	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
    options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
	driver = new ChromeDriver(options);
	driver.get("https://tutorialsninja.com/demo/");

}
	@Test(priority =1)
	public void verifySearchWithValidProduct() {
	driver.findElement(By.name("search")).sendKeys("HP");
	driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}
	
	@Test(priority =2)
	public void verifySearchWithInvalidProduct() {
	driver.findElement(By.name("search")).sendKeys("DELL");
	driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}
	@Test(priority =3)
	public void verifySearchWithNoProduct() {
	
	driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
	}
@AfterMethod
public void tearDown() {
driver.quit();
	
}
}