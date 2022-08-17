/*
 * Determine Whether Matrix Can Be Obtained By Rotation
Easy

Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise... 

Constraints
n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.

Format
Input
Input and output is managed for you.

Output
Input and output is managed for you.

Example
Sample Input

2
2
0 1
1 0
2
2
1 0
0 1

Sample Output
true


 */
import java.util.*;

 public class Main{
   public static Scanner scn = new Scanner(System.in);
    public static void input(int arr[][]){
        for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[0].length; j++)
             arr[i][j] = scn.nextInt();
        } 
       }

       public static void transpose(int arr[][]){
              int n = arr.length;
              for(int i=0; i<n; i++){
                for(int j=i; j<n; j++){
                     int temp = arr[i][j];
                     arr[i][j] = arr[j][i];
                     arr[j][i] = temp;

                }
              }
       }

    public static void reverse(int arr[][]){

        for(int[] elm : arr){
             reverse1D(elm);    
        }
    }
    public static void reverse1D(int arr[]){
        int i=0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    public static boolean compare(int arr[][] , int target[][]){
          int n = arr.length;
          for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(target[i][j] != arr[i][j]){
                     return false;
                }
            }
          }
          return true;

    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        input(arr);
        int target[][] = new int[n][n];
        input(target);
        transpose(arr);
        reverse(arr);
      System.out.println(compare(arr , target));
    }
 }