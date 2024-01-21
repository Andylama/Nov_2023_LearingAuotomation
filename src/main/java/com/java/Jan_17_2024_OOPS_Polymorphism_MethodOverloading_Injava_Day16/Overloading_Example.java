package com.java.Jan_17_2024_OOPS_Polymorphism_MethodOverloading_Injava_Day16;

public class Overloading_Example {
	public static void main(String[]args) {
		
		Overloading_Example ref = new Overloading_Example();
		ref.add();
		ref.add(5, 6);
		ref.add(3, 3);
		ref.add("hello","World");
		
		

}
	public void add() {
		System.out.println(10+20);
	}
//-------------------------------------------------------------------
	
public void add (int a, int b)	{
	int Total = a+b;
	System.out.println( Total);
}
//-----------------------------------------------------------------------------
public void add(double a, double b) {
	double Total = a+b;
	System.out.println( Total);
	
}
//-------------------------------------------------

public void add(String a, String b) {
	String  Total = a+b;
	System.out.println( Total);
}
//----------------------------------------------------------

}
