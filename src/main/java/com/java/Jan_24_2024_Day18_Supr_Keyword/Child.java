package com.java.Jan_24_2024_Day18_Supr_Keyword;
public class Child extends Parent{

int A= 20; /*  Instance Variable inside a class outside of Method, constructor or block         */

//--------------------------------------------------
Child() {
	
super()	;
/* Practical demonstration of Point 3. super() can be used  to invoke(Execute) imediate parent class contructor.*/
}



//----------------------------------------------------	
public void ShowChildClassMethod1(int A)  {
System.out.println("          ShowChildClassMethod1 Value is: " +A); //Output is :30	
System.out.println("             Instance Variable Value is: " +this.A); //Output is :20
System.out.println("Parent Class Instance Variable Value is: " +super.A); //Output is :10 
/* Practical demonstration of Point No:1 super keyword can be used to refer immediate parent class instance variable.*/                                                         
                                                                       



super.ShowParentClassMethod1();
/* Practical demonstration of Point No:2 used to invoke(Execute) immediate parent clas Method.  */
}

//--------------------------------------------------------

public static void main(String[] args) {
Child child = new Child();	
child.ShowChildClassMethod1(30);

			
}
			
}
