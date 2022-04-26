import java.util.Scanner;

// Bar Chart
// Easy  Prev   Next
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print a bar chart representing value of arr a.
// Input Format
// A number n
// n1
// n2
// .. n number of elements
// Output Format
// A bar chart of asteriks representing value of array a

// Example
// Sample Input

// 5
// 3
// 1
// 0
// 7
// 5

// Sample Output
// 				*
// 				*	
// 				*	*
// 				*	*
// *			*	*	
// *			*	*	
// *	*		*	*	

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int a[] = new int[n];
         for(int i=0; i<n; i++)
        {
           a[i] = scn.nextInt();
        }
       
       BarChart(a);
    }
    public static void BarChart(int a[])
    {
        
      
        int max = a[0];
        for(int i=1; i<a.length; i++)
        {
          if(max<a[i])
          {
             max = a[i];
          }
          
        }
        for(int row=0; row<max; row++)
        {
          for(int clm =0; clm<a.length; clm++ )
          {
              if(max - a[clm] == row)
              {
                  System.out.print("*\t");
              }
              else
              {
                  System.out.print("\t");
              }
          }
          System.out.println();
        }

    }
}
