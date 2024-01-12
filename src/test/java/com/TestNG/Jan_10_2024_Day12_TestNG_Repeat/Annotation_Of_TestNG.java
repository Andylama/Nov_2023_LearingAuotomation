package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Of_TestNG {
	
	@BeforeSuite
	
	public void beforSuiteExecutesFirst() {
		System.out.println("This is before suite it will execute First");
	}

	@BeforeTest
	public void beforTestExecutesSecond() {
		System.out.println("BeforeTest executes after @BeforeSuite");
	}
	@BeforeClass
	public void beforeClassExecutesThird() {
		System.out.println("BeforeClass executes after @BeforeTest");
	}
	@BeforeMethod
	public void beforeMethodExecutesFourth() {
		System.out.println("@BeforeMethod executes after @BeforClass");
	}
	@Test
	public void testCase1() {
		System.out.println("This is Testcase 1");
}
	@Test
	public void testCase2() {
		System.out.println("This is Testcase 2");
}
	@AfterMethod
	public void afterMethodExecutesSixth()  {
		
		System.out.println("@AfterMethod executes after @Test");
		
		
	}
	@AfterClass
	public void afterClassExecutesSeventh() {
		System.out.println("@AfterClass executes after @AfterMethod");
		
	}
	@AfterTest
	public void afterTestExecutesEight() {
		System.out.println("@AfterTest executes after @AfterClass");
	}
	
	@AfterSuite
	public void aftersSuiteExecutesLast() {
		System.out.println ("@AfterSuite executes last");
	}
}