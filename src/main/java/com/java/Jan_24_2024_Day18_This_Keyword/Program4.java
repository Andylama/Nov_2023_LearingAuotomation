package com.java.Jan_24_2024_Day18_This_Keyword;

public class Program4 {
/* Practical demonstration of Point No :2 
  >>> this. keyword can be used to invoke current class Method(implicitly)not directly wirting this.keyword.   */
	
//-------------------------------------------------------------	
public void displayMethod1() {
System.out.println("Printing   displayMethod1();   Statement.");
}
/* 1. Even if you do not use this. keyword, compiler automatically add this.keyword 
      while invokig(Executing) the Method.  
   2. Hence this.displayMethod1(); OR displayMethod1(); will work as the same.
   3. this. keyword can be used to invoke current class Method(implicitly) meaning wihtout directly
      writig this.keyword compiler will automaically Execute the Method. 
   
                         */
//---------------------------------------------------------------
public void showMetthod2()              {
System.out.println("Printing   showMethod2();      Statement.");	
	  this.displayMethod1();
}
//-----------------------------------------------------------
public static void main(String[] args) {
Program4 prog = new Program4 ()	;
         prog.showMetthod2();

}

}
