import java.util.Scanner;
/*
Pattern 6
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
pat61

Example
Sample Input

5

Sample Output
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*

*/


public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n= scn.nextInt();
      int star =(n/2)+1;
      int space = 1;
      for(int row = 1; row<=n; row++)
      {
          // print star on console screen
          for(int cst =1; cst<=star; cst++)
          {
              System.out.print("*\t");
          }
          // space
          for(int csp=1; csp<=space; csp++)
          {
               System.out.print("\t");
          }
          // print star on console screen
          for(int cst =1; cst<=star; cst++)
          {
              System.out.print("*\t");
          }
           // update
           if(row<=n/2)
           {
              star--;
              space=space+2; 
           }
           else{
               star++;
               space = space-2;
           }
           System.out.println();
      }

    }
}

