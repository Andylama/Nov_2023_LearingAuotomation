package com.java.Jan_07_2024_OOPS_Pillar1_Day11;

public class InputParameters {
	/* Create 5 Methods with 2,3,4,5,6 input parameters.
	   Three Methods shoul be  of String Type, 1 should be of int Type, 1 should be of boolean Type
	                                   */
public static void main(String[]args) {
	
	check("Automation", 100, true);
	parametersFour("Ram","Gopal", "Sita", "Gita");
	addTwoNumbers(5,6);


}

//--------------------------------------------------------------------------------------------------------------
public static String check(String S1, int i, boolean b1) {
	System.out.println(S1);
	return S1;
} 


//--------------------------------------------------------------------------------------------
public static void parametersFour(String S1,String S2, String S3, String S4)  {
	String S5 = S1+S2+S3+S4 ;
	System.out.println(S5);
}
//-------------------------------------------------------------------------------------------------

public static int addTwoNumbers (int a, int b)  {
	int c = a+b;	
	System.out.println(c);
	return c;
}
//--------------------------------------------------------------------------------------------
}
