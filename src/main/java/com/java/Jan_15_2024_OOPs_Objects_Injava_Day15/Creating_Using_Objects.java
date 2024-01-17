package com.java.Jan_15_2024_OOPs_Objects_Injava_Day15;
public class Creating_Using_Objects {
/*      What is an Object ?                                       
    Instance of a Class is an Object.                   	*/
	
	String name;
	int rollNumber;
	boolean promotion;
	
	public static void main(String[]args) {
		
	Creating_Using_Objects reference  = new Creating_Using_Objects ();	
                                       
                                                       
  /*  new Creating_Using_Objects ()-----is an Object.  */ 

/*  How many Objects of this Creating_using_Objects Class can we create?
    Ans: Innumerable                  */
                                             
                                                     
	
	

		
/*  Java definition : Object is collection of all non static entities of the Class */
	
	
	
	logic2();
	reference.name ="John";
	reference.rollNumber=101;
	reference.promotion=true;
}
public void logic1()  {
	System.out.println("This is Non static Logic Number: 1 Method");
	
}

public static int logic2() {  // This is static Method.

	System.out.println("This is Static Logic Number:    2 Method");

int a = 5;
int b = 2 ;
int Total = a+b ;
System.out.println(Total);
return Total;

}
public void logic3() {    // This is Non static Method.
	System.out.println("This is Non static Logic Number: 3 Method");	
	
}
}
