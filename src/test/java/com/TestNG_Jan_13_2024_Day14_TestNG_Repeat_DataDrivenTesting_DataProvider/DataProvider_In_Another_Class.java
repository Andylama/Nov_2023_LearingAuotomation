package com.TestNG_Jan_13_2024_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.testng.annotations.DataProvider;

public class DataProvider_In_Another_Class {
	
	@DataProvider
	public Object [][] getData() {
		   Object[][] data = new Object [3][4];
        
	    data[0][0] = "chrome";
        data[0][1] = "username1";
        data[0][2] = "password1";
        data[0][3] = 98765432;

        data[1][0] = "firefox";
        data[1][1] = "username2";
        data[1][2] = "password2";
        data[1][3] = 98765433;

        data[2][0] = "edge";
        data[2][1] = "username3";
        data[2][2] = "password3";
        data[2][3] = 98765434;
        return data;
        

}
}