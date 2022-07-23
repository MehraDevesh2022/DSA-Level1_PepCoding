// Pattern 1
// Easy

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints
// 1 <= n <= 100

// Format
// Input
// A number n

// Output
// pat11

// Example
// Sample Input

// 2

// Sample Output
// *	
// *	*

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        // for initial state
        int star =1;
        // int space= n-1;
        for(int row=1; row<=n; row++)
        {
            // for star
            for(int cst=1; cst<=star; cst++)
            {
                System.out.print("*\t");
            }
            // for space
            // for(int csp=1; csp<=space; csp++)
            // {
            //     System.out.print("\t");
            // }
            //update
            star++;
            // space--;
            System.out.println();
        }

    }
}