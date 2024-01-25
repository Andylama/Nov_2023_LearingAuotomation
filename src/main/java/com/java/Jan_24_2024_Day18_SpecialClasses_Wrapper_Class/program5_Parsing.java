package com.java.Jan_24_2024_Day18_SpecialClasses_Wrapper_Class;

public class program5_Parsing {

/*  Parsing :
    Parsing means converting a String representation of a value into its corresponding data type.
    
      Integer Parsing:
      
       Double Parsing:
       
      Boolean Parsing:
      
    Character Parsing:
    
         Long Parsing:     
                                                                       */
//-----------------------------------------------------------------------------	
	public static void main(String[] args) {
		
		stringToInteger();
		stringToDouble();
		StringToBoolean();
		
		StringToLong();
}
//---------------------------------------------------------------------
	/*      Integer Parsing:                              */

	public static void stringToInteger() {
		String Oldprice1 = "300";
		String Oldprice2 = "200";
           int Newprice1 =	Integer.parseInt(Oldprice1);
           int Newprice2 =	Integer.parseInt(Oldprice2);
    System.out.println(" String to Integer Parsing Total Newprice is: "+(Newprice1+Newprice2));
}
//--------------------------------------------------------------------	
	/*      Double Parsing:                              */
	
	public static void stringToDouble() {
		String OldAmount1 = "10.25";
		String OldAmount2 =  "4.75";
	    double NewAmount1 =  Double.parseDouble(OldAmount1);
	    double NewAmount2 =	 Double.parseDouble(OldAmount2);
	  System.out.println(" String to Double Parsing Total NewAmount is: "+(NewAmount1+NewAmount2));
	
	}
//--------------------------------------------------------------------	
	/*      Boolean Parsing:                              */
	public static void StringToBoolean() {
		String Oldresult1 = "true" ;
		String Oldresult2 = "false";
		
		boolean Newresult1 =  Boolean.parseBoolean(Oldresult1);
		boolean Newresult2 =  Boolean.parseBoolean(Oldresult2);
		 System.out.println (Newresult1 ==  Newresult2);
		
	}
	
	
	
//--------------------------------------------------------------------	
	/*     Character Parsing:                              */
	public static void StringToCharacter() {
	
		
		
	}
	
//-------------------------------------------------------------
	/*      Long Parsing:                              */
	public static void StringToLong() {
		
		String S1 =  "9876543210";
		String S2 =  "9876543210";
		long L1 = Long.parseLong(S1);
		long L2 = Long.parseLong(S2);
		System.out.println(L1 +L2);
	}
//--------------------------------------------------------------	
}
