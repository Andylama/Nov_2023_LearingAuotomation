package com.java.Jan_21_2024_Day17_SpecialClasses;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class_More_Concepts {
	public static String emailTimeStamp ;
	public static Date date;
	public static SimpleDateFormat sdf1;
	public static SimpleDateFormat sdf2;
	public static  SimpleDateFormat sdf3;
	
	public static void main(String[]args)  {
	
	date = new Date();
	//System.out.println(date);	
	emailTimeStamp = date.toString().replace("", "_").replace(":", "_");
	System.out.println("Replacing Date:" +""  +emailTimeStamp);
	
                                                                    
	
	    
	
	    sdf1 = new SimpleDateFormat("E, dd MMM yyyy  HH: mm: ss z ");
	    System.out.println("Date1a:" +"  "  +sdf1.format(date));
	    
	    sdf1 = new SimpleDateFormat("M/dd/yyyy  hh:mm: ss");
	    System.out.println("Date1b:" +"  "  +sdf1.format(date));
	   
	 	    
	    
	 // HH:mm:ss format
	    sdf2 = new SimpleDateFormat("HH:mm:ss");
	    System.out.println("Date2:" +"  "  +sdf2.format(date));
	 
	 // Full month name format
	    sdf3 = new SimpleDateFormat("MMMM d, yyyy");
	    System.out.println("Date2:" +"  "  +sdf3.format(date));
	    
	    sdf3 = new SimpleDateFormat("E, dd MMM yyyy  HH: mm: ss z ");
	    System.out.println("Date3:" +"  "  +sdf3.format(date));
	   
	}

}
