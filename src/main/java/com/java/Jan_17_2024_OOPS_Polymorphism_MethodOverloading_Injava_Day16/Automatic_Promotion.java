package com.java.Jan_17_2024_OOPS_Polymorphism_MethodOverloading_Injava_Day16;

public class Automatic_Promotion {

	public static void main (String []args) {
		
		Automatic_Promotion  ref = new Automatic_Promotion ();
		ref.display(1);
		ref.display('c');// Character is converting to integer
		
		
		
}
//-------------------------------------------------------------------
	public void display (int i) {
		System.out.println("int parameter method");
}
//-------------------------------------------------------------------	
	
	
}
