package com.automation.Feb_10_2024_Day21_Keyboard_Actions_in_Selenium;

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

public class Example2 {
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
    
        driver.get("https://tutorialsninja.com/demo/");
    }

    @Test
    public void KeyBoardActions() throws Exception {
    	driver.findElement(By.linkText("My Account")).click();;
    	driver.findElement(By.linkText("Register")).click();; 
        WebElement Firstname = driver.findElement(By.id("input-firstname"));
        WebElement Lastname = driver.findElement(By.id("input-lastname"));
        WebElement password = driver.findElement(By.id("input-password"));
        WebElement Confirmpassword = driver.findElement(By.id("input-confirm"));
        WebElement ContinueButton = driver.findElement(By.xpath("//input[@value='Continue']"));

        Actions action = new Actions(driver);
        
       
        action.click(Firstname).sendKeys("Selenium").perform();
        action.click(Lastname).sendKeys("Panda").perform();
        action.click(password).sendKeys("Selenium@123").perform();

        // Clear the Confirm Password field before pasting
        Confirmpassword.clear();

        // Selecting all - CTRL + A      and      CTRL + C  For    Copy
        action.keyDown(password, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        action.keyDown(password, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        // Switch focus to Confirm Password and paste
        action.click(Confirmpassword).perform();
        action.keyDown(Confirmpassword, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        // Continue with the rest of the actions
        action.click(ContinueButton).perform();
    }

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }
}
