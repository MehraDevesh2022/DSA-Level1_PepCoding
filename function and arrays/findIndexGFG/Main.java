//{ Driver Code Starts
//Initial Template for Java

/*
 * Find Index
SchoolAccuracy: 48.64%Submissions: 17650Points: 0
Given an unsorted array Arr[] of N integers and a Key which is present in this array. You need to write a program to find the start index( index where the element is first found from left in the array ) and end index( index where the element is first found from right in the array ).

Example 1:

Input:
N = 6
arr[] = { 1, 2, 3, 4, 5, 5 }
Key = 5
Output:  4 5
Explanation:
5 appears first time at index 4 and
appears last time at index 5.
(0 based indexing)
 

Example 2:

Input:
N=6
arr[] = { 6, 5, 4, 3, 1, 2 }
Key = 4
Output:  2 2 

Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function findIndex() that takes array a, integer N and integer key as parameters and returns an array of length 2 in which at first index contains the value of start index and at the second index contains the value of end index. If the key does not exist in the array then return -1 for both start and end index in this case.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 106
 * 
 * 
 */


import java.util.*;
import java.lang.*;
import java.io.*;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            Solution ob = new Solution();
            int ar[] = ob.findIndex(arr, n, key);
            System.out.println(ar[0] + " " + ar[1]);
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int N, int key) {
        int left = -1;
        int right = -1;
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            if (arr[i] == key && left == -1) {
                left = i;
            } else {
                if (left == -1)
                    i++;
            }
            if (arr[j] == key && right == -1) {
                right = j;
            } else {
                if (right == -1)
                    j--;
            }
            if (left != -1 && right != -1) {
                break;
            }
        }
        int a[] = new int[2];
        a[0] = left;
        a[1] = right;

        return a;
    }
}