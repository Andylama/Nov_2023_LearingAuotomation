package com.java.Dec_24_2023_Day8_Arrays;

public class Two_D_Arrays {
	
	public static void main(String[]args)  {
		
		int M [][] = {      { 21, 31, 41, 51, 61     },
	                        { 21, 31, 41, 51, 61     },   
                            { 61, 71, 81, 91, 51     },
                            {101,111,121,131, 141    }    
                                                             }; 
	
		System.out.println("The No of Rows   for M int Arrays is:" +  M.length); 
	
		System.out.println("The No of Column for M int Arrays is:" +  M[0].length); 
		
		System.out.println("************************************************************************************************************"); 		
		
	//------------------------------------------------------------------------------------------------------------------------------	
		
		String name[] []  = new String[3][4] ;	  // 3 represents No of rows, 4 reprsents No of columns. 2x3 matrix
		
		 name[0][0]  = "RAMA"  ;
		 name[0][1]  = "HARI"  ;
		 name[0][2]  = "SITA"  ;
		 name[0][3]  = "GITA"  ;
		 
		 name[1][0]  = "Gurung"   ;
		 name[1][1]  = "Shrestha" ;
		 name[1][2]  = "lama"     ;
		 name[1][3]  = "Sherpa"   ;
		 
		 name[2][0]  = "Namaste"     ;
		 name[2][1]  = "Hello"       ;
		 name[2][2]  = "Goodmorning" ;
		 name[2][3]  = "Goodnight"   ;
		 
		 
		 System.out.println("The No of Rows   for name String Arrays is:" +  name.length); 
		 	
		 System.out.println("The No of Column for name String Arrays is:" +  name[0].length);
		 
		 
		 
		//Find the all Values in the Tabular Format of  2 Dimisional name Array//
		 // We need two for loops inner and outer loop or Nested loop //
		 // Outer Loop is for Row & Inner Loop is for Column
		 
		 int Row     =     name.length ;
		 int Coloumn =     name[0].length ;
		 
		 for(int  R_Num = 0;   R_Num <Row;      R_Num ++ )     {// Outer for Loop is for Row.
			 
	     for(int  C_Num = 0;   C_Num <Coloumn;  C_Num ++ )	   {// Inner for Loop is for Column.	
	    	 
	     System.out.print( name [R_Num] [C_Num]   + "   ") ;	
	     
 }
	     System.out.println( );// This print statment is for the Rows  or outer loop  to print.
	     
	   
}	   
}
	 

}