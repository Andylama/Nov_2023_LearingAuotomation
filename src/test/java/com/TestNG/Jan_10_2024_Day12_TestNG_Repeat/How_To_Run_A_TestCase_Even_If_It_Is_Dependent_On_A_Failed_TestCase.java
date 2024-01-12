package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class How_To_Run_A_TestCase_Even_If_It_Is_Dependent_On_A_Failed_TestCase {
	
	
	
	
	public WebDriver driver;
	@BeforeMethod
	public void loginSetup() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");

}
@Test(priority=1)
	   public void clickOnMyAccountLink() {
	  driver.findElement(By.linkText("My Account")).click();
		
	}
@Test(priority= 2,dependsOnMethods = "clickOnMyAccountLink" )
      public void clickOnLoginOption() {
	  driver.findElement(By.linkText("My Account")).click();
	  driver.findElement(By.linkText("Login")).click();
}
@Test(priority= 3, dependsOnMethods= {"clickOnMyAccountLink","clickOnLoginOption"})
     public void login() {
	 driver.findElement(By.linkText("My ccount")).click();
	 driver.findElement(By.linkText("Login")).click();
	 driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	 driver.findElement(By.id("input-password")).sendKeys("Selenium");
	 driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}
/*   If a Testcase is dependent on another Test case and that Test cae fails, then this Test case will be skipped 
     Enabled = false will always take precedence and it is powerful annotaion.                                   */   

@Test(priority= 4, dependsOnMethods= {"clickOnMyAccountLink" ,"clickOnLoginOption","login"}, alwaysRun =true,enabled= false)
    public void logout() {
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	driver.findElement(By.linkText("Logout")).click();
}
@AfterMethod
    public void tearDown() {
	driver.quit();
}
}

