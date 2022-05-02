// Spiral Display
// Easy

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// -10^9 <= e1, e2, .. n * m elements <= 10^9

// Format
// Input
// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements

// Output
// e11
// e21
// ..
// en1
// en2
// en3
// ..
// enm
// e(n-1)m
// ..
// e1m
// e1(m-1)
// ..
// e12
// e22
// e32
// ..

// Example
// Sample Input

// 3
// 5
// 11
// 12
// 13
// 14
// 15
// 21
// 22
// 23
// 24
// 25
// 31
// 32
// 33
// 34
// 35

// Sample Output
// 11
// 21
// 31
// 32
// 33
// 34
// 35
// 25
// 15
// 14
// 13
// 12
// 22
// 23
// 24

package SpiralDisplay_2dArray;

import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                arr[i][j]  = scn.nextInt(); 
            }
        }
    }
    public static void spiral(int arr[][]){
    
        // write your code here 
        int n = arr.length;
        int m = arr[0].length;
        int min_row = 0;
        int max_row = n-1;
        int min_clm = 0; 
        int max_clm = m-1; 
        int count =0;
        int total = n*m;
        // count < total bcz we printng all value from matrix and if once value printed loop will terminated
        while(count < total){
        // left row min-row ---> max_row
        for(int i=min_row; i<=max_row && count < total; i++){ //once value printed loop will terminated hence count<total
          
            System.out.println(arr[i][min_clm]);
            count ++;
        }
        min_clm++;
        // bottom side clm min_clm---> mac_clm
         for(int j =min_clm; j<=max_clm && count < total; j++){ //once value printed loop will terminated hence count<total
             System.out.println(arr[max_row][j]);
             count ++;
        }
        max_row--;
        //right side row  max_row----> min_row
        for(int i=max_row; i>=min_row && count < total; i--) { //once value printed loop will terminated hence count<total
            System.out.println(arr[i][max_clm]);
            count ++;
        }
        max_clm--;
        // top side clm max_clm---->min_clm
        for(int j=max_clm; j>=min_clm && count < total; j--){ //once value printed loop will terminated hence count<total
            System.err.println(arr[min_row][j]);
            count ++;

        }
        min_row++;

        }
    }


    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        input(arr);
        spiral(arr);
    }
}
