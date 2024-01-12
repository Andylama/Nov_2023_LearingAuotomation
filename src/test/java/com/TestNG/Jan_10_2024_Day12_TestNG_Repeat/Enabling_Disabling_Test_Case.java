package com.TestNG.Jan_10_2024_Day12_TestNG_Repeat;

import org.testng.annotations.Test;

public class Enabling_Disabling_Test_Case {
	
	
	@Test(priority =1)
	public void logic1() {
		System.out.println("This is logic 1");
	
	}
	
	
	@Test(priority =2,enabled = false)
	public void logic2() {
		System.out.println("This is logic 2");
	
	}
	@Test(priority =3)
	public void logic3() {
		System.out.println("This is logic 3");
	
	}
	
}
