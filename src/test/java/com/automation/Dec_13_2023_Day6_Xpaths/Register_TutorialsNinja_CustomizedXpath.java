package com.automation.Dec_13_2023_Day6_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_TutorialsNinja_CustomizedXpath {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@name='firstname']")).sendKeys("Ram"); 
		driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@name='lastname']")). sendKeys("Guru");
		driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@name='email']")). sendKeys("Ram24@gmail.com");
	  	driver.findElement(By.xpath(" //aside[@id='column-right']/preceding::input[@id='input-telephone'] ")).sendKeys("123-568-3265");
		//input[@id='input-telephone']
		//aside[@id='column-right']/preceding::input[@id='input-telephone']
		
		
	  	driver.findElement(By.xpath("//input[@type='tel']/following::input[@name='password'] ")).sendKeys("Ram@2023");
		//input[@type='tel']/following::input[@name='password']
		//input[@id='input-password'] 
		
	    driver.findElement(By.xpath(" //input[@id='input-confirm'] ")).sendKeys("Ram@2023");
	   //input[@type='tel']/following::input[@name='confirm']
	   //input[@id='input-confirm']
	    
		
		driver.findElement(By.xpath(" //input[@name='newsletter']/preceding::input[@name='column-right'] ")).click();
		//aside[@id='column-right']/preceding::input[@name='column-right']
		//input[@name='newsletter']/preceding::input[@name='column-right']
		//label[normalize-space()='No
		
		 driver.findElement(By.xpath(" //div[@class='pull-right']/descendant::input[@name='agree'] ")).click();
		//div[@class='pull-right']/descendant::input[@name='agree']
		 //input[@name='agree'])[1]
		 
		// driver.findElement(By.xpath(" //input[@value='Continue']")).click();
		
				}
	

	
		

	}


