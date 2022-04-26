import java.util.Scanner;

/*
 2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100

Format
Input
A number n

Output
pat81

Example
Sample Input

5



			*		
		*			
	*				
*

*/


public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
    
      int space=n-1;

      for(int row=1; row<=n; row++)
      {   // print space
          for(int csp=1; csp<=space; csp++)
          {
              System.out.print("\t");
          }
          // star print
          System.out.print("*\t");

          //upadte
          space--;
          System.out.println();
      }
    }
}
