package com.TestNG_Jan_13_2024_Day14_TestNG_Repeat_DataDrivenTesting_DataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_In_The_Same_Class_With_TestCase {
	
	/*         Parameterization:- There is  a Logic You can use multiple inputs ovet that logic. Whatever the
	 *          output is that you will record.
	 * 
	           DataProvider in TestNG
	           Excel Sheet using DataProvider 
	           DataProvider is an annotation in TestNG. It is represented as @ DataProvider
	           
	           
	           
	 ------------  Rules associated with @DataProvider---------------------
	         *  Rules 1. It returns a 2 Dimensioanl Array
	         *  Rules 2. You have to pass the data in forms or rows and columns
	         *  Rules 3. You have to connect the @Test case with the @DataProvider. There are two ways to acheive this:--
	                         1. First way: pass dataProvider = "Name of the Mehtod in @DataProvider.
	                         2. Second way: give a Name to the @DataProvider  example :--@DataProvider(name ="Secon_Way")                                   
	                         
	          *. Rules 4. You have to parmeterize the method in @Test with respect to No of columns in @DataProvider     */             
	
	

    @Test(dataProvider = "dataCheck")
    public void loginTest(String browserName, String username, String password, int mobile) {
        // ... test logic using the provided data ...
        System.out.println(browserName + "--" + username + "--" + password + "--" + mobile + "--");
    }

    @DataProvider()
    public Object[][] dataCheck() {
        Object[][] data = new Object[3][4];

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
