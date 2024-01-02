package com.TestNG.Dec_27_2023_Day9_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_TestNG {
	
	@Test
	public void HardAssert() {
	/* Hard Assert :- If at a particular line within the TestCase or within the	Logic, Assert fails
	 rest of the other lines of code will not execute.
		*/
	int A=	2;
	int B=  3;
	Assert.assertTrue(A == B);// This is failing
	
	int C = 4;
	int D = 5;
	
	System.out.println(C+D);// 9 will not get printed
	}			
			
	
	@Test
	public void SoftAssert()  {
		
		SoftAssert softassert = new SoftAssert();
		int A = 2;
		int B=  3;
		softassert.assertTrue(A ==B);// This condition is false.
		
		int C = 6;
		int D = 2;
		System.out.println("Addition is : " + (C+D));
		softassert.assertAll();
			
	}
}

