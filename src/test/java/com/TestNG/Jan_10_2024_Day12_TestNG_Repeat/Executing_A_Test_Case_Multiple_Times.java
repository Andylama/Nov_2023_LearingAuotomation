package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;

import org.testng.annotations.Test;

public class Executing_A_Test_Case_Multiple_Times {
	@Test(priority =1)
	public void Logic1() {
		System.out.println("Hello World");
	}
	@Test(priority =2)
	public void Logic2() {
		System.out.println("Hello World Tour");
		
	}
	@Test(priority =3, invocationCount = 5)
	public void Logic3() {
		System.out.println("Hello World Tour Java");
	}
}
