import java.util.Scanner;

 /*
  Pattern 18
Easy

1. You are given a number n.
      2. You've to write code to print the pattern given in output format below

Constraints
1 <= n <= 10
 Also, n is odd.

Format
Input
A number n

Output
pat181

Example
Sample Input

7

Sample Output
*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*
 */

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int midSpace =n;
        int space =0;
        int star =n;
        for(int row =1; row<=n; row++)
        {
            for(int csp=1; csp<=space; csp++)
            {
                System.out.print("\t");
            }
            for(int cst=1; cst<=star; cst++ )
            {   if(row>1 && row<=n/2 && cst>1 &&cst<star)
                System.out.print("\t");
                else
                {
                    System.out.print("*\t");
                }
            }
          
            
           

            //upadte

            if(row<=n/2)
            {
                star=star-2;
                
                space++;
            }
            else{
                star=star+2;
               
                space--;
            }
            System.out.println();
            
        }
    }
}
