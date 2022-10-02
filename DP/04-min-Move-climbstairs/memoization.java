
// Climb Stairs With Minimum Moves
// Easy  Prev   Next
// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. You are given n numbers, where ith element's value represents - till how far from the step you 
//      could jump to in a single move.  You can of-course fewer number of steps in the move.
// 4. You are required to print the number of minimum moves in which you can reach the top of 
//      staircase.
// Note -> If there is no path through the staircase print null.
// Input Format
// A number n
// .. n more elements
// Output Format
// A number representing the number of ways to climb the stairs from 0 to top.





import java.io.*;
import java.util.*;

public class memoization {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =scn.nextInt();
        }
        int dp[] = new int[n+1];
        int ans = minClimbStairs(0 , n , arr, dp);
        System.out.println(ans);
    }
   public static int minClimbStairs(int src , int dst , int arr[] , int dp[]){
            if(src == dst){
                return dp[src] =0;
            }

            if(dp[src] !=0){
                return dp[src];
            }

            int min = Integer.MAX_VALUE;
           for(int jump =1; jump<=arr[src] ; jump++){
                if(src+jump <=dst && arr[src+jump] >0){
                    min = Math.min(min, minClimbStairs(src+jump, dst, arr, dp));
                }              
            }

    return dp[src] =min;
   }
}
