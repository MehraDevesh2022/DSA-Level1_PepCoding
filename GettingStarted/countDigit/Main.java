import java.util.Scanner;

// public Count Digits In A Number
// Easy

// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.

// Constraints
// 1 <= n < 10^9

// Format
// Input
// "n" where n is any integer.

// Output
// "d" where d is the number of digits in the number "n"

// Example
// Sample Input

// 65784383

// Sample Output
// 8
    

 import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
    int result = CountDigit(scn.nextInt());
    System.out.println(result);
   }
   // couning digit method
   public static int CountDigit(int n){
       int count =0;
       while(n !=0){
          n = n/10;
          count++;
       }
        return count;
   }
  
  }