package com.automation.Dec_9_2023_Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explanation_Again {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		// You want to click on Business Email Link
		
		driver.findElement(By.className("bmailicon relative")).click();

	}

}
