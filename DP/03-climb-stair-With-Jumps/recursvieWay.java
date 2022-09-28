/*
 * Climb Stairs With Variable Jumps
Easy  Prev   Next
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.
Input Format
A number n
.. n more elements
Output Format
A number representing the number of ways to climb the stairs from 0 to top.
Question Video

  COMMENTConstraints
0 <= n <= 20
0 <= n1, n2, .. <= 20
Sample Input
10
3
3
0
2
1
2
4
2
0
0
Sample Output
5
 */
import java.io.*;
import java.util.*;

public class recursvieWay {
  public static Scanner scn = new Scanner(System.in);
    public static void input(int arr[]){
      for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
      }
    }
    public static void main(String[] args) throws Exception {
        // write your code here
  
        int n = scn.nextInt();
        int arr[] = new int[n];
        input(arr);
        int ans = climbStairs(0 , n , arr);
        System.out.println(ans);
    }
  public static int climbStairs(int src , int dst , int arr[]){
         if(src == dst){
             return 1;
         }
          int count = 0;
         for(int jump =1; jump<=arr[src]; jump++){
     
          if(src + jump <= dst){
              count += climbStairs(src+jump, dst, arr);               
           }
         
         }
         return count;
  }
}