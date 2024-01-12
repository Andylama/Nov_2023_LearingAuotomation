package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1_RediffLogin {
	
	
public WebDriver driver ;
	
	
	@BeforeMethod
	public void loginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");	
		driver.findElement(By.linkText("Sign in")).click();
}
	
	
	@Test(priority =1)
	
	/* 1.  Assert the Logout 2. Objectify the Logout link. 3. Assert the presence of Logout link   */
	public void verifyRediffLoginWithValidCredentials() {    //1.Valid Credentials
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Donkey@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		
		WebElement LogoutLink = driver.findElement(By.className("rd_logoutt"));
		Assert.assertTrue(LogoutLink.isDisplayed(), "I could not find the Logout LInk");
	}	
	
	
	@Test(priority =2)
	public void verifyRediffLoginWithIncorrectUsernameCorrectPassword() {   //2. Incorrect Username Correct Password
		driver.findElement(By.id("login1")).sendKeys("Incorrect@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Donkey@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[@id='div_login_error']")).getText();		
		String expectedWarningMessage ="Wrong username and password combination.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	
	@Test(priority =3)
	public void verifyRediffLoginWithCorrectUsernameIncorrectPassword(){   //3. Correct Username Incorrect Password
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Incorrect");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[@id='div_login_error']")).getText();		
		String expectedWarningMessage ="Wrong username and password combination.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	
	@Test(priority =4)
	public void verifyRediffLoginWithIncorrectBothUsernameAndPassword(){   //4. Incorrect Both Username & Password
		driver.findElement(By.id("login1")).sendKeys("Incorrect@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Incorrect");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[@id='div_login_error']")).getText();		
		String expectedWarningMessage ="Wrong username and password combination.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}
	
	
	@Test(priority =5)
	public void verifyRediffLoginWithNoCredentials(){   //5. No Credentials
			
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Alert alert =driver.switchTo().alert();
		String actualAlertMessage = alert.getText();
		String expectedAlertMessage ="Please enter a valid user name";
		Assert.assertEquals(actualAlertMessage,expectedAlertMessage);
		alert.dismiss();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
}

}
		
		
		
		
		
		
		
		
		
		
		