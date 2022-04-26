/*
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100
 Also, n is odd.

Format
Input
A number n

Output
pat51

Example
Sample Input

5

Sample Output
		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = 1;
        int space = n/2;
        for (int row = 1; row <= n; row++)

        {
              
            for (int csp = 1; csp <= space; csp++) {
                System.out.print(("\t"));
            }
            // star print
            for (int cst = 1; cst <= star; cst++) {
                System.out.print("*\t");
            }

            //update
            if(row<=n/2)
            {
                star=star+2;
                space--;
            }
            else{
                star=star-2;
                space++;
            }
            System.out.println();
        }

    }
}
