package com.java.Dec_27_Day9_Strings;

public class Equals_vs_EqualsToMethods {

	public static void main(String[] args) {
		String S1  = new String("Java");// 2 Objects are created 1 in Heap and other in SLP Memory.
		String S2  = new String("Java");// 2 Objects are created 1 in Heap and other in SLP Memory.
		System.out.println (S1 == S2);// Output is: False
		
		String S3 = "Hello ";
		String S4 = "Hello ";
		
		System.out.println (S3 == S4); // Output is: True
	}

}
