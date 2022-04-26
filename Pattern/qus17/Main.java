import java.util.Scanner;
/*
Pattern 17
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
pat171

Example
Sample Input

5

Sample Output

        *	
		*	*	
*	*	*	*	*	
		*	*	
		*


        */



public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int star=1;
        int space =n/2;
        for(int row=1; row<=n; row++)
        {     //space 
            for(int csp=1; csp<=space; csp++)
            {
                if(row !=n/2+1) // for midlle two extra star . we need 2 star more intead of space
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t"); // for 2 more star
                }
            }
            // star afer space
            for(int cst=1; cst<=star; cst++)
            {
                System.out.print("*\t");
            }

            //update
            if(row<=n/2)
            {
                star++;
            }
            else{
                star--;
            }
            System.out.println();
        }

    }
}
