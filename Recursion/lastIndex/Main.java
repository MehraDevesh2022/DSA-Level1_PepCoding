/*
 * Last Index
 * Easy Prev Next
 * 1. You are given a number n, representing the count of elements.
 * 2. You are given n numbers.
 * 3. You are given a number x.
 * 4. You are required to find the last index at which x occurs in array a.
 * 5. If x exists in array, print the last index where it is found otherwise
 * print -1.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * Input Format
 * A number n
 * n1
 * n2
 * .. n number of elements
 * A number x
 * Output Format
 * A number representing last index of occurence of x in array a or -1 if not
 * found at all.
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 10^4
 * 0 <= n1, n2, .. n elements <= 10 ^ 3
 * 0 <= x <= 10 ^ 3
 * Sample Input
 * 6
 * 15
 * 11
 * 40
 * 4
 * 4
 * 9
 * 4
 * Sample Output
 * 4
 */

 import java.io.*;
import java.util.*;

public class Main {
     static Scanner scn  = new Scanner(System.in);
     public static void input(int arr[]){
     for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
     }
     }
    public static void main(String[] args) throws Exception {
        // write your code here
        int n  = scn.nextInt();
        int arr[] = new int[n];
        input(arr);
        int x = scn.nextInt();
        int idx = 0;
        int lastIndex = lastIndex(arr, idx, x);
        System.out.println(lastIndex);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
       if(idx == arr.length-1){
         if(arr[idx] == x){
            return idx;
         }
         else{
            return -1;
         }
       }
       // faith => idx +1 will return their ans .
        int recAns = lastIndex(arr , idx+1, x);
       // expectation => i will compare myshelf with faith ans and return;
        if(recAns == -1 && arr[idx] == x){
            return idx;
        }
        else{
            return recAns;
        }
       
 
    }

}