// Pattern 2
// Easy

// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints
// 1 <= n <= 100

// Format
// Input
// A number n

// Output
// pat21

// Example
// Sample Input

// 5

// Sample Output
// *	*	*	*	*	
// *	*	*	*	
// *	*	*	
// *	*	
// *
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = n;
        int space = 0;

        // For row
        for(int row=1; row<=n; row++)
        {
            // for star in console
            for(int cst=1; cst<=star; cst++)
              {
                  System.out.print("*\t");
              }
              //for space in console screen
                for(int csp=1; csp<=space; csp++)
                {
                    System.out.print("\t");
                }
                //update
                star--;
                space++; 
                System.out.println();
        }

    }
}
