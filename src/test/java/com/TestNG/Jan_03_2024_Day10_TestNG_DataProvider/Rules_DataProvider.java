package com.TestNG.Jan_03_2024_Day10_TestNG_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*      @DataProvider in the same Class:----

Rule 1: Returns a 2-Dimensional Object Array
Rule 2: Passes Data in Rows and Columns 
Rule 3: Connects to Test Method 
Rule 4: Parameterizes Test Method  */
public class Rules_DataProvider {
	@Test(dataProvider = "getData")//Rule 3
	public void loginTest(String username,String password, int emp_id,String browser) {// Rule 4 
	System.out.println(username+ "----"+password+"---"+emp_id+"--"+browser+"--")	;
}	
	@DataProvider
	public Object[] [] getData() {   //Rule 1
		   Object[] [] data = new Object [3][4];// Rule 2     // Rows are :3 and Columns are :4
		
		data  [0] [0]      = "username1";
		data  [0] [1]      = "password1";
		data  [0] [2]      =  98765451 ;	  
		data  [0] [3]      = "Chrome"   ;
				
		data  [1] [0]      = "username2";
		data  [1] [1]      = "password2";
		data  [1] [2]      =  98765455  ;	
		data  [1] [3]      = "Safari"   ;	
		
		data  [2] [0]      = "username3";
		data  [2] [1]      = "password3";
		data  [2] [2]      =  98765456 ;	
		data  [2] [3]      = "Edge"   ;
		return data;	
}
}