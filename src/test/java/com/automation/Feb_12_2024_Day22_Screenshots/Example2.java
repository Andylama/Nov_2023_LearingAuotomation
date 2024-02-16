package com.automation.Feb_12_2024_Day22_Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example2 {
	
	/*   Step 1: Whicever WebElment you want to screenshot of highlight it separtely .
	 *   Step 2: Using the logo we can call a method known as getScreenshotAs.  
	 *   Step 3: Manually create the screenshots folder where you want these screenshots saved.    
	 *   Step 4: Use the FileHandler class to copy the source file into destination path.                              */
	public WebDriver driver;
	public ChromeOptions options;
	public WebDriverWait wait ;
	
	@BeforeMethod
	public void LaunchWebsite() {
		options= new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.shaadi.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
	}
	
	@Test
	public void ShadihomepageBanner() throws Exception {
	WebElement logo = driver.findElement(By.xpath("(//div[@class='css-19oju5s'])[1]"));
	File source = logo.getScreenshotAs(OutputType.FILE);
	File destination = new File(System.getProperty("user.dir") +"\\test-output\\Screenshot\\logoshadihomepage.png");
	FileHandler.copy(source, destination);
	}
	
@ AfterMethod
public void TearDown() {
driver.quit();	
}
}




