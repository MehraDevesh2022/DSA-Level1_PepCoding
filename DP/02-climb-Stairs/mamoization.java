/*
 * Climb Stairs
 * Easy Prev Next
 * 1. You are given a number n, representing the number of stairs in a
 * staircase.
 * 2. You are on the 0th step and are required to climb to the top.
 * 3. In one move, you are allowed to climb 1, 2 or 3 stairs.
 * 4. You are required to print the number of different paths via which you can
 * climb to the top.
 * Input Format
 * A number n
 * Output Format
 * A number representing the number of ways to climb the stairs from 0 to top.
 * Question Video
 * 
 * COMMENTConstraints
 * 0 <= n <= 20
 * Sample Input
 * 4
 * Sample Output
 * 7
 */
 
 import java.io.*;
import java.util.*;

public class mamoization {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n+1];
        int ans = climbStair(n ,dp);
        System.out.println(ans);
    }

    // memoization
    public static int climbStair(int n ,int [] dp){
        if(n==0){
            return dp[n] =1;
        }
        // when for nth value call alredy occures before then return the value of that call ans store in dp array
        if(dp[n] !=0){
            return dp[n];
        }
        int count =0;
        if(n-1 >= 0){
           count += climbStair(n-1 , dp); 
        }
        if(n-2>=0){
            count += climbStair(n-2 ,dp);
        }
        if(n-3 >=0){
            count += climbStair(n-3 , dp);
        }
        return dp[n] =count;
        
    }

}