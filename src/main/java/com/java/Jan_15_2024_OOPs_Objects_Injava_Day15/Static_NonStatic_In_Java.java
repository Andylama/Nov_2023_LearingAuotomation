package com.java.Jan_15_2024_OOPs_Objects_Injava_Day15;

public class Static_NonStatic_In_Java {
	
/*   Static means :      It is purely for the Class.
	 Non static means :- It is purely for the Object.        
	  
	  Rules for static:
	   1. static can only call static
	   2. static can not call Non-static
	   
	   Rules for Non- static:
	   1.Non -static can call Non-static
	   2.Non -static can also call static but not recommended.      */    
	        

	
	static int wheels;
	static int rollNumber;
	String name ;
	boolean promotion;
	
	public static void main(String[]args) {

	Logic1();
	Static_NonStatic_In_Java  NonstaticReference = new Static_NonStatic_In_Java ();
	NonstaticReference.Logic4();
	
	NonstaticReference.name= "Monthly";
	NonstaticReference.promotion = true	;  
}
//-----------------------------------------------------------------------------	
	public static void Logic1() {
		wheels= 9;
		System.out.println("This is static logic1 Method" );
		System.out.println("This is static logic1 Method Wheels No is " + wheels );
		
		
//----------------------------------------------------------------------------		
}
	public  void Logic2() {
		name= "ram";
		System.out.println("This is Non-static logic2 Method");	
		System.out.println("This is Non-static logic2 Method name is :"  +name);	
		Logic1();
		Logic4();
//-------------------------------------------------------------------------------		
}

	public static void Logic3() {
		System.out.println("This is static logic3 Method");
		
//--------------------------------------------------------------------------------		
}
	public  void Logic4() {
		System.out.println("This is Non-static logic4 Method");
		
		
//-----------------------------------------------------------------		
}
}