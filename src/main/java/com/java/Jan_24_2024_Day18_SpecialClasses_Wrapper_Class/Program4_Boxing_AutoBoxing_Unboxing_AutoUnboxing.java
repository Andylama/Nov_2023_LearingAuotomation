package com.java.Jan_24_2024_Day18_SpecialClasses_Wrapper_Class;

public class Program4_Boxing_AutoBoxing_Unboxing_AutoUnboxing {
	
	/* 1. Direct Parent of Character &  Boolean Wrappr Class is :---> Object Class
	                  2. Direct Parent of other 6 Wrappr Class is :---> Number Class  */
   
	
	/*       
           1.Boxing : 
            Conversion of primitive data type to Wrapper Class Object is called Boxing.           
            
           2.Unboxing:       
            Conversion fo Wrapper Class Object to primitive data type is called Unboxing.
                       
                                                                                   */
	public static void main(String[] args) {
		             boxingExample();
		             autoBoxingExample();
		             unboxingExample();
}
//-----------------------------------------------------------------
	public static void boxingExample() {
	int A = 10;
	Integer b  =  Integer.valueOf(A);
	System.out.println("  Primitive to  Wrapper Class Object Value is:"+b);
}
	/*This is a simple example of boxing, where a primitive data type variable is converted into a wrapper class object. 
	 In this case, variable b becomes a wrapper class object. 
	 
	>>>> This Method valueOf();converts primitive to wrapper class object                       */
	
//--------------------------------------------------------------------	
	public static void autoBoxingExample() {
		int C = 13;
		Integer d = C;
		System.out.println("  Primitive to  Wrapper Class Object Value is:"+d);
	/*   Here's another example  of autoboxing: a primitive dat type variable is directly (faster) converted into its 
	     corresponding wrapper class object. In this case, b becomes a wrapper class object. */

		  		
	}
//-------------------------------------------------------------------	
	public static void unboxingExample() {
	Integer E = 200;
	int f = E.intValue();
	System.out.println("  Wrapper Class Object to Primitive data int Value is:"+f);		
	}
	/*   Here's another example of Unboxing: a wrapper class object is converting into primitve data type varialbe like int, char, long also
	 *   known as Unboxing 
	 >>>> This Method intValue(); converts  wrapper class object   to Primitive data type   */
//----------------------------------------------------------------------	
	
	public static void AutoUnboxingExample() {	
	
		Integer G = 400;	
		int h = G;
		System.out.println(h);
}		
/*   Here's another example of AutoUnboxing: a wrapper class object is converting (Faster) into primitve data type varialbe like int, char, long also
     known as AutoUnboxing */
//-------------------------------------------------------------------------------	
}


// Home wrok:
//  Pleae try boxing  and unboxin for other Pirmitive Data Types and Wrapper Classes




