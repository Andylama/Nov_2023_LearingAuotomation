package com.java.Dec_20_Day7_LoopsInsideLoops;

public class ForLoopInsideWhileLoop {

	public static void main(String[] args) {
		int weeks = 3;
		int days  = 7;
		int   I   = 1;
		
		// OUTER LOOP :- Will be While loop.
		    while (I <= weeks)   { 					
			System.out.println ("WEEK:  " + I );
			I ++ ;
			
	  // INNER LOOP : - Will be a for loop.		
	       for(int M = 1; M <= days ; M++) {
	      System.out.println("Days :"  + M);
	      }
			
			
		}
		
		
	}

}
