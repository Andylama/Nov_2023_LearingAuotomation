package com.java.Dec_24_2023_Day8_Arrays;

public class Retrieval {
	

 public static void main(String[] args) {
		 
//Reteive all the Elements of the Below 1 Dimisional Array First find the Length and usee For loop.
      int A [] = {10,20,30,40,50,60 } ;
      
      System.out.println("Length of the A Array is:" +  A.length); 
      System.out.println("The 3 Positon of A Array value is:" +A[2]);
      
      for(int  s=0;   s<A.length;   s ++)  {
      System.out.println(A [s]   +  " ");	  
}  
      
      
System.out.println("*****************************************************************************************"); 
      
      int M [][] = {      { 21, 31, 41, 51, 61,  71    },
    		              { 21, 31, 41, 51, 61,  81    } ,   
                          { 61, 71, 81, 91, 51,  91    },
                          {101,111,121,131, 141, 151    }       };  
      
          System.out.println("The No of Row for M int Arrays is:"    +  M.length); 
          System.out.println("The No of Column for M int Arrays is:" +   M[0].length); 
          System.out.println("The 3 Positon of 2 dimisional Array  M value is:" +M[3][3]);
          
          
        //Reteive all the Elements of the Below 3 Dimisional Array First find the Length and usee Nestd for loop for Row and Column.       
              for (int column=0;    column<M.length;        column++)  {
              for (int row=0 ;      row<M[column].length;     row++)   {
          
          
          
          /*    for (int column=0;    column<4;       column++)   {
    	        for (int    row=0 ;      row<5;          row++)   {  */
    		   
    		  System.out.print(M[column][row] +" ");
    	  }
    	    System.out.println();
      }
      
 } 
}
 