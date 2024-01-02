package com.java.Dec_3_2023_Day3_BasicofJava;

public class Increment_Decrement_Operators2 {

    public static void main(String[] args) {
        // ++ means +1
        // -- means -1

        // Post increment: Value is used first, then incremented.
        // Pre-increment: Value is incremented first, then used.
        // Same applies for decrement operators.

     //   int a = 1;
      //  a++;  // Post-increment: a remains 1 here
     //   ++a;  // Pre-increment: a becomes 3 here
     //   a--;  // Post-decrement: a becomes 2 here
      //  --a;  // Pre-decrement: a becomes 1 again

        int A = 2;
        A++;  // A becomes 3
        System.out.println(A);  // Prints 3

        int B = 5;
        B--;  // B becomes 4
        System.out.println(B);  // Prints 4

        int C = 6;
        ++C;  // C becomes 7
        System.out.println(C);  // Prints 7

        int D = 7;
        --D;  // D becomes 6
        System.out.println(D);  // Prints 6

        int M = 5;
        System.out.println("M value is :" + M);  // Prints 5

        int O = M++;  // O gets the original value of M (5), M becomes 6
        System.out.println("O value is :" + O);  // Prints 5

        int b = 1;
        System.out.println(b);  // Prints 1
        int c = b++ + ++b;  // b++ is 1, ++b makes b 3, so c becomes 4
        System.out.println(c);  // Prints 4
    }
}