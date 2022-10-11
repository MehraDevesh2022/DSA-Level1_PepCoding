//  Dynamic Programming in one statement: Those who cannot remember the past are condemned to repeat it.


/*     
 * Unbounded Knapsack
 * Easy Prev Next
 * 1. You are given a number n, representing the count of items.
 * 2. You are given n numbers, representing the values of n items.
 * 3. You are given n numbers, representing the weights of n items.
 * 3. You are given a number "cap", which is the capacity of a bag you've.
 * 4. You are required to calculate and print the maximum value that can be
 * created in the bag without
 * overflowing it's capacity.
 * Note -> Each item can be taken any number of times. You are allowed to put
 * the same item again
 * and again.
 * Input Format
 * A number n
 * v1 v2 .. n number of elements
 * w1 w2 .. n number of elements
 * A number cap
 * Output Format
 * A number representing the maximum value that can be created in the bag
 * without overflowing it's capacity
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 20
 * 0 <= v1, v2, .. n elements <= 50
 * 0 < w1, w2, .. n elements <= 10
 * 0 < cap <= 10
 * Sample Input
 * 5
 * 15 14 10 45 30
 * 2 5 1 3 4
 * 7
 * Sample Output
 * 100
 */

 import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn  = new Scanner(System.in);
     int n = scn.nextInt();
     int values[] = new int[n];
     for(int i=0; i<n; i++){
        values[i] = scn.nextInt();
     }
     int weights[] = new int[n];
     for (int i = 0; i < n; i++) {
         weights[i] = scn.nextInt();
     }

     int targert = scn.nextInt();
     int dp[] = new int[targert+1];
     int ans  = unboundedKnapSack(values , weights , dp , targert);
     System.out.println(ans);
    }

    public static int unboundedKnapSack(int[] values, int[] weights, int[] dp, int targert) {
        for(int tar =1; tar<dp.length; tar++){
            int max =0;
            for(int cap =0; cap<values.length; cap++){
                     
                      
                         int currMax =0;
                         if(tar -weights[cap] >=0){
                             currMax = values[cap] + dp[tar-weights[cap]];
                             if(max < currMax){
                                max  = currMax;
                               
                             }
                           
                       }
            }
           // max profit from values at this capacity
            dp[tar] = max;
        }
        
        return dp[targert];
    }
}