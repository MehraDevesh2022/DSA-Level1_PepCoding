/*
Saddle Price
Easy

1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
2. You are required to find the saddle price of the given matrix and print the saddle price. 
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.

Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * n elements <= 10^9

Format
Input
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a

Output
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.

Example
Sample Input

4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44

Sample Output
41

*/



package SaddlePrice_2dArray;

import java.util.Scanner;

public class Main {
   public static Scanner scn = new Scanner(System.in);

    public static void input(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                 arr[i][j] = scn.nextInt();
            }
        }
    }

  public static void saddle_price(int arr[][]){
          int n = arr.length;
          int row =0;
          int clm =0;
          int min =Integer.MAX_VALUE;
          int max = Integer.MIN_VALUE;
          int val = n-1;
          while(val>=0){
              for(int i= row , j=0; j<n; j++){
                  if(min > arr[i][j]){
                      min = arr[i][j];
                      clm =j;
                  }
                }
                System.out.println(min);
                row++;
        
                for(int j =clm , i =0; i<n; i++){
                    if(max < arr[i][j]){
                       max = arr[i][j];
                    //    System.out.println(max);
                    }
                 }
                if(max == min){
                   System.out.println(max);
                   return;    
                }
                else{
                    val--;
                }
               
          }     
        //   System.out.println("Invalid input");
  }

   public static void main(String[] args) {
       int n = scn.nextInt();
       int arr[][] = new int[n][n];
       input(arr);
       saddle_price(arr);
   }
}
