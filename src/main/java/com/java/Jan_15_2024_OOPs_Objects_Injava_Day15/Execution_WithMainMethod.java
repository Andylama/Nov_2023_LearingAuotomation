package com.java.Jan_15_2024_OOPs_Objects_Injava_Day15;

public class Execution_WithMainMethod {
	
	public static void main(String[]args) {
		
/*       You intend to execute the Logic of Dependent Class               */		
		Dependent_WithoutMainMethod.red(); 
		Dependent_WithoutMainMethod.blue(); 
		Dependent_WithoutMainMethod.green();     
	    Dependent_WithoutMainMethod.yellow(); 
//---------------------------------------------------------	    
	    Dependent_WithoutMainMethod reference = new  Dependent_WithoutMainMethod();
	    reference.violet_Nonstatic();
	    reference.pink_Nonstatic();
	    
//---------------------------------------------------------	    
	    
	    Execution_WithMainMethod reference1 = new Execution_WithMainMethod ();
	    reference1.Non_static_Method1();
	    reference1.Non_static_Method2();
	    reference1.Non_static_Method3();
}
	
	public void Non_static_Method1() {
	System.out.println("This is Non_static_Method1 inside execution class")	;
		
}
	public void Non_static_Method2() {
		System.out.println("This is Non_static_Method2 inside execution class")	;	
		
}
	public void Non_static_Method3() {
		System.out.println("This is Non_static_Method3 inside execution class")	;
		
}
}