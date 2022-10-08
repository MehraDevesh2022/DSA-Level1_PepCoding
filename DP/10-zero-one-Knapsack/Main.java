/*
 * 

Life is a look a like of pseudo Dynamic Programming



 */

/*
 * Zero One Knapsack
 * Easy Prev Next
 * 1. You are given a number n, representing the count of items.
 * 2. You are given n numbers, representing the values of n items.
 * 3. You are given n numbers, representing the weights of n items.
 * 3. You are given a number "cap", which is the capacity of a bag you've.
 * 4. You are required to calculate and print the maximum value that can be
 * created in the bag without
 * overflowing it's capacity.
 * 
 * Note -> Each item can be taken 0 or 1 number of times. You are not allowed to
 * put the same item
 * again and again.
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
 * 75
 */

 import java.io.*;
import java.util.*;

public class Main {
 public static Scanner scn = new Scanner(System.in);
 
 public static void input(int arr[]) {
    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
        }
 }
    public static void main(String[] args) throws Exception {
 
     int n = scn.nextInt();
     int values[] = new int[n];
     input(values);
     int weights[] = new int[n];
     input(weights);
     int taregt = scn.nextInt();
     int dp[][] = new int[n+1][taregt+1];
     int maximum = Knapsack(values , weights , dp , taregt);
     System.out.println(maximum);

    }
    public static int Knapsack(int values[] , int weights[] , int dp[][], int taregt){
        for(int  i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                   if(j==0){
                    dp[i][j] =0;
                   } 
                   else if(i==0){
                    dp[i][j] = 0;
                   }
                   else{
                    int notPicked = dp[i-1][j];
                    int picked =0;
                    if(j-weights[i-1]>=0){
                    picked = values[i-1] + dp[i-1][j-weights[i-1]];
                   }
                    dp[i][j] = Math.max(picked, notPicked);
                }
                  
       
            }
        }

 return dp[values.length][taregt];
        
    }
   
}

