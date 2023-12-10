package com.automaton_Nov_30_2023_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();  // Ctrl+Shift+o   To import drivers//
        driver.manage().window().maximize();
        driver.get("https://rediff.com");
        driver.findElement(By.className("signin")).click();
        driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
        driver.findElement(By.id("password")).sendKeys("Selenium@123");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("rd_logout")).click();
        driver.quit();
        
        
        
        // If you want to open  in EdgeBrowser    //
        WebDriver driver1 = new EdgeDriver();   // Ctrl+Shift+o   To import drivers//
        driver1.manage().window().maximize();
        driver1.get("https://www.flipkart.com");
        driver1.quit();
        
        
	}

}