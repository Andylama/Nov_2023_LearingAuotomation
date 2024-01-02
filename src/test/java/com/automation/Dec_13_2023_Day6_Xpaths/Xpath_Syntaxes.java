package com.automation.Dec_13_2023_Day6_Xpaths;
public class Xpath_Syntaxes {
	
	//   Syntax 1  :
	     // html    [@attribute   =   'value']
	
	
	//   Syntax  2  :
	     // htlml   [@attribute 1  =    'Value 1'      and    @attribute 2  =  'Value 2' ]
	
	
	//   Syntax  3  :
	       
        // html     [@attribute  1  =     'Value 1'      or     @attribute 2   = 'Value 2 '] 
	
	//  Use Syntax 2  and  Syntax  3 when Synatax 1 does not return 1 of 1
	
	//  Syntax 4  :  It is mostly used for Links
	    // html [ text()   =    "ValueottheText"  ]
	    //  a   [ text()   =    "Create Account"  ]
	
	
	//  Syntax  5 : It is uses a keyword known as contains. This works for both links as well as other WebElements
	        //  html [ contains (   text () ,  " contentoftheText " )  ]  ---This is used for Links
	        //   a   [ contains (   text () ,     'Create Account' ) ]  
	
	// Syntax  6  :
	        //  html [ contains  ( @attribute,   ' Value ' ) ]
	
	
    
               // input[contains(@name, 'proceed')]
               // input [@class   =  "signinbtn" ] 
               // input [@name    =  "proceed" ] 
               // input[contains    (@class,   'signinbtn')]
               // input[@name    =  'proceed' and @class   =  'signinbtn']
               // input[@name    =  'proceed'  or  @class   =   'signinbtn'] 
	
	// Syntax  7  :
	
	        // html [starts-with (@attribute, 'startingvalue' )]
	
	
	// Syntax  8  :
	        // html [ends -with (@attribute, 'endingvalue' )]
	
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
}
}
