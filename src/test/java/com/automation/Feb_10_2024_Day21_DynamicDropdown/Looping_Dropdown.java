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

public class Looping_Dropdown {
	public WebDriver driver;
	public ChromeOptions options;
	public WebDriverWait wait ;
	
	@BeforeMethod
	public void LaunchWebsite() {
		options= new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
	}
	
	@Test
	public void easeMyTripTravellersLooping()  {	
		
	/*  Preselection  =  1
	 *  Postselection =  n traveller               */	
		
		//button[@id='add' and @class='add plus_box1']
		
	String preSelection =	driver.findElement(By.id("spnDrpNo")).getText();
	System.out.println("Traverler before selection is :" + preSelection);
	driver.findElement(By.id("ptravlrNo")).click();	
	
	int Adults = 1;
	while(Adults <5) {
	driver.findElement(By.xpath("//button[@id='add' and @class='add plus_box1']")).click();	
	Adults ++;
	
	}
	

	int Children = 0;
	while(Children <2) {
	driver.findElement(By.xpath("//button[@id='add' and @class='add plus_boxChd']")).click();	
	Children ++;
	
	
	
	}

	int Infant = 0;
	while(Infant <5) {
	driver.findElement(By.xpath("//button[@id='add' and @class='add plus_box1Inf']")).click();	
	Infant ++;
	}
	
	driver.findElement(By.id("traveLer")).click();	
	String postSelection =	driver.findElement(By.id("spnDrpNo")).getText();
	System.out.println("Traverler after selection is :" + postSelection);
	
	
	
	}
	
	
	
	
	
@ AfterMethod
public void TearDown() {
driver.quit();	
}
}

