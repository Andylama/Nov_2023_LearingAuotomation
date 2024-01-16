package com.TestNG_Jan_13_2024_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders_SeparateClass {

	@DataProvider 
	public Object[] [] TNLoginData() {
		   Object [][] data= {{"seleniumpanda@gmail.com",    "Selenium@123"},
			            	{"seleniumpanda1@gmail.com",   "Selenium@123"},
			            	{"seleniumpanda2@gmail.com",   "Selenium@123"},
			            	{"seleniumpanda3@gmail.com",   "Selenium@123"},
			            	{"seleniumpanda4@gmail.com",   "Selenium@123"},
			            	{"seleniumpanda5@gmail.com",   "Selenium@123"},
			            	{"seleniumpanda6@gmail.com",   "Selenium@123"},
		            		{"seleniumpanda7@gmail.com",   "Selenium@123"}};
		
		return data ;
		
	
	}
	@DataProvider 
	public Object[] [] rediffLoginData() {
	    	Object [][] data= {{"seleniumpanda@rediffmail.com",   "Selenium@123"},
				           	{"seleniumpanda1@rediffmail.com",   "Donkey@123"},
			            	{"homarahimi@rediffmail.com",	  "Winter2021? "}};
			
			return data ;	
		
}
}