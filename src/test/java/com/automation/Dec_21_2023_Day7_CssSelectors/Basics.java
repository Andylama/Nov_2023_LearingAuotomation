package com.automation.Dec_21_2023_Day7_CssSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Basics {
	                      // html[@ attribute = 'value'] :---- Syntax for Xpath
	                     //  html    [attribute = value]  :----Syntax for Css Selector
	

	public static void main(String[] args) {
		
		//redifflogin();
		Tutorialsninja();
		//Tutorial();
}
//----------------------------------------------------------------------------------------------------------------------	
	   public static  void redifflogin() {
		WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.get("https://rediff.com");  
		driver.findElement(By.cssSelector("a[class=signin]")).click();  // Css Selector
		driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[class=signinbtn]")).click(); 
}
//-----------------------------------------------------------------------------------------------------------------------

public static  void Tutorialsninja() {
	WebDriver driver = new ChromeDriver (); 
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");  
	driver.findElement(By.linkText("My Account")).click();  
	driver.findElement(By.linkText("Login")).click();  
	driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys(" seleniumpanda20@gmail.com");
	driver.findElement(By.cssSelector("input[name=password]")).sendKeys(" Selenium@123");
	driver.findElement(By.cssSelector("input[value=Login]")).click();
	driver.findElement(By.linkText("Forgotten Password")).click(); 
}	
//-----------------------------------------------------------------------------------------------
public static  void Tutorial() {
	WebDriver driver = new ChromeDriver (); 
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");  
	driver.findElement(By.linkText("My Account")).click();  
	driver.findElement(By.linkText("Login")).click();  
	driver.findElement(By.cssSelector("input[id=input-email]")).sendKeys(" seleniumpanda20@gmail.com");
	driver.findElement(By.cssSelector("input[name=password]")).sendKeys(" Selenium@123");
	driver.findElement(By.cssSelector("input[value=Login]")).click();
}	
//------------------------------------------------------------------------------------------------	
	



}
//----------------------------------------------------------------------------------------------
