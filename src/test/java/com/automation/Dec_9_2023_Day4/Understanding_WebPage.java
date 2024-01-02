package com.automation.Dec_9_2023_Day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_WebPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");
		
		//WebElement signinLink = driver.findElement(By.className("signin"));
		//signinLink.click();
		//WebElement usernameTextBox = driver.findElement(By.id("login1"));
		//usernameTextBox.sendKeys("Seleniumpanda@rediffmail.com");
		//WebElement passwordTextBox = driver.findElement(By.name("passwd"));
		//passwordTextBox.sendKeys(" Selenium@123 ");
		//WebElement signinButton = driver.findElement(By.className("signinbtn"));
		//signinButton.click();
		//WebElement logoutLink = driver.findElement(By.className("rd_logout"));
		//logoutLink.click();
		
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.name("passwd" )).sendKeys(" Selenium@123 ");
		driver.findElement(By.className(" signinbtn ")).click();
		driver.findElement(By.className("rd_logout")).click();
		
	}
	

}
