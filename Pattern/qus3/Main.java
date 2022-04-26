import java.util.Scanner;

// Pattern 3
// Easy

// 1. You are given a number n. 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints
// 1 <= n <= 10

// Format
// Input
// A number n

// Output
// pat31

// Example
// Sample Input

// 5

// Sample Output
// 				*
// 			*	*
// 		*	*	*
// 	*	*	*	*
// *	*	*	*	

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //intial point
        int star = 1;
        int space = n-1;
        // FOr row
        for (int row = 1; row <= n; row++) {
            // print space
            for (int csp = 1; csp <= space; csp++)
             {
                System.out.print("\t");
            }

            // print star
            for (int cst = 1; cst <= star; cst++) {
                System.out.print("*\t");
            }

            // upadte
            star++;
            space--;
            System.out.println();

        }
    }
}