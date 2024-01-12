package com.java.Jan_07_2024_OOPS_Pillar1_Day11;

public class Mehods_Introduction {

/*   Methods : Independent units of execution. Logical units/ factories of java coding 
     logic execution. 
     What happens in a factory : you have raw material > Brain > Finished Product. 
     
     How many types of methods are there?
     1. Concrete Method
     2. Unimplemented Method
     
     How many methods have we worked on so far?
     Both but you do not know that you have.
   
     What is a Concrete Method?
     A Method which has an access modifier, a return type, a body.
     
     Syntax of Concrete Method       */                      
                         
                            
public static void main(String[]args) {
	adding();
	joinThreeString(); 
	validateSalaryIncrease();
}

//--------------------------------------------------------------------------
public static int adding()  {
	int a= 10;
	int b = 20;
	int c = a+b ;
	System.out.println(c);
	return c ;
}
//-----------------------------------------------------------------

public static String joinThreeString() {
	String S1 =  "Ram";
	String S2  =  "B"  ;
	String S3 = "Lama";
	String S4  = S1+S2+S3;
	System.out.println(S4);
	return S4;

}
//------------------------------------------------

public static boolean validateSalaryIncrease() {
	//boolean salaryIncrease2022 = true;
	//boolean salaryIncrease2023 = false;
	
	int performance =95;
	int expectation =100;
	
	if(performance< expectation) {
		System.out.println("NO Salary increase");
	}else {
		System.out.println("Salary increase");
	}
	boolean expectationFrom2024 = false ;
	
	return expectationFrom2024;
	
	
}
//---------------------------------------------------------

}


