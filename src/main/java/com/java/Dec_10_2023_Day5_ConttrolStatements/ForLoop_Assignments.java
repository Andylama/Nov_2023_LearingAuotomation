package com.java.Dec_10_2023_Day5_ConttrolStatements;
public class ForLoop_Assignments      {

public static void main(String[] args) {
	//print1to100( );
	//print100to1( );
	print5to495InMultiplesof10AndAddTheMultiples( );
}




public static void print1to100( )           {
	 int sum = 0;
	for ( int a =1;   a <=100;    a ++)     {
		System.out.println( a +      "  ");
		sum = sum + a ;
}
	System.out.println("Sum from 1 to 100 is ;"  + sum);
}	




public static void print100to1( )  {	
	     int sum = 0;
	for( int b = 100;   b>=1;  b--)         {
		System.out.println( b  +    "  ");
		    sum = sum + b;
}
	System.out.println("Sum from 100 to 1 is : " + sum);
}




public static void print5to495InMultiplesof10AndAddTheMultiples( )  {
	// 5, 15, 25 ..........495
	// 5 + 15 + 25 ........+495 = sum
	
     int sum = 0 ;
     for (int c = 5 ; c<=495 ; c = c +10) {
    	 System.out.println(c);
    	 sum = sum + c;
     }
     System.out.println( "Sum form 100 to 1 is :" + sum);     
}




 public static void printFirst20MultiplesOf9andAddthoseMultiples() {
	//9 ,18 ,36 ...........180
	// sum
	
	
}
}
