package com.TestNG.Jan_03_2024_Day10_TestNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*      @DataProvider in the same Class:----
 
    Rule 1: Returns a 2-Dimensional Object Array
    Rule 2: Passes Data in Rows and Columns 
    Rule 3: Connects to Test Method 
    Rule 4: Parameterizes Test Method  */


public class DataProvider_TutorialsNinja {
	
	public WebDriver driver;
	
//---------------------------------------------------------------------------------	
	@BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
//--------------------------------------------------------------------------------------	
	
	 @AfterMethod
	    public void tearDown() {
	    driver.quit(); // Close the browser after each test
	}
//-------------------------------------------------------------------------------------
	
	 
	@Test(dataProvider ="getData") //Rule 3
	public void Login(String email, String password)   {   //Rule 4
		
		driver.get("https://tutorialsninja.com/demo/"); 
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
}
//-------------------------------------------------------------------------------------------
	
	
	@DataProvider
	public Object[][] getData() {     //Rule 1
		   Object[][]  data = {{"Seleniumpanda@gmail.com",    "Selenium@123",     } ,  //Rule 2
		                       {"Seleniumpanda1@gmail.com",    "Selenium@123",    } ,
		                       {"Seleniumpanda2@gmail.com",    "Selenium@123",    } ,
		                       {"Seleniumpanda3@gmail.com",    "Selenium@123",    } ,
		                       {"Seleniumpanda4@gmail.com",    "Selenium@123456", }};
		  return data ;                  
}
}
	