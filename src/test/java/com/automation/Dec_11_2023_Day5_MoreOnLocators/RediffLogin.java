package com.automation.Dec_11_2023_Day5_MoreOnLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RediffLogin {
public static void main(String[] args) {
	                //   redifflogin();
	             TutorialsninjaLogin();   
}	
public static void redifflogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
        driver.findElement(By.className("signin")).click();
        driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
        driver.findElement(By.id("password")).sendKeys("Selenium@123");
        driver.findElement(By.className("signinbtn")).click();
        driver.findElement(By.className("rd_logout")).click();
        driver.quit();
}
	
	
	
public static void  TutorialsninjaLogin() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda!@gmail.com");
	driver.findElement(By.id("input-passwowrd")).sendKeys("Selenium@123");
	//Login button I cannot use By.ClassName because it is a compounded value and it will not work
	//so we have to learn Xpath and cssSelector
	//driver.quit();
}
}