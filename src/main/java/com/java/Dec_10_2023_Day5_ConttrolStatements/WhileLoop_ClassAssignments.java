package com.java.Dec_10_2023_Day5_ConttrolStatements;
public class WhileLoop_ClassAssignments {
	public static void main(String[] args) {
		                                     //print1to10();
	          	                           //  print10to1();
		                           //print1to10AndAdd1to10();
	      print5to100InTheMultiplesOf5AndAddThoseMultiples();
print100to5InTheDecreasingMultiplesof5AndAddThoseMultiples();
		                                // print1to4andAdd();
}
	
	
	public static void print1to10() {
		int a = 1;
		while(a <=10) {  // Start loop continues as long as a is less than or equal to 10
			System.out.println( a );
			a++ ; //Increments the value of a by 1.
}		
}
	

		public static void print10to1() {
		int b = 10;
		while(b >= 1) {  // Start loop that continues as long as b is greater than or equal to 1.
			System.out.println( b );
			b-- ; //Decrements the value of b by 1.
}			
}
		
	
		
	public static void print1to10AndAdd1to10() {
		 int     c = 1 ;
		 int   sum = 0 ;
		 while ( c<= 10)  {
			 System.out.println(c);
			 sum = sum + c ; //Sum always comes befor iteration this is the rule otherwise sum's outcome will be different
			 c ++ ;
 }
			System.out.println("The total sum 1 to 10 is: " + sum);     
 }
		 
			

	
	public static void print5to100InTheMultiplesOf5AndAddThoseMultiples() {
		// 5, 10, 15, 20, ........100
		// 5+ 10 + 15 + 20 + ....+100 = sum
		
		int  d =5 ;
		int sum =0;
		while (d<=100) {
			System.out.println(d);
			sum = sum +d ;
			d = d +5 ; 			
}
		System.out.println(" The sum of the multiple are: "+ sum);
} 
	

	
	public static void print100to5InTheDecreasingMultiplesof5AndAddThoseMultiples() {
		//100, 95, , 90, 85,..........5
		//100+ 95 +  90 + 85.........+5 = sum
		int e = 100;
		int sum =0;
		while (e>=5) {
			System.out.println(e);
			sum = sum + e;
			e = e-5; 	
}
		System.out.println("The multiples'sum is :" + sum);
}
	
	
	
	public static void print1to4andAdd() {
		int f = 1 ;
		int sum = 0;
		while (f<=4) {
			System.out.println(f);
			sum = sum + f;
			f ++;
}
		System.out.println("1+2+3+4 ="+ sum);
}
	
{
}
}