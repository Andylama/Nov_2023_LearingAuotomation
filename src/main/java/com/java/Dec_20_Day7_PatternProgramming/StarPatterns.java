package com.java.Dec_20_Day7_PatternProgramming;
public class StarPatterns {
public static void main(String[] args) {
	              PatternNo1();	
	             // PatternNo2();
	              //  PatternNo3();
}	    
//----------------------------------------------------------------------------------------------------------
 public static void PatternNo1()       {
	 
	 for( int A = 1;  A<=5 ; A++)      {
		 
		
		 for(int B =1; B<= A ; B++)    {
			 System.out.print(" *  ");
 }
	         System.out.println();
 } 	 
 }
//----------------------------------------------------------------------------------------------------------- 
public static void PatternNo2()        {
	 
	 for( int A = 1;  A<=5 ; A++)      {// row
		 
		 
		 for(int B =5; B>= A ; B--)    { // column
			 System.out.print("*");
}
	 	     System.out.println();
}
}
//----------------------------------------------------------------------------------------------------------
 public static void PatternNo3()        {
	 
	 for( int A = 1;  A<=5 ; A++)       {
		 
		 
		 for(int B =1; B<= A ; B++)     {
			 System.out.print("*");
}
	 	     System.out.println();
}
	  for(int A =1 ; A<=5 ; A++)  {
		 for (int B =4 ; B >= A ; B--)  {
			 System.out.print("*");
}
		 System.out.println();
}
}
}
//---------------------------------------------------------------------------------------------------------