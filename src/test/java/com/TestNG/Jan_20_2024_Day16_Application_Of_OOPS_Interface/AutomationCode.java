package com.TestNG.Jan_20_2024_Day16_Application_Of_OOPS_Interface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationCode {
	
	@Test
	public void setup() {
		
		/*  WebDriver: is and Interface
		       Driver: is the refrence of Interface
		 ChromeDriver: is the implementing Class
   new ChromeDriver(): is the Object of the implementing Clas */
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.quit();
	}

}
