package Multipication_2dArray;

import java.util.Scanner;

// Matrix Multiplication
// Easy

// 1. You are given a number n1, representing the number of rows of 1st matrix.

// 2. You are given a number m1, representing the number of columns of 1st matrix.

// 3. You are given n1*m1 numbers, representing elements of 2d array a1.

// 4. You are given a number n2, representing the number of rows of 2nd matrix.

// 5. You are given a number m2, representing the number of columns of 2nd matrix.

// 6. You are given n2*m2 numbers, representing elements of 2d array a2.

// 7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of product array as specified in output format.

// 8. If the two arrays can't be multiplied, print "Invalid input".


// Constraints
// 1 <= n1 <= 10^2

// 1 <= m1 <= 10^2

// -10^9 <= e11, e12, .. n1 * m1 elements <= 10^9

// 1 <= n2 <= 10^2

// 1 <= m2 <= 10^2

// -10^9 <= e11', e12', .. n2 * m2 elements <= 10^9


// Format
// Input
// A number n1

// A number m1

// e11 e12.. e21 e22.. .. n1 * m1 number of elements of array a1

// A number n2

// A number m2

// e11' e12'.. e21' e22'.. .. n2 * m2 number of elements of array a2


// Output
// e11'' e12'' e13'' .. e21'' e22'' e23'' .. .. elements of prd array


// Example
// Sample Input

// 2
// 3
// 10
// 0
// 0
// 0
// 20
// 0
// 3
// 4
// 1
// 0
// 1
// 0
// 0
// 1
// 1
// 2
// 1
// 1
// 0
// 0

// Sample Output
// 10 0 10 0
// 0 20 20 40

public class Main{
    public static  Scanner scn = new Scanner(System.in);


    public static void input(int arr[][])
 {
     int row = arr.length;
     int clm = arr[0].length;
     for(int i=0; i<row; i++)
     {
         for(int j=0 ; j<clm; j++)
         {
             arr[i][j] = scn.nextInt();
         }
     }
 }
 public static void display(int arr[][])
 {
    int row = arr.length;
    int clm = arr[0].length;
    for(int i=0; i<row; i++)
    {
        for(int j=0 ; j<clm; j++)
        {
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
 }


     public static void main(String[] args) {
       int r1 = scn.nextInt();
       int c1 = scn.nextInt();

       int a[][] = new int[r1][c1];
       input(a);

       int r2 = scn.nextInt();
       int c2 = scn.nextInt();
       
       if(c1 != r2)
       {
           System.out.println("Invalid input");
       }

      else{
         int b[][] = new int[r2][c2];
          input(b); 
          multiply(a , b);
         }
    
      
               
        
    }
    public static void multiply(int a[][], int b[][])
    {
         int r1 = a.length;
         int c1 = a[0].length;
         int c2 = b[0].length;
         int c[][] = new int[r1][c2]; 
         int sum=0;
       for(int i=0; i<r1; i++)
       {
           for(int j = 0; j<c2; j++)
           {
               for(int k=0; k< c1; k++)     //  c1 and r2 both are equal respectly when traveling matrix
            
               {
                   sum  =  sum + a[i][k] * b[k][j] ;
               }
               c[i][j] = sum;
               sum =0; // for next row and clm
           }
       }
       display(c);    
    }
}

 