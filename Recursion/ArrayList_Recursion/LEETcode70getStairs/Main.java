/*
 * 70. Climbing Stairs
Easy

13945

411

Add to List

Share
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45
Accepted
1,812,848
Submissions
3,514,072
 */



// this code is from leetcode 70 needed to solve for TLE
import java.util.Scanner;

public class Main {

public  static void main(String[] args) {
    Scanner scn  = new Scanner(System.in);
     int n = scn.nextInt();
     int recAns =climbStairs(n);
      System.out.println(recAns);


}
    public static int climbStairs(int n) {
      
        if(n==0){
            int base =0;
            return base;
        }
        
        int ans =0;
        for(int step =1; step<=2 ; step++){

         if((n-step) >=0){
             int recAns = climbStairs(n-step);
             if(recAns ==0){
                 ans++;
             }
             else{
                 ans += recAns;
             }
         }
        
        }
        return ans;
        
        
    }
} 
    

