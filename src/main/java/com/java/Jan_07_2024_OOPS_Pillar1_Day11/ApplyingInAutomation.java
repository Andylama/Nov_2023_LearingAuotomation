package com.java.Jan_07_2024_OOPS_Pillar1_Day11;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.Dec_30_2023_Day9_SpecialClasses.Util;


public class ApplyingInAutomation {
public static WebDriver driver;
	


	public static void main(String[]args) {
		tutorialsNinjaLogin("https://tutorialsninja.com/demo/","seleniumpanda@gmail.com","Selenium@123");
		rediffLogin("https://www.rediff.com/","seleniumpanda@rediffmail.com","Selenium@123");
		registerTN("https://tutorialsninja.com/demo/","Ram", "Guru", "123-568-3265","Ram@2023","Ram@2023");
}
    public static void tutorialsNinjaLogin(String url,String email, String password) {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
	  driver.get(url);
	  driver.findElement(By.linkText("My Account")).click();
	  driver.findElement(By.linkText("Login")).click();
	  driver.findElement(By.id("input-email")).sendKeys(email);
	  driver.findElement(By.id("input-password")).sendKeys(password);
	  driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	  driver.quit();
}
//-------------------------------------------------------------------------------
   	   
  public static void rediffLogin(String rediffUrl, String rediffUsername, String rediffPassword)  {

	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
	  driver.get(rediffUrl);
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.id("login1")).sendKeys(rediffUsername);
	  driver.findElement(By.id("password")).sendKeys(rediffPassword);
	  driver.findElement(By.cssSelector("input.signinbtn")).click();
	  driver.quit();
  
  }
 //---------------------------------------------------------------------------------
  public static void registerTN(String tnUrl, String firstname, String lastname, String telephone, String password, String confirPass) {
  
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
	  driver.get(tnUrl);  
	  driver.findElement(By.linkText("My Account")).click();
	  driver.findElement(By.linkText("Register")).click();
	  driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@name='firstname']")).sendKeys(firstname); 
	  driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@name='lastname']")). sendKeys(lastname);
	 driver.findElement(By.xpath("//fieldset[@id='account']/descendant::input[@name='email']")). sendKeys(Util.emailWithDateTimeStamp());
	  	driver.findElement(By.xpath(" //aside[@id='column-right']/preceding::input[@id='input-telephone'] ")).sendKeys(telephone);
	  	driver.findElement(By.xpath("//input[@type='tel']/following::input[@name='password'] ")).sendKeys( password);
	  	driver.findElement(By.xpath(" //input[@id='input-confirm'] ")).sendKeys(confirPass);
	  	driver.findElement(By.name("agree")).click();
	 	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	 	driver.quit();
}
}