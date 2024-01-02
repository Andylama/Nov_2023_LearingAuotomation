package com.java.Dec_20_Day7_LoopsInsideLoops;
public class ForLoopInsideForLoop                   {
// NESTED LOOPS - If a loop exist inside the body of another loop then it is called nested loop.
	public static void main(String[] args)          {
		//StatesAndCities();
	      MonthsAndDays() ;
		   // Method1() ;
		
		
	}	
//-----------------------------------------------------------------------------------------	
	
	 public static void StatesAndCities() {
		 int states = 50 ;
		 int cities = 3;
		 
		 
			// OUTER LOOP - Will print each city.
            for (int C = 1 ;   C <= cities;     C++)   {
			System.out.println("   CITIES: "   +C); 
			
			// INNER LOOP - Will print the States. 
			
			for( int S = 1;    S<=  states;    S++)    { 
			System.out.println( " STATES:   "  +S);	
	}
			System.out.println();
    }	
	} 		 
//-------------------------------------------------------------------------------------------------	 
		
		public static void MonthsAndDays()           {
			int months = 12 ;
			int days =   30;
			
			// OUTER LOOP - Will print each month.
           for (int M = 1 ; M <= months; M++)   {
			System.out.println("   MONTH IS: " +M); 
			System.out.println();
			// INNER LOOP - Will print the days of the month.
			
			for( int D = 1;  D<=   days;  D++)    { // Inner Loop for days.
			System.out.println( "Day is:   "    +D);	
	}			
    }	
	}		
//-----------------------------------------------------------------------------------------		
		
		public static void Method1()   		                         {
			int Verticle_No   = 10;
			int Horizontal_No =  5;
		// OUTER LOOP - V is from 1 to 10 =1,2,3,4,5,6,7,8,9,10
		   for(int V = 1 ;   V <= Verticle_No;       V ++)             {		
		
	    // INNER FOR LOOP- H is from  1 to 5 = 1,2,3,4,5		
		   for(int  H = 1 ;  H <= Horizontal_No ;    H ++ )            {
			   
	       System.out.print   (H);				 
	}
		   System.out.println (V);
	}
	}
    }
//-------------------------------------------------------------------------------------------------
