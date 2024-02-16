package com.automation.Feb_10_2024_Day21_DynamicDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1_Looping_Dropdown {
	
	/*      This test case is failed please try and do it again                   */
	public WebDriver driver;
	public ChromeOptions options;
	public WebDriverWait wait ;
	
	@BeforeMethod
	public void LaunchWebsite() {
		options= new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
	}
	
	@Test
	public void spicejetLoopingDropdown()   {	
		
	/*  Preselection  =  1
	 *  Postselection =  n traveller               */	
		
		
		
	String preSelection =	driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).getText();
	System.out.println("Traverler before selection is :" + preSelection);
	driver.findElement(By.xpath("//div[normalize-space()='Passengers']")).click();	
		
	int Adults = 1;
	while(Adults <5) {
	driver.findElement(By.xpath("(//*[name()='path'][@fill-rule='nonzero'])[10]")).click();	
	Adults ++;
	
	}
	int Children = 0;
	while(Children <2) {
	driver.findElement(By.xpath("(//*[name()='path'][@fill-rule='nonzero'])[12]")).click();	
	Children ++;
	}
	
	
	int Infant = 0;
	while(Infant <5) {
	driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[22]")).click();	
	Infant ++;
	}
	
	
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	 driver.quit();
     }
	//String postSelection =	driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).getText();
	//System.out.println("Traverler after selection is :" + postSelection);   
	
	
	

	
	
@ AfterMethod
public void TearDown() {
driver.quit();	
}
}
