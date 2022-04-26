import java.util.Scanner;

/*
Pattern 9
Easy

1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100
 Also, n is odd.

Format
Input
A number n

Output
pat91

Example
Sample Input

5

Sample Output
--------------------
*				*  	
	*		*		
		*			
	*		*		
*				*
-------------------


*/


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // i, j method

        for(int i=0; i<n; i++)
        {
              for(int j=0; j<n; j++)
              {
                // find relation between i,j  --> when i==j (0,0)(1,1)(2,2)(3,3)(4,4) || when i+j=n-1; (0,4)(1,3)(2,2)(3,1)(4,0)
                if(i==j || i+j==(n-1))
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

