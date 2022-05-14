// First Index And Last Index
// Easy

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.

// Asssumption - Array is sorted. Array may have duplicate values.

// Constraints
// 1 <= n <= 1000
// 1 <= n1, n2, .. n elements <= 100
// 1 <= d <= 100

// Format
// Input
// A number n
// n1
// n2
// .. n number of elements
// A number d

// Output
// A number representing first index
// A number representing last index

// Example
// Sample Input

// 15
// 1
// 5
// 10
// 15
// 22
// 33
// 33
// 33
// 33
// 33
// 40
// 42
// 55
// 66
// 77
// 33

// Sample Output
// 5
// 9


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i =0; i<n; i++)
        {
            a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int FIdx = FirstIndex(a,d);
        int LIdx = LastIndex(a,d);
        System.out.println(FIdx);
        System.out.println(LIdx);
       

    }
    public static int FirstIndex(int a[], int d)
    {
         
        int i=0;
        int j=a.length-1;
        int FIdx = -1;
        int mid =0;
         while(i<=j)
         {     mid = (i+j)/2;
             if(a[mid] == d)
             {
               FIdx =mid;
               // when occurrens of same digit is more than one than we look first idx left side
               j = mid -1;
             }
             else if(a[mid] < d)
             {
              i =mid+1;
             }
             else{
              j= mid-1;
             }
         }
         return FIdx;
    }
    public static int LastIndex(int a[], int d)
    {
         
        int i=0;
        int j=a.length-1;
        int LIdx = -1;
        int mid =0;
         while(i<=j)
         {     mid = (i+j)/2;
             if(a[mid] == d)
             {
               LIdx =mid;
               // when occurrens of same digit is more than one than we look last idx right side
               i = mid +1;
             }
             else if(a[mid] < d)
             {
              i =mid+1;
             }
             else{
              j= mid-1;
             }
         }
         return LIdx;
}
}
