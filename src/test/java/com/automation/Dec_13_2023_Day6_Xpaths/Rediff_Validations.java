package com.automation.Dec_13_2023_Day6_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Validations {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		// Landing Page : 1. getTitle()    and getCurrenturl()
		// WebElement :   1. isDisplayed() and isEnabled()
		
	//System.out.println(driver.getTitle());      // Rediff.com: News | Rediffmail | Stock Quotes | Shopping
	//System.out.println(driver.getCurrentUrl());  //https://www.rediff.com/
		//String actualTitle    = driver.getTitle();
		//String expectedTitle  = " Rediff.com: News | Rediffmail | Stock Quotes | Shopping " ;
		//String actualCurrenturl	= driver.getCurrentUrl();
       // String expectedCurrenturl = "https://www.rediff.com/";
       WebElement logo              =   driver.findElement(By.xpath("//span[@class='hmsprite logo'] "));   
       WebElement createAccountLink =   driver.findElement(By.linkText("Create Account"));
  //   if(actualTitle .equals(expectedTitle)   && logo.isDisplayed()  && createAccountLink.isEnabled()) {   //     
       if(logo.isDisplayed( )  && createAccountLink.isEnabled()) {
          System.out.println("Landing Page is correct");             
  	      driver.findElement(By.xpath("//p[@id='signin_info']/child::a[@class='signin']")).click();  //
       } else {
     	System.out.println("Landing Page is incorrect");
       }
		//Login Page
     
   //   System.out.println("Login page title is: "      + driver.getTitle());
  //	System.out.println("Login page current url is:" + driver.getCurrentUrl());
     
		
    String actualTitleLoginPage         = driver.getTitle(); 	
    String expectedTitleLoginpage       = "Rediffmail";
    String acutualCuurentUrlLoginPage   = driver.getCurrentUrl();
    String expectedCurrentUrlLoginPage  = " https://mail.rediff.com/cgi-bin/login.cgi ";
     
    WebElement usernameTextBbox = driver.findElement(By.id("login1"))	;    
    WebElement passwordTextBbox = driver.findElement(By.id("password"));	    
    WebElement LoginButton =   driver.findElement(By.xpath("//input[@title='Sign in']"));                                                                                             //input[@type='submit']
     if(actualTitleLoginPage.equals(expectedTitleLoginpage) &&  acutualCuurentUrlLoginPage.equals( expectedCurrentUrlLoginPage) &&  usernameTextBbox.isDisplayed() 
        &&   passwordTextBbox.isEnabled()) {
    	 
    	 
    	     System.out.println("Welcome Login Page is correct");
    	     usernameTextBbox.sendKeys("seleniumpanda@rediffmail.com");
    	     passwordTextBbox.sendKeys("Selenium@123");
    	     LoginButton.click();    	
    	  
      } else {
    	  System.out.println(" login page is not Validated");
     }
		//Inbox Page
		
		// Logout Page
	}
	
	}
	







