import java.util.Scanner;
/*
Pattern 19
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
pat191

Example
Sample Input

3

Sample Output
*	*	*	
*	*	*	
*	*	*

*/
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star=n;
        int space =0;
        for(int row =1; row<=n; row++)
        {
          
            for(int cst=1; cst<=star; cst++)
            {  
                if(row ==1)
                {
                   if(cst>n/2+1 && cst<star)
                   System.out.print("\t");
                   else{
                       System.out.print("*\t");
                   }
                }
                else if(row <=n/2)
                {
                     if(cst <=n/2 || cst>n/2+1 && cst<star)
                     System.out.print("\t");
                     else 
                     System.out.print("*\t");
                }
                else if(row == n/2+1)
                {
                    System.out.print("*\t");
                }
                else if(row>n/2 && row<n)
                {
                   if(cst>1 && cst < n/2+1 || cst>n/2+1)
                   System.out.print("\t");
                   else
                   System.out.print("*\t");
                }
                else{
                    if(cst>1 && cst<n/2+1)
                    {
                        System.out.print("\t");
                    }
                    else
                    System.out.print("*\t");

                }
            }
            System.out.println();
         
        }
    }
}
