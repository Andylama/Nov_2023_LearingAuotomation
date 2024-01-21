package com.java.Jan_17_2024_OOPS_Polymorphism_MethodOverriding_Injava_Day16;

public class Student extends School{
	public static void main (String []args) {
		Student student = new Student();
		student.education();
		student.mandatoryFees(200);
}		
	//---------------------------------------------------------	
		public void education() {
		System.out.println("This is child's class education Method");
		
}
//-----------------------------------------------------------------------	
		public void mandatoryFees(int i) {
	    System.out.println("This is child's Class mandatory fee with int parameter.")	;	
	    
}
//------------------------------------------------------------------------------	
		
}


