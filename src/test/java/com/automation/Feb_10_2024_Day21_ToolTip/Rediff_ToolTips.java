package com.automation.Feb_10_2024_Day21_ToolTip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_ToolTips {
	public WebDriver driver;
    public ChromeOptions options;
    public WebDriverWait wait;

    @BeforeMethod
    public void LaunchWebsite() {
        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	driver.get("https://www.rediff.com/");
    }
    
    @Test	
      
    public void loginTest() throws Exception  {		
   		/*    ToolTips :----------              */ 
	
    	WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));
        String tooltipText = createAccountLink.getAttribute("title");
        System.out.println("The tooltip of create account link is :"+ tooltipText);
	}
			
	@ AfterMethod
	public void TearDown() {
    driver.quit();	
	}
}





