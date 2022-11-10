/*
              Any fool can bomb a train, but just try sorting out the mess.
                          ~ Aleksandr Solzhenitsyn   

complexity will Big O(n) only because with this approch we are travling n  time only in a array

 * Sort 01
Easy  Prev   Next
1. You are given an array(arr) containing only 0's and 1's.
2. You have to sort the given array in increasing order and in linear time.
Input Format
An Integer N 
arr1
arr2..
n integers
Output Format
Check the sample output and question video.
Question Video

  COMMENTConstraints
1 <= N <= 10000
arr[i] = 0,1
Sample Input
5
0
1
0
1
0
Sample Output
Swapping index 0 and index 0
Swapping index 2 and index 1
Swapping index 4 and index 2
0
0
0
1
1

 */


import java.io.*;
import java.util.*;

public class Main {

  public static void sort01(int[] arr){
    //write your code here\
    // we are using here 2 pointer 
    // when arr[j] ==0 then swap value with arr[i] and move i as well
    for(int j=0 , i=0; j<arr.length; j++){
          if(arr[j]==0){
            swap(arr, j, i);
            i++;
          }
    }
    
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }

}