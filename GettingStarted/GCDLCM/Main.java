
// Gcd And Lcm
// Easy

// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers. 

// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers. 

// 3. Take input "num1" and "num2" as the two numbers. 

// 4. Print their GCD and LCM.


// Constraints
// 2 <= n <= 10^9

// Format
// Input
// num1
// num2
// .. the numbers whose GCD and LCM we have to find.

// Output
// a
// b
// .. where 'a' and 'b' are the GCD and LCM respectively.

// Example
// Sample Input

// 36
// 24

// Sample Output
// 12
// 72


import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
          int num1 =scn.nextInt();
          int num2 =scn.nextInt();
          int oN1 =num1;
          int oN2 = num2;
          int rem=1;
          int gcd=0;
          while(rem!=0)
          {    gcd= num2; 
              rem=num1%num2;
              num1=num2;
              num2=rem;
          }
          // from--> [lcm * gdc == (n1*n2)]
          int lcm= ((oN1*oN2)/gcd);
     
     System.out.println(gcd);
     System.out.println(lcm);
     }
     
    }