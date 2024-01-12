package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions_Assert {

	
	public WebDriver driver ;
	
	
	
	
	@BeforeMethod
	public void loginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");	
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
//---------------------------------------------------------------------------------------------	
/*	@Test(priority =0 enabled = false)
	public void explainAssertions() {
		
/*assertTrue(), assertfalse(),assertNotTrue(),assertNotFalse(),assertEquals(),assertNotEquls() 
 *    This condition  is True so This will pass.                 */		
	//	Assert.assertTrue(1<2);  
/*    This conition is also True so this will pass.                      */		
	//	Assert.assertFalse(1<2);
/*        True(false)  -----This leads to  false                          */			
		//Assert.assertTrue(1!=1);
		
/*        True(false)  -----This also leads to  false                     */			
	//	Assert.assertTrue(true == false);
/*        Equals between two entities, false and true leads to false. so final is false               */					
	//Assert.assertEquals(false, true);
/*        This whole condition is True                                        */						
	//	Assert.assertNotEquals(false, true);	
		
		
/*                 Compare these two string using Assertions  */	
	/*	String s1 = "I  am  Java"	;
	    String s2 = "I  am  Python";
	    Assert.assertEquals(s1, s2);  // Output will be False
        Assert.assertNotEquals(s1, s2); // Output will be True
        Assert.assertTrue(s1.equals(s2));// Output will be False
        Assert.assertTrue(!(s1.equals(s2)));// Output will be True
        
      String  actualWarningMessage = driver.findElement(By.xpath("(//div[@class='alert alert-danger alert-dismissible'])[1]")).getText();     
      String expectedwarningMessage ="Warning: No match for E-Mail Address and/or Password.";
      Assert.assertTrue(actualWarningMessage.contains(expectedwarningMessage));
      Assert.fail();
      Assert.fail("Deliberately failling it");*/
	
	
	
//---------------------------------------------------------------------------------------------	
	@Test(priority =1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("Automationlama16@myyahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		/*  First you need to decide what you need to Assert Second you highlight or objectify that WebElement
		    Third you apply Assertion */
		WebElement editYourAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
		WebElement LogoutLink = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(editYourAccountInfoLink.isDisplayed() && LogoutLink.isDisplayed());
}
	@Test(priority =2)
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("Wrongemail@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Wrongpassword");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
		String actualWarningMessage =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();     
		String expectedWarningMessage ="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
}
	@Test(priority =3)
	public void verifyLoginWithValidEmailInvalidPassword() {
		
		driver.findElement(By.id("input-email")).sendKeys("Automationlama16@myyahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("Wrongpassword");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();     
		String expectedWarningMessage ="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
}
	@Test(priority =4)
	public void verifyLoginWithEnvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("Wrongemail@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();     
		String expectedWarningMessage ="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
}
	@Test(priority =5)
	public void verifyLoginWitNoCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage =driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();     
		String expectedWarningMessage ="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
}	
}