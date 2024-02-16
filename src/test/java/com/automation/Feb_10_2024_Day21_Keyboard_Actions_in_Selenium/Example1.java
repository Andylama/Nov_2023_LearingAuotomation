package com.automation.Feb_10_2024_Day21_Keyboard_Actions_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1 {
	 /* KeyBoard Actions:---
    If we are using Actions Class and keyboard operations then it is better you
    specify WebElments separetly.
     Keydown
     Keyup
     sendKeys
     copypaste     
     Select All - Ctrl + A
     Copy         Ctrl + C
     Past         Ctrl + V
     UpperCase    Ctrl + Alphabet                                                                  
                                                                             */
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
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
}
    @Test
       
    public void reddiffLogin1()  {    
     
     WebElement username     = driver.findElement(By.id("login1")) ; 
     WebElement password     = driver.findElement(By.id("password")) ; 
     WebElement signInButton = driver.findElement(By.xpath("//input[@title='Sign in']")) ; 
    
    Actions action = new Actions(driver)	;	
    action.click(username).sendKeys("seleniumpanda@rediffmail.com").perform();
    action.click(password).sendKeys("Selenium@123").perform();
    action.click(signInButton).perform();
    
    }
    
    @Test
    public void reddiffLogin2()  {    	 
     
     WebElement username     = driver.findElement(By.id("login1")) ; 
     WebElement password     = driver.findElement(By.id("password")) ; 
     WebElement signInButton = driver.findElement(By.xpath("//input[@title='Sign in']")) ; 
     
     Actions action = new Actions(driver)	;	
     action.click(username).sendKeys("seleniumpanda@rediffmail.com").perform();
     /* Selecting all -  CTRL + A      selection      */
     action.keyDown(username,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
     /* Selecting all -  CTRL + C      Copy      */
     action.keyDown(username,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
     /* Selecting all -  CTRL + V      Paste      */
     action.keyDown(password,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
     action.click(signInButton).perform();
    }

    @AfterMethod
    public void TearDown() {
         driver.quit();
    }
}

