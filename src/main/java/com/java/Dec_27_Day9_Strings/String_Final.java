package com.java.Dec_27_Day9_Strings;
public class String_Final {

public static void main(String[] args) {
	
		
//---------------------------------------------------------------------------------------------------------------		
		final int i = 10;		
		System.out.println(i);
		
//----------------------------------------------------------------------------------------------------------------		
		String S1 = new String (" I Love");
		S1.concat("Apple");
		System.out.println(S1); // Output will be :--I Love
		
//-----------------------------------------------------------------------------------------------------------------		
		S1= S1.concat("Orange ");
		System.out.println(S1);  // Output will be :-- I LoveOrange 
		
//-------------------------------------------------------------------------------------------------------------------
	}

}