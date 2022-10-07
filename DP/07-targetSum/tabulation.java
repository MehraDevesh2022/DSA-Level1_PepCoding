/*
 * Target Sum Subsets - Dp
 * Medium Prev Next
 * 1. You are given a number n, representing the count of elements.
 * 2. You are given n numbers.
 * 3. You are given a number "tar".
 * 4. You are required to calculate and print true or false, if there is a
 * subset the elements of which add
 * up to "tar" or not.
 * Input Format
 * A number n
 * n1
 * n2
 * .. n number of elements
 * A number tar
 * Output Format
 * true or false as required
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 30
 * 0 <= n1, n2, .. n elements <= 20
 * 0 <= tar <= 50
 * Sample Input
 * 5
 * 4
 * 2
 * 7
 * 1
 * 3
 * 10
 * Sample Output
 * true
 */

 import java.io.*;
import java.util.*;

public class tabulation {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        boolean dp[][] = new boolean[n+1][tar+1]; // extra scpace for dp for extra 0 idx
        boolean ans = targetSum(arr , dp);
        System.out.println(ans);
     }

    public static boolean targetSum(int[] arr, boolean[][] dp) {
        // i idx for arr array as well repesent the num of player based on our analogy
        for(int i=0; i<dp.length; i++){
            // j idx repesent target
            for(int j=0; j<dp[0].length; j++){

                // when idx j==0(target ==0) then all player are will make 0 run 
                       if(j==0){
                           dp[i][j]  = true; // target will achive bcz 0 run bnana asaan hai
                       }
                       // when target  0 to 10 but no player is partcipating means i==0
                       else if(i==0){
                            dp[i][j] = false; // target not achived 
                       }
                       // jab player khelga ya nhi khelega (one or more player)
                       else {
                        // hum dekhinge ki humse pehle wale player ne target achive kiya tha agar ha to abhi bhi ho jayega usi player ke dawara
                         boolean notPlayed = dp[i-1][j];
                          // when player khelega by default false ho skta hai target achive na ho
                         boolean played = false;
                         if(j-arr[i-1] >=0){ // checking target achivale or not from prv record
                            played = dp[i-1][j-arr[i-1]];
                         }
                         // which one true asignd that value
                         dp[i][j] = played || notPlayed;
                       }

            }
        }
        // last block of dp will return ans
        return dp[dp.length-1][dp[0].length-1];
    }
}