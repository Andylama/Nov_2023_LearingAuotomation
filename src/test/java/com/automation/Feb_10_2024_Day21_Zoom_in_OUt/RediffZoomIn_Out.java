package com.automation.Feb_10_2024_Day21_Zoom_in_OUt;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RediffZoomIn_Out {
	public WebDriver driver;
	public ChromeOptions options;
	public WebDriverWait wait ;
	
	@BeforeMethod
	public void LaunchWebsite() {
		options= new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
	}

	@Test
	public void loginTest() throws Exception  {		
		
		/*    Zoon in and Out :----------              */ 
	
        JavascriptExecutor js = ( JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom ='200%';");
        
        Thread.sleep(1000);        
        js.executeScript("document.body.style.zoom ='30%';");   
        
        
        Thread.sleep(1000);        
        js.executeScript("document.body.style.zoom ='100%';");
	}
			
	@ AfterMethod
	public void TearDown() {
    driver.quit();	
	}
}



