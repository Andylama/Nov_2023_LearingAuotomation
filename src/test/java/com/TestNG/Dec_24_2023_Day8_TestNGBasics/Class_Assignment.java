package com.TestNG.Dec_24_2023_Day8_TestNGBasics;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_Assignment {
	//Declare the WebDriver at a Global Level.
	//@BeforMethod write the code of opening tutorialsninja.
	//@Test - Login Test.
	//@Test - Register Test.
	//@AfterMethod -Close the Browser.
	//Set priorities for both the Test cases.
	//Also no need to use enabled = False rather use enabled = True.
public WebDriver driver;
	
//-------------------------------------------------------------------------------------	
	@BeforeMethod
	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--Sttart-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation ", "disable-infobars"));
        driver = new ChromeDriver(options);
        driver .get("https://tutorialsninja.com/demo");
        driver.findElement(By.linkText("My Account")).click();
  }
//------------------------------------------------------------------------------	
	
	@Test(priority =1)
	public void LoginOption()  {
		driver.findElement(By.linkText("Login")).click();	
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(" Automationlama@myyahoo.com");
		driver.findElement(By.cssSelector(" input#input-password")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@value='Login']")).click(); 
	}
//------------------------------------------------------------------------------------------
	
	@Test(priority =2)
	public void registerOptiion() {	
		driver.findElement(By.linkText("Register")).click();
    	driver.findElement(By.cssSelector(" input#input-firstname")).sendKeys("Automation");
     	driver.findElement(By.cssSelector(" input#input-lastname")).sendKeys(" Lama");
     	driver.findElement(By.cssSelector(" input#input-email")).sendKeys(" Automationlama@myyahoo.com");
        driver.findElement(By.cssSelector(" input#input-telephone")).sendKeys(" 1234567890");
        driver.findElement(By.cssSelector(" input#input-password")).sendKeys("Selenium");
        driver.findElement(By.cssSelector(" input#input-confirm")).sendKeys("Selenium");
        driver.findElement(By.cssSelector(" fieldset#account+fieldset+fieldset>div>div>label:nth-child(1)>input\r\n"
        		+ "  ")).click();
    	driver.findElement(By.cssSelector("input[name=agree] ")).click();
    	driver.findElement(By.cssSelector("input.btn.btn-primary ")).click();     		
	}	
//--------------------------------------------------------------------------------------------	
	
	@ AfterMethod
	public void TearDown() {
	driver.quit();
	}	
}
//----------------------------------------------------------------------------------------	
	
