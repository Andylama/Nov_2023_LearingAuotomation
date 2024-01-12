package com.TestNG.Jan_03_2024_Day10_TestNG_ExcelSheet_DaatProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.java.Dec_30_2023_Day9_SpecialClasses.Util;

public class TestCases {
	
	public WebDriver driver;
	@Test(priority =1, dataProvider ="getTNExcelData", dataProviderClass = ExcelCode.class)  //Rule:3
	
	public void LoginTNTest(String email, String password)  {  //Rule: 4
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/"); 
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@Test(priority =2, dataProvider ="getTNExcelLoginData",dataProviderClass = ExcelCode.class)
	public void registerTNTTest(String firstname,String lastname, String telephone,String password,String confirmpassword) {   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/"); 
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstname);
     	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastname);
       	driver.findElement(By.cssSelector("input#input-email")).sendKeys(Util.emailWithDateTimeStamp());
        driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
        driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
        driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmpassword);
       	driver.findElement(By.cssSelector("input[name=agree]")).click();
    	driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); 	
		String actualAccountSucessMessage =driver.findElement(By.xpath("//div[@id ='content']/child::p[1]")).getText();
		String expectedlAccountSucessMessage = "Congratulations! Your new account has been successfully created!";
		Assert.assertTrue(actualAccountSucessMessage.contains(expectedlAccountSucessMessage));
		
	}
	
	@Test(priority= 3,dataProvider="getRediffExcelLoginData",dataProviderClass = ExcelCode.class)
	public void rediffLogin(String username,String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();	
}
	
	
@AfterMethod
public void tearDown() {
driver.quit();
}

}