import java.util.Scanner;

/*
Reverse An Array
Easy

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.

Constraints
0 <= n < 10^4
-10^9 <= a[i] <= 10^9

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

5
1
2
3
4
5

Sample Output
5 4 3 2 1
*/


public class Main {
    public static void main(String[] args) {
        Scanner scn=  new Scanner(System.in);
        // size of array
        int n =  scn.nextInt();
        //array
        int a[] = new int[n];
        // elemts of the array
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();

        }
          // function call
          Reverse_array(a ,n);
    }

       public static void Reverse_array(int a[], int n)
       {    // size of array 
           int j = n-1;
           // swaping first and last elements with thier respcted elemtents
           for(int  i= 0 ; i<j; i++)
           {
               int temp = a[i];
               a[i] = a[j];
               a[j] =temp;
               j--;
           }
           // display
           for(int i=0; i< n; i++)
           {
               System.out.println(a[i]);
           }  
       }
}
