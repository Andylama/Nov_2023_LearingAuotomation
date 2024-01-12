package com.TestNG.Jan_03_2024_Day10_TestNG_DataProvider;

import org.testng.annotations.DataProvider;
                  //@DataProvider in a different Class.//
public class DataProviders_Only {
	
	@DataProvider
	public Object[][] getDataTN() {     //Rule 1
		   Object[][]  data = {{"Seleniumpanda@gmail.com",    "Selenium@123",     } ,  //Rule 2
		                       {"Seleniumpanda1@gmail.com",    "Selenium@123",    } ,
		                       {"Seleniumpanda2@gmail.com",    "Selenium@123",    } ,
		                       {"Seleniumpanda3@gmail.com",    "Selenium@123",    } ,
		                       {"Seleniumpanda4@gmail.com",    "Selenium@123456", }};
		  return data ;                  
}	
//---------------------------------------------------------------------------------------
	
	@DataProvider
	public Object[][] getDataRediff() {     //Rule 1
		   Object[][]  data = {{"Seleniumpanda@rediffmail.com",    "Selenium@123",     } ,  //Rule 2
		                               
		                       {"Seleniumpanda1@rediffmail.com",    "Donkey@123", }};
		  return data ;                  
	
}
}