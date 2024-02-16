package com.automation.Feb_10_2024_Day21_DynamicDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Try {
	public WebDriver driver;
	
	
	public ChromeOptions options;
	public WebDriverWait wait ;
	@Test
	public void easyMyTrip() {
	options= new ChromeOptions();	
	options.addArguments("--start-maximized");
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	 try {
         driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
         System.out.println("It is clicked");
     } catch (Exception e) {
         System.out.println(" Unable to click the button " );
     } finally {
	 driver.quit();
	
	}
	}
	
}