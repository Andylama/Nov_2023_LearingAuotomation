package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Speciality_Of_BeforeMthod_and_AfterMethod {
	/* @BeforeMethod runs everytime there is an @Test - It will run before the TestCase.
	   @AfterMethod  runs everytime there ia an @Test - It will run after the TestCase.
	   Tri- Combo Execution of TestNG                                       */

	@BeforeMethod
	public void setup() {
		System.out.println("This is my application setup code");
		
}
	@Test
	public void testCase1 () {
		System.out.println("This is TestCase logic 1");
	}
	@Test
	public void testCase2 () {
		System.out.println("This is TestCase logic 2");
}
	
	@Test
	public void testCase3() {
		System.out.println("This is TestCase logic 3");
		
	}
	@AfterMethod
	public void closing() {
		System.out.println("Closing my Logic");
	}
}