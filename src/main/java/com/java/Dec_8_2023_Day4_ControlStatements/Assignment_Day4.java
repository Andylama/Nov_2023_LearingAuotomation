package com.java.Dec_8_2023_Day4_ControlStatements;
public class Assignment_Day4 {

	public static void main(String[] args) {
	//findLargestBetweenFinveNumbers();	
	determineWhetherThisNumberisEvenorOdd() ;
}
	
	
	public static void findLargestBetweenFinveNumbers() {
    int a = 1; int b= 2; int c =3; int d = 4; int e= 5;
       
 // I want to determine the largest of these 5 numbers
	if        (a>b  &&  a>c  &&  a>d  &&   a>e) {
		                                 System.out.println("A is the largest" + a);
} else if     (b>a  &&  b>c  &&  b>d  &&   b>e) {
		                                 System.out.println("B is the greates" +b);}
  else if     (c>a  &&  c>b  &&  c>d  &&   c>e)          {
	                                     System.out.println("C is the greates:"+ c);
}
  else if     (d>a  &&  d>b  &&  d>c &&   d>e )	{	
	                                    System.out.println("D is the greates:"+ d);
} else {
	                                    System.out.println("E is the greates:"+ e); 
	}
	}

		
    	public static void determineWhetherThisNumberisEvenorOdd() {
    	int a = 101;
    	int b = 100;
    	int c=  200;
    	
    	if (a% 2 == 0) {
    		System.out.println("a is even");
    	}else {
    		System.out.println ("a is odd");
   	}
    	if (b% 2 == 0) {
    		System.out.println("b is even");
    	}else {
    		System.out.println ("b is odd");
  	}
    	if (c% 2 == 0) {
    		System.out.println("c is even");
    	}else {
    		System.out.println ("c is odd");
    }
    }
}