package com.TestNG.Jan_03_2024_Day10_TestNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
                  //@DataProvider in a different Class.//
public class TestCases_Only {
	public WebDriver driver;
	
	@BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
//----------------------------------------------------------------------------------	
	
	
	 @AfterMethod
	    public void tearDown() {
	    driver.quit(); // Close the browser after each test
	}
//----------------------------------------------------------------------------------------	
	 
	 
	@Test(priority =1,dataProvider ="getDataTN", dataProviderClass =DataProviders_Only.class) //Rule 3
	public void LoginTutorialNinja(String email, String password)   {   //Rule 4
		
		driver.get("https://tutorialsninja.com/demo/"); 
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
}	
	
	@Test(priority =2, dataProvider ="getDataRediff", dataProviderClass =DataProviders_Only.class)
	public void LoginRediff(String username,String password) {
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();	
}
}	
	
	
