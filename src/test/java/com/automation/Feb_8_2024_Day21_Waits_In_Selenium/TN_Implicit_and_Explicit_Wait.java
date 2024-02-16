package com.automation.Feb_8_2024_Day21_Waits_In_Selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TN_Implicit_and_Explicit_Wait {

	public WebDriver driver;
	public WebDriverWait wait ;
	
	@BeforeMethod
	public void LaunchUrL() {
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
			
		
	}
	
	
	
	@Test(priority =1)
	public void tnImplicitWaitTest() {
		
		
		
		/* Implicit wati is smart form of wait.
		 * What if the WebElement does not shou up till the the mentioned wait time?
		 * This Implicit wait will fail the execution and it will display some kind of Exception.                                                         */
		
	}
	

	@Test(priority =2)
	public void tnExplicitWaitTest() throws Exception {
/*   
 *   >>Thread.sleep(3000); is not  smart. It is rigid.    It is an example of Explicit Wait. No matter what it will
	  wait out the whole duration.   
	  
	   I want my Explicit wait to be smart as well. 
  
	>> WaitDriver Wait: is also example of  Explicit Wait. It allows you to wait for conditons such
	   as the presence of an element, its visibiltiy,clickability etc.  The UNTIL method of WebDriverWait is used
	   to define the expected condition and the WebDriver will wait until that condition is met.
	 
	 Steps to Use WebDriverwait:
	 
     Step 1: Create the Object Of WebDriverWait Clas
	 Step 2: In the constructor you have to pass 2 Parameters- driver refrence and
	         the other one is Duration class.  
	 Step 3: Use the wait reference and call the until Method. Overload the until Method with ExpectedCondition class.
	 Step 4: Use the ExpectedConditions class to call any ot the Methods as per requirment.                                            */                  		
		
		
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Account"))).click();
		/* Let's say My Account is misbehaving  we can use WebDriverWait         */	
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-email"))).sendKeys("seleniumpanda@gmail.com");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("input-password"))).sendKeys("Selenium@123");
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']"))).click();
		
		

    }
	@ AfterMethod
	public void TearDown() {
		driver.quit();	
	
}
}