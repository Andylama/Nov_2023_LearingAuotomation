package com.TestNG_Jan_13_2024_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;

import org.testng.annotations.Test;

public class TestCase_In_AnotherClass {
	/*    How to connect @Test with @DataProvider which resides in another class
	 *  @Test(dataProvider= "nameofthe@DataProvider", dataProviderClass = nameoftheClass@DataProvider.class)                     */
	
	@Test(dataProvider = "dataCheck",dataProviderClass = DataProvider_In_Another_Class.class)
	public void tryingToConnectWithDataProviderInAnotherClas(String browserName, String username, String password, int mobile) {
        // ... test logic using the provided data ...
        System.out.println(browserName + "--" + username + "--" + password + "--" + mobile + "--");
        {
		
	}
	}
}

