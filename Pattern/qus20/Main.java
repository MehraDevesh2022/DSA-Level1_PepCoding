import java.util.Scanner;

/*
Pattern 20
Easy

1. You are given a number n.
2. You've to write code to print the pattern given in output format below.

Constraints
1 <= n <= 10
 Also, n is odd.

Format
Input
A number n

Output
pat201

Example
Sample Input

5

Sample Output

*				*	
*				*	
*		*		*	
*	*		*	*	
*				*

*/

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n - 2;
        for (int i = 1; i <= n; i++) 
        {
            for(int j=1; j<=n; j++)
            {
                if(j==1 || j==n)
                {
                    System.out.print("*\t");
                }
                // we need to print star values diagonaly after n/2+1 stage 
                else if(i > n/2 && (i==j || i+j==n+1))
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