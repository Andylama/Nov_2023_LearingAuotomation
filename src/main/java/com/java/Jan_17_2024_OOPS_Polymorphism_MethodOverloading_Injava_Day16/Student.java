package com.java.Jan_17_2024_OOPS_Polymorphism_MethodOverloading_Injava_Day16;


/*  This code is how we acheived Method Overloadingi in Java */
public class Student {
	public static void main(String[]args)  {
		
		Student student = new Student();
		student.name();
		student.name(10);
		student.name(10, 11);
		student.name("God");
		student.name(new StringBuilder("Tom"));
		student.name(new StringBuffer("Om"));
		
		
}
//--------------------------------------------------	

public void name() {	
System.out.println("This is a simple No agrument/ parameter Method");
}
//-----------------------------------------------------

public void name(int i) {
	System.out.println("This is a simple Method having One int dataype Argrument/ parameter.");	
}
//----------------------------------------------------------------------
public void name(int i, int j) {
	System.out.println("This is a simple Method having Two int dataype Argrument/ parameters.");	
}
//-------------------------------------------------------------------------
public void name(String S) {
	System.out.println("This is a simple Method having One String dataype Argrument/ parameters.");
	
}
//---------------------------------------------------------------------------
public void name(String S1, String S2) {
	System.out.println("This is a simple Method having Two String dataype Argrument/ parameters.");
	
}
//---------------------------------------------------------------------------

public void name(StringBuffer S) {
	System.out.println("This is a simple Method having One StringBuffer dataype Argrument/ parameters.");
	
}
//---------------------------------------------------------------------------

//---------------------------------------------------------------------------

public void name(StringBuilder S) {
	System.out.println("This is a simple Method having One StringBuilder dataype Argrument/ parameters.");
	
}
//---------------------------------------------------------------------------

}
