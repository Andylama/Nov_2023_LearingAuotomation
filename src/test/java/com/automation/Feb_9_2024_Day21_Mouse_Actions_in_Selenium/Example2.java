package com.automation.Feb_9_2024_Day21_Mouse_Actions_in_Selenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example2 {
	/*  Step 1:  Create the Object of Action Class.
	 *  Step 2:  Pass the driver refrence in the Constructor. 


	 *  Methods List:
	 1. Click and hold
	 2.  Click and release
	 3.  Context Click -Right Click
	 4.  Back Click
	 5.  Forward Click
	 6.  Double Click             
	 7.  Move to Element
	 8.  Move to Offset
	 9.  Drag and Drop
	 
	 If there are Frames in the website first you need to determine which frame .
	 Frames are not in practice anymore but still exists in some old websites.  
	 There could be Multiple Frames.
	 Framea are also WebElements.                                                            */
	
	
	public WebDriver driver;
	public ChromeOptions options;
	public WebDriverWait wait ;
	
	@BeforeMethod
	public void LaunchWebsite() {
		options= new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
	}

	@Test
	public void draggable()  {		
		
		/*    Drag :----------              */ 
	
        List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
        System.out.println("Total number of Frames are: " + totalFrames.size());
        driver.switchTo().frame(0);   
        
        
        Actions action = new Actions(driver);
        
        WebElement source = driver.findElement(By.id("draggable"));
        action.dragAndDropBy(source,100,200).build().perform();       
        
	}
			
	@ AfterMethod
	public void TearDown() {
	driver.quit();	
	}
}

