
                              // The best error message is the one that never shows up.
                                            // ~Thomas Fuchs


/*
Fibonacci-dp
Easy  Prev   Next
1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.

Note -> Notice precisely how we have defined the fibonnaci sequence
0th element -> 0
1st element -> 1
2nd element -> 1
3rd element -> 2
4th element -> 3
5th element -> 5
6th element -> 8
Input Format
A number n
Output Format
A number representing the nth element of fibonnaci sequence
Question Video

  COMMENTConstraints
0 <= n <= 45
Sample Input
10
Sample Output
55
 * 
 */

 import java.io.*;
import java.util.*;



public class memoization {
  public static int normalFabonacci(int n){
   if(n<=1){
    return n;
   }
   // normal recursion
   int ans1 = normalFabonacci(n-1);
   int ans2 = normalFabonacci(n-2);
   int myAns = ans1 + ans2;
   return myAns;

  }
  public static int faboMemo(int n , int []dp){
   if(n<=1){
    return dp[n] =n;
   }
   // check for repeated calls & their ans store at dp already in array with respect their idx
   if(dp[n] !=0){
    return dp[n];
   }
     int ans1 = faboMemo(n-1, dp);
     int ans2 = faboMemo(n-2, dp);
     int myAns = ans1 + ans2;
     return dp[n] = myAns;
  }
  public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
   
       // normal recursion
      // int ans =  normalFabonacci(n);
      // using dp :
      int dp[] = new int[n+1]; // all return value store from n to 0 calls and
     int ans = faboMemo(n , dp);
      System.out.println(ans);
  }

}