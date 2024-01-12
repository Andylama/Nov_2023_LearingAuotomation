package com.automation.Jan_08_2024_Day11_ApplicationofMethodsInAutomation;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1 {
	
	public WebDriver driver;//Instance variable- Class variable Non Static
	@Test
	public void initializeBrowserAndOpenApplication()  {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get("https://tutorialsninja.com/demo/");
		
		
	}
	
}

