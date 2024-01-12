package com.java.Jan_07_2024_OOPS_Pillar1_Day11;

public class ParameterizedMethods {
	
	public static void main(String[]args) {
		 JoiningTwoString("Good", "Morning") ;
		                addTwoNumbers(200,4) ;
		
}
//----------------------------------------------------------------------
// An example of non -parameterized Method
public static void addingTwoIntegers()  {

	
	
	
}
//-----------------------------------------------------------------
// An example of Parameterized Method
public static String JoiningTwoString(String S1, String S2) {
           	   
	  String S3 = S1+S2 ;
	  System.out.println(S3);
	  return S3;
}
//-----------------------------------------------------------------------------------
public static int addTwoNumbers (int a, int b)  {
	 int c = a+b;
	System.out.println(c);
	return c;
}

}

