package com.TestNG.Dec_24_2023_Day8_TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SettingPriority_TestCases {

	
	public WebDriver driver;
	
	//-----------------------------------------------------------------------------------------	
			@BeforeMethod
			public void OpenApplication()    {
				driver = new ChromeDriver() ;
				driver.manage().window().maximize();
				driver.get(" https://tutorialsninja.com/demo/");
				driver.findElement(By.linkText("My Account")).click();
	}
	//------------------------------------------------------------------------------------------	
			@Test(priority = 2)
			public void SelectLoginOption( ) {
				driver.findElement(By.linkText("Login"));	
	}			
		//---------------------------------------------------------------------------------------------	
			@Test(priority = 1, enabled = false)
			public void SelectregisterOption( ) {
				driver.findElement(By.linkText("Register"));	
	}
			
		//--------------------------------------------------------------------------------------------
			@AfterMethod
			public void CloseBrowser()  {
				driver.quit();
	}
		//------------------------------------------------------------------------------------------------	
			

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

