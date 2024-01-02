package com.automation.Dec_24_Day8_ChromeOptions;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Browser {

	public static void main(String[] args) {
		ChromeOptions options  = new ChromeOptions();
//I want  to control the speed of my execution.		
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);// EAGER, NORMAL, NONE
// I want to maximize the window of WebPage.		
		options.addArguments("--start-maximized");
// I want to keep myBrowser in Private browsing or Incognito mode to not be recorded browser history.
        options.addArguments("--incognito");
 // i want to disable "Chrome is being controlled by automated test software" Message.
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));
	    WebDriver driver = new ChromeDriver(options);
	    driver.get("https://rediff.com");
	    driver.findElement(By.className("signin")).click();
	
	
	
	}
	
}
