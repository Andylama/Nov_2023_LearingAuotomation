package com.automation.Dec_8_2023_Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningMultipleTabsInSameBrowser {
// Ctril + Shift + F will beautify your code in same alignment//
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // Ctril + Shift + o To import drivers//
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://flipkart.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://costco.com");

	}

}
