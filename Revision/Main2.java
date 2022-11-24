/*
 * Rotate By 90 Degree
Easy  Prev   Next
1. You are given a number n, representing the number of rows and number of columns.
2. You are given n*n numbers, representing elements of 2d array a.
3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
*Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements
Output Format
output is taken care of by display function
Question Video

  COMMENTConstraints
1 <= n <= 10^2
-10^9 <= e1, e2, .. n * n elements <= 10^9
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
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14
 */

package revision;

import java.util.Scanner;


public class Main2 {
    static Scanner scn = new Scanner(System.in);

    public static void input(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                arr[i][j] = scn.nextInt();
        }
    }

   public static void rotate90(int arr[][]){
    for(int j=0; j<arr[0].length; j++){
        for(int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i][j] + " ");
        }
       System.out.println(); 
    }
   }

    public static void main(String[] args) {

        int n = scn.nextInt();

        int arr[][] = new int[n][n];
        input(arr);
   
        rotate90(arr);

    }
}