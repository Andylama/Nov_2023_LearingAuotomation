package com.automation.Dec_11_2023_Day5_Xpaths;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	// There are typically 8 different syntaxes for Dynamic Xpath
	// There are certain functions which can be used in Dynamic Xpath
	// Theere are certain keyword which can be used in  Dynamic Xpath
	// Dynamic Xpath is also known as Relative Xpath or Customized Xpath as it is customized by the Automation Tester
    // What is the Catch in writing Xpath?
	// Make sure the Xpath is 1 of 1 in the Chorome Browser Edtior
	// How will you open the Chrome Browser Editor ?
	// Once you right click on WebElement and the DOM opens. Simply press CTRL + F of your keyboard
	
	// Syntax 1:
	//    //   html     [@attribute  =    'Valueofthatattribut']
	
	//    //   input    [@class      =     'btn btn-primary']
	
	// Syntax 2:
	//    //   html   [@attribute1 = 'Value1'    and   @atattribute2 = 'Value2']
	
	// Syntax 3:
	//    //  html    [@attribute1 = 'Value1'    or    @atattribute2 = 'Value2']
	
	
	
	
public static void main(String[] args) {
                   TutorialsninjaLogin();
	             //tutorialsninjaRegister( );
                   
}
public static void  TutorialsninjaLogin() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath(" // input [@id     =  'input-email']   ")) .sendKeys("seleniumpanda20@gmail.com");
	driver.findElement(By.xpath(" // input [@id     =  'input-password']")) .sendKeys("Selenium@123");
	// not able to click on Login button
	driver.findElement(By.xpath(" // input [@class  = 'btn btn-primary']")) .click();
}




public static void tutorialsninjaRegister( ) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.linkText("My Account")).click();	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.xpath("//input [@id  = 'input-firstname']")).sendKeys("Selenium");
	driver.findElement(By.xpath("//input [@id  = 'input-lastname' ]")).sendKeys("Master");
	driver.findElement(By.xpath("//input [@id  = 'input-email']")).sendKeys("seleniumpanda20@gmail.com");
	driver.findElement(By.xpath("//input [@id  = 'input-telephone']")).sendKeys("987654310");
	driver.findElement(By.xpath("//input [@id  = 'input-password' ]")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//input [@id  = 'input-confirm' ]")). sendKeys("Selenium@123");
	driver.findElement(By.xpath("//input [@name  = 'agree']")).click();
	driver.findElement(By.xpath("//input [@class  = 'btn btn-primary']")).click();
	
	
}
}
	
	
	


