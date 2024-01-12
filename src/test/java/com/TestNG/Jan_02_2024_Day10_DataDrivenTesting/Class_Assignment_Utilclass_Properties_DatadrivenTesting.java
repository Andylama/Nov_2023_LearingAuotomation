package com.TestNG.Jan_02_2024_Day10_DataDrivenTesting;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.java.Dec_30_2023_Day9_SpecialClasses.Util;

public class Class_Assignment_Utilclass_Properties_DatadrivenTesting {
	         //How to read from Properties file.//   
	
		/*   What is proprties file ? It has .properties extension and it is basically stores the following types of data :- 1. The basic configured data
		 *   of the application -URL, Browser, ValidEmail, ValidPassword. 2.The system response generated data. 3.User input data.        
		 *   Why use Properties file ? When We write industry staandard code we should not hardcode our data i.e. , our data should not be visible in the
		 *   code directly rather it should be customized . Hence we use properties file.            */
				
	  public static Properties prop ;
	  public static Properties dataprop;
	  public static FileInputStream ip ;
	  public static FileInputStream ip1;
	  public static WebDriver driver;
	  
	  public static void main(String[] args) throws Exception {
			/* Step 1:  Create a properties file.
			   Step 2:  The data should be saved in key = value.
			   Step 3:  Create the Object of Properties Class.
			   Step 4:  Create the Object of FileInputStream class and pass the path of the properties file in the constructor object. 
			   Step 5:  Load the file.                         */
					
			
  
		 prop = new Properties();
		 ip   = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\java\\com\\TestNG\\Jan_02_2024_Day10_DataDrivenTesting\\config.properties") ; 
	     prop.load(ip);                                              
	         
	     dataprop =  new Properties();
	     ip1      =  new FileInputStream(System.getProperty ("user.dir") +"\\src\\test\\java\\com\\TestNG\\Jan_02_2024_Day10_DataDrivenTesting\\testdata.properties") ; 
		 dataprop.load(ip1);   
		 
		 
		            //    validLoginTest();
		          //     invalidLoginTest();
		verifyRegisterWithMandatoryFields();
		 //   verifyRegisterWithNoFields();
 }	
//----------------------------------------------------------------------------------------	
 
	 
	  public static void verifyRegisterWithMandatoryFields() throws Exception {   
	    	driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get(prop.getProperty("url")); 
	 		Thread.sleep(2000);
	 		driver.findElement(By.linkText("My Account")).click();
	 		Thread.sleep(3000);
	 		driver.findElement(By.linkText("Register")).click();
	 		Thread.sleep(2000);
	 		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(prop.getProperty("firstname"));
	 	 	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(prop.getProperty("lastname"));
	       	driver.findElement(By.cssSelector("input#input-email")).sendKeys(Util.emailWithDateTimeStamp());
	        driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(prop.getProperty("telephone"));
	        driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("password"));
	        driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
	        driver.findElement(By.name("agree")).click();
	        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    	String actualSucessMessage =driver.findElement(By.xpath("//div[@id ='content']/child::p[1]")).getText();
			String expectedSucessMessage = prop.getProperty("accountSuccess");
			Assert.assertTrue(actualSucessMessage.contains(expectedSucessMessage));
			driver.quit();
	}
//-------------------------------------------------------------------------------------------------------------------------
	  
 
	public static void validLoginTest() {			  
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url")); 
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
	driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	driver.quit();
	}
//--------------------------------------------------------------------------------------------------

	
     public static void invalidLoginTest() {
    	    driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.get(prop.getProperty("url")); 
    		driver.findElement(By.linkText("My Account")).click();
    		driver.findElement(By.linkText("Login")).click();
    		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
    		driver.findElement(By.id("input-password")).sendKeys(dataprop.getProperty("invalidPassword"));
    		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    		String actualWarningMessage   = driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText();
    		String expectedWarningMessage = dataprop.getProperty("emailPasswordMismatchWarning");
    		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
    		driver.quit();
 }
//------------------------------------------------------------------------------------------
     
     
          
     public static void verifyRegisterWithNoFields() {    
        driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get(prop.getProperty("url")); 
  		driver.findElement(By.linkText("My Account")).click();
  		driver.findElement(By.linkText("Register")).click();	 
  		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
  		driver.findElement(By.cssSelector("input.btn.btn-primary ")).click(); 
  		
  		String actualPrivacyPolicyWarning =driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
  		String expectedPrivacyPolicyWarning = prop.getProperty("privacyPolicyWarning");
  		Assert.assertTrue(actualPrivacyPolicyWarning.contains(expectedPrivacyPolicyWarning));
  		
  		
  		String actualFirstnameWarning =driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
  		String expectedFirstnameWarning = prop.getProperty("firstNameWarning");
  		Assert.assertTrue(actualFirstnameWarning.contains(expectedFirstnameWarning));
  		
  		
  		String actualLastnameWarning =driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText();
  		String expectedLastnameWarning = prop.getProperty("lastNameWarning");
  		Assert.assertTrue(actualLastnameWarning.contains(expectedLastnameWarning));
  		
  		
  		String actualEmailWarning =driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
  		String expectedEmailWarning = prop.getProperty("emailWarning");
  		Assert.assertTrue(actualEmailWarning.contains(expectedEmailWarning));
  		
  		
  		String actualTelephoneWarning =driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
  		String expectedTelephoneWarning = prop.getProperty("telephoneWarning");
  		Assert.assertTrue(actualTelephoneWarning.contains(expectedTelephoneWarning ));
  		
  		
  		String actualPasswordWarning =driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText();
  		String expectedPasswordWarning = prop.getProperty("passwordWarning");
  		Assert.assertTrue(actualPasswordWarning.contains(expectedPasswordWarning)); 	
  		driver.quit();
  	}		
  		
  	
  		
     } 	 
     
