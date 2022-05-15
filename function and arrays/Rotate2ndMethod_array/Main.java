// Rotate An Array
// Easy

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to
// the left for negative values of k.

// Constraints
// 0 <= n < 10^4
// -10^9 <= a[i], k <= 10^9

// Format
// Input
// Input is managed for you

// Output
// Output is managed for you

// Example
// Sample Input

// 5
// 1
// 2
// 3
// 4
// 5
// 3

// Sample Output
// 3 4 5 1 2

import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    // revrese function
    public static void reverse(int a[], int i, int j) {
        while (i <= j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    // swap function
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // actual function for code
    public static void rotate(int[] a, int k) {
        // write your code here
         int n = a.length;

        k = k % n;
        // if k is negative value
        if (k < 0) {
            k = n + k;
        }

        reverse(a, 0, n - k - 1);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}