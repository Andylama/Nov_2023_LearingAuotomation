package com.java.Dec_24_2023_Day8_Arrays;
public class One_Dimesional_Array {
	// 1. Declaration of Array.
	// 2. Create an Array.
	// 3. Intiatlize an Array.
	// 4.  Retrieve elements of the Array.
    // One dimension represent []	
	// Two dimension represent []  []
	
	public static void main(String[] args) { 
    
   String FName []  = new String [4]  ;        
   
    FName[0]   =  "Tiger";
    FName[1]   =  "Lion";
    FName[2]   =  "Cow";
    FName[3]   =  "Dog";
    
       for  (int S = 0;   S<FName.length;    S++ ) {
    	   
       	System.out.print(FName[S]  + ",");   	
        	
    }
  //---------------------------------------------------------------------------------------------------------------------------  
   
    int F1[]  = {10,20,30,40,50,60,70} ;    // This is the best way to Declare Create and Intialize Array.
   System.out.println("Length of F1 Array is:"  +F1.length);    // determining the length of the Array.
    
  //-----------------------------------------------------------------------------------------------------------------------------  
    
    String Name[]  = {"Ram","Hari","Sita","Gopal", "Narayan"} ;
    
    System.out.println("The 4 position of the Name Array Value is: " +Name [4]);
    System.out.println("The size of the Name Array is:" +Name.length); 
    for  (int S = 0;   S<Name.length;   S++ ) {
   	System.out.print(Name[S]  + ",");
 }
  }
}
			
