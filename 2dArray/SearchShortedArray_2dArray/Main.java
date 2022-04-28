// Search In A Sorted 2d Array
// Medium

// 1. You are given a number n, representing the number of rows and columns of a square matrix.
// 2. You are given n * n numbers, representing elements of 2d array a. 
// Note - Each row and column is sorted in increasing order.
// 3. You are given a number x.
// 4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
// 5. In case element is not found, print "Not Found".

// Constraints
// 1 <= n <= 10^2
// -10^9 <= e11, e12, .. n * m elements <= 10^9
// All rows and columns are sorted in increasing order

// Format
// Input
// A number n
// e11
// e12..
// e21
// e22..
// .. n * n number of elements of array a
// A number x

// Output
// row
// col of the location where element is found or "Not Found" if element is not in the matrix

// Example
// Sample Input

// 4
// 11
// 12
// 13
// 14
// 21
// 22
// 23
// 24
// 31
// 32
// 33
// 34
// 41
// 42
// 43
// 44
// 43

// Sample Output
// 3
// 2

package SearchShortedArray_2dArray;

import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int a[][] = new int[n][n];
        input(a);
        int x = scn.nextInt();
        Search(a, x);

    }

    public static void input(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }
    }

    public static void Search(int a[][], int x)

    {
        int n = a.length;
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) // when x not exist then i or  j exit the matrix and become j < 0 or i >=n
        {
            int val = a[i][j]; // start with first row last colom else last row fist colom

            if (val == x) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (val < x) { // when x is greater than val find next row
                i++;
            } else {
                j--;
            }

        }
        System.out.println("Not Found");
    }
}
