package com.TestNG.Jan_16_Day15_Application_Of_OOPs;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
/* I will create a Constructor of this Testbase Class and write the properties file code in the constructor and 
 * I will use that Constructor in all the Child Classes             */
     public TestBase() throws Exception{
	 prop = new Properties();
       ip = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\java\\com\\TestNG\\Jan_16_Day15_Application_Of_OOPs\\config.properties");
       prop.load(ip);
}
	
	public WebDriver initializeBrowserAndOpenApplication(String browserName) {
		
		if (browserName.equals("chrome"))  {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}else if(browserName.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((10)));
		driver.get("https://tutorialsninja.com/demo");
		return driver;
}
}

