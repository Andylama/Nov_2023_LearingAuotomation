package com.automation.Dec_9_2023_Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_HowSeleniumWorks {

	public static void main(String[] args) {
		// Every laptop is a Client
		// you write the Selenium code with OOP Language of your choice in the Client
		// This code interacts with the Server of the Application you want to use.
		// The Application is in form of a websit.
		// So to interact with that application you need a browser.
		// Selenium OOP language Code interacts with the drivers of that browser which in turn interacts with the Browser.
		// Finally we see the outcome in the browser as a UI (Userinterface).
		// Selenium is an API Library.
		   WebDriver driver = new ChromeDriver(); //Ctrl + Shift +o to import the packages from the Library
        // Row NO 18 opens a blank Chrome Browser
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.get("https://www.amazon.com");
		   driver.switchTo().newWindow(WindowType.TAB);
	       driver.get("https://www.google.com");
	       driver.switchTo().newWindow(WindowType.WINDOW);
	       driver.get("https://www.makemytrip.com");
	       driver.quit();
	}
}
