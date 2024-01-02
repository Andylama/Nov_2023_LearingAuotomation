package com.java.Dec_24_2023_Day8_Arrays;

public class Two_Dimensional_Array {
		// []  []

	public static void main(String[] args) { 
	
		//  Declaration
	  //	int A [] []  ;// This is the most popular declaration Array.
		
		
		
	//B = new int [3][4];  // 3 represents No of rows, 4 reprsents No of columns. 2x3 matrix
			
  /*             0,0     0,1       0,2     0,3
   *             ---     ---       ---     ---
   * 
	  0 ----     21       31       41      51 
	  1 ----     61       71       81      91 
	  2 ----     101      111      121     131 */

		
		int B [][]  = new int [3][4]; //This is second way of declaring Array in java for Automation.
		
		B[0][0]  = 21;
		B[0][1]  = 31;
		B[0][2]  = 41;
		B[0][3]  = 51;

		B[1][0]  = 61;
		B[1][1]  = 71;
		B[1][2]  = 81;
		B[1][3]  = 91;
		
		B[2][0]  = 101;
		B[2][1]  = 111;
		B[2][2]  = 121;
		B[2][3]  = 131;
		
		
		 /*	int B [][] = {   { 21, 31, 41, 51    },// This is popular way to declar Arrary in java for Automation
		                 {     61, 71, 81, 91    },
		                 {    101,111,121,131    }   } ;  */
}
}