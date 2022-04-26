import java.util.Scanner;

// Pattern 4
// Easy

// 1. You are given a number n. 2. You've to create a pattern of * and separated by tab as shown in output format.

// Constraints
// 1 <= n <= 100

// Format
// Input
// A number n

// Output
// pat41

// Example
// Sample Input

// 5

// Sample Output
// * *	*	*	*		
// 	 *	*	*	*	
// 		*	*	*	
// 			*	*	
// 				*
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = n;
        int space = 0;
        for (int row = 1; row <= n; row++)

        {

            for (int csp = 1; csp <= space; csp++) {
                System.out.print(("\t"));
            }
            // star print
            for (int cst = 1; cst <= star; cst++) {
                System.out.print("*\t");
            }

            star--;
            space++;
            System.out.println();
        }

    }
}
