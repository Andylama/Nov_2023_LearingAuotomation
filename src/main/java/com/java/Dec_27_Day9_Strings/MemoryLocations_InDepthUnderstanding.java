package com.java.Dec_27_Day9_Strings;

public class MemoryLocations_InDepthUnderstanding {
	
	public static void main (String[]args) {
/*    Below I am creating a String Object using new Keyword and I am not passing any literal.
      One object will be created in the Heap Memory of Java.*/
		String  S = new String ();
		
       
/*    Here in below Two Objects are created One object in Heap Memory because of new keyword
	  & another object in the SLP Memory because of the liter "java" passed. */
		String  S1 = new String("Java");
	
		
/*   Here in below One object will be created inside the SLP Memory.   */		
		String  S2 = ("Python") ;

/*   Difference between :-------------
	 String  S1 = new String("Java");  -----     VS  ------   String S2 = ("Python");
--1. Two Objects ae created	                           1. --- One Object is created in SLP
--2.  Heavy                                            2. --- Light
--3.  This one is not recommended in Strings		   3.   ---- Recommended in Strings
	*/	
		
/* If you want to make a String object will you choose String S1 = ("Java") OR will you choose
	String S1 =  new String("Python");	?   Answer is : String S1 = ("Java")  because it has created
	only one object in SLP Memory it Saves Memory it is lighter for Execution */
}
}