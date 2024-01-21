package com.TestNG.Jan_20_2024_Day16_Application_Of_OOPS_Encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	@FindBy(linkText= "My Account")
	private WebElement myAccountDropDown;// data hiding
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	public void clickOnMyAccountDropdown() {
		myAccountDropDown.click();
	}
}
