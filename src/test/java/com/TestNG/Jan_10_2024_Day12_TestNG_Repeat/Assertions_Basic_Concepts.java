package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;

import org.testng.annotations.Test;

public class Assertions_Basic_Concepts {
		/* Asserttion a Webpage at how many Level :- 1. getTiTle()
                                                  2. getCurrentUrl()
                                                 3. getPageSource ()           
                                               
         Assert a WebElement:- 1.isEnabled()
                               2.isDisplayed()
                               3.isSelected()                                                                   */

	
	@Test
	public void mathmatics() {
		System.out.println("Begin");
		System.out.println(2+3);
		System.out.println(5/0);//There is an arithmetic exception
		System.out.println("End");
	}
}
