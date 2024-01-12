package com.TestNG.Jan_02_2024_Day10_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
               //How to read from Properties file.// 
     public class ReadFromPropertiesFile {
/*   What is proprties file ? It has .properties extension and it is basically stores the following types of data :- 1. The basic configured data
 *   of the application -URL, Browser, ValidEmail, ValidPassword. 2.The system response generated data. 3.User input data.        
 *   Why use Properties file ? When We write industry staandard code we should not hardcode our data i.e. , our data should not be visible in the
 *   code directly rather it should be customized . Hence we use properties file.            */
	
	public static Properties prop;
    public static FileInputStream ip;
	public static void main(String[] args) throws IOException, InterruptedException {
/* Step 1:  Create a properties file.
   Step 2:  The data should be saved in key = value.
   Step 3:  Create the Object of Properties Class.
   Step 4:  Create the Object of FileInputStream class and pass the path of the properties file in the constructor object. 
   Step 5:  Load the file.                         */
		
	prop = new Properties();
	ip   = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\TestNG\\Jan_02_2024_Day10_DataDrivenTesting\\config.properties");
             prop.load(ip);
                  login() ;
        
	}

	public static void login() throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url")); 
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("ValidEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("ValidPasswrod"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	
}
