package com.java.Jan_17_2024_OOPS_Polymorphism_MethodOverloading_Injava_Day16;
public class Overloading_Example_1 {
	public static void main(String[]args) {
			Overloading_Example_1  ref = new Overloading_Example_1 ();
	         ref.multiply(9, 8);
	         ref.multiply(6, 8, 2);
	         ref.add("Mike", "G");
             ref.add(5, 6);      
}
	//-------------------------------------------------------------	
	public  int add(int a, int b) {
	  int   Total =a + b;
 	       System.out.println("Sum of integers: " + Total); 
	       return Total;
	    }
	//-----------------------------------------------------------------

	public String add(String s1, String s2) {
		String Name= s1 +s2;
		System.out.println("The String full Name is: " + Name);
		return Name;
	}

//------------------------------------------------------------
	public    int multiply(int e, int f) {
		int  Product= e*f;
	      
	        System.out.println("Multipication of int datatype is : " +  Product);
	        return  Product;
    }
//----------------------------------------------------------------	
		public    int multiply(int g, int h, int i) {
		int  Product2= g*h*i;
	     
	        System.out.println("Multipication of int datatype is : " +  Product2);
	        return  Product2;
    }
	//-------------------------------------------------------------
		 public   double sub(double c, double d) {
		    double Difference =   c - d;
		        System.out.println("Substraction of doubles is: " + Difference );
				return Difference ;
	   }
	//------------------------------------------------------------
	}