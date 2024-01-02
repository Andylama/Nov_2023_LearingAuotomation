package com.TestNG.Dec_24_2023_Day8_TestNGBasics;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_Annotations {

//-----------------------------------------------------------------------------------------	
	@BeforeMethod
	public void setup()    {
		System.out.println("Begin");
	}
//------------------------------------------------------------------------------------------	
	@Test
	public void TestCase1( ) {
		System.out.println("This is the Test Case No: 1") ;	
	}
//---------------------------------------------------------------------------------------------	
	@Test
	public void TestCase2( ) {
		System.out.println("This is the Test Case No: 2") ;	
	}
//--------------------------------------------------------------------------------------------
	@Test
	public void TestCase3( ) {
		System.out.println("This is the Test Case No: 3") ;	
	}	
//------------------------------------------------------------------------------------------	
	@AfterMethod
	public void Closing()  {
		System.out.println("End");
	}
//------------------------------------------------------------------------------------------------	
	
	
	
	
	
	

}
