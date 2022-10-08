
/*
                                   

Learning to write programs stretches your mind, and helps you think better, creates a way of thinking about things that I think is helpful in all domains.
                                                     ~ Bill Gates



 * Coin Change Permutations
 * Medium Prev Next
 * 1. You are given a number n, representing the count of coins.
 * 2. You are given n numbers, representing the denominations of n coins.
 * 3. You are given a number "amt".
 * 4. You are required to calculate and print the number of permutations of the
 * n coins using which the
 * amount "amt" can be paid.
 * 
 * Note1 -> You have an infinite supply of each coin denomination i.e. same coin
 * denomination can be
 * used for many installments in payment of "amt"
 * Note2 -> You are required to find the count of permutations and not
 * combinations i.e.
 * 2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations
 * of same
 * combination. You should treat them as 3 and not 1.
 * Input Format
 * A number n
 * n1
 * n2
 * .. n number of elements
 * A number amt
 * Output Format
 * A number representing the count of combinations of coins which can be used to
 * pay the amount "amt"
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 20
 * 0 <= n1, n2, .. n elements <= 20
 * 0 <= amt <= 30
 * Sample Input
 * 4
 * 2
 * 3
 * 5
 * 6
 * 7
 * Sample Output
 * 5
 */

 // approch => if tar 7 and coin 2,3,5 then repetaion allowd here : 223,232,322,25,52
 /*
  * here we are check for ecah tar with each coin : for tar 2 , coin 2 coin 3 , coin 5 all will check 
  */

  import java.io.*;
 import java.util.*;

 public class Main {

     public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int arr[] = new int[n];
          for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
          }
          int tar  = scn.nextInt();
          int dp[] = new int[tar+1];
         int ans = permuation(arr , dp, tar);
         System.out.println(ans);

     }
     public static int permuation(int arr[] , int dp[] , int tar){
         dp[0] =1;
        for(int currTar= 1; currTar<dp.length; currTar++ ){
                for(int coin =0; coin<arr.length; coin++){
                    if(currTar - arr[coin] >=0){
                        dp[currTar] += dp[currTar - arr[coin]];
                    }
                }
        }
        
        return dp[tar];


     }
 }
