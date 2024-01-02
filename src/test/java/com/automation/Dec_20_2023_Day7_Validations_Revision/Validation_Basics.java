package com.automation.Dec_20_2023_Day7_Validations_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Basics {
	
	// Wht is Validation-comparing the actual output with the expected output.

	public static void main(String[] args) {
	    // WebpageValidation();
		// WebElementValidation() ;
		   integerBooleanValidation();
	}

	 public static void WebpageValidation() {
		 // getTitle()
		 // getCurrentUrl()
		 // Step 1 - First you need to know wht is the title of the webpage and what is the currnt url of the webpage
	
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://rediff.com");
	    // What is the title of this landingpage?
	 System.out.println("Title of the Landingpage of rediff is:-   "+ driver.getTitle());
	 String actualTitle = driver.getTitle();
	 String expectedTitle =   "Rediff.com: News | Rediffmail | Stock Quotes | Shopping"  ;
	 
	 if ( actualTitle.equals(expectedTitle  )) {
		 System.out.println("Rediff url is working fine");
	 }  else {
		 System.out.println(" The Url is not correct   ");
	 }
	 
	 }
	 
	 
	 public static void WebElementValidation() {
		 // isDisplayed()
		 //isEnabled()
		 // isSelected()
		 // You want to verify all the header links are enabed and displayed.
		 // Money, Videos, Business Email, Shooping, Sign in and Create Account - These links are present and enabled
		 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rediff.com");	 
		 WebElement moneyLink = driver.findElement(By.linkText("Money"));
		 WebElement businessmailLink = driver.findElement(By.linkText("Business Email"));
		// WebElement shoppingLink = driver.findElement(By.linkText("Shopping"));
		 //WebElement videosLink = driver.findElement(By.linkText("Videos"));
		// WebElement signinLink = driver.findElement(By.linkText("/Sign in"));
		// WebElement createaccountLink = driver.findElement(By.linkText("Create Account"));
		
		 if (moneyLink.isDisplayed()  &&  moneyLink.isEnabled() && businessmailLink.isDisplayed()  && businessmailLink.isEnabled()) {
		 System.out.println("The validation are correct");
		 } else{
		System.out.println("Validation are incorrect")	;
		 }
	 }
public static void integerBooleanValidation() {
	 
	 int A = 3 ;  //3
	 int B = 1 ;  //1
	 if ( A < B  || B > A) { // A less than B   or   B grater tha A
		 System.out.println("logic is correct ");
	 } else {
		 System.out.println("Incorrect Because A is not less than B and B is not grater than A");
	 }
	 }
}