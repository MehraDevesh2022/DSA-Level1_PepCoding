import java.util.Scanner;

/*
Pattern 15
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
pat151

Example
Sample Input

5

Sample Output
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
*/
// in this pattern every row has value incresing by row and in column first incresing after mid decresaing
public class Main {
    public static void main(String[] args) {
       Scanner scn =new Scanner(System.in);
       int n = scn.nextInt();
       int star=1;
       int val=1;
       int space =n/2;
       for(int row =1; row<= n; row++)
       {  // val for row value and columnval for column value
        
            int columnVal =val;
           for(int csp=1; csp<=space; csp++)
           {
               System.out.print("\t");
           }
           for(int cst=1; cst<=star; cst++ )
           
            {
                System.out.print(columnVal + "\t");
                if(cst<=star/2) 
                {
                    columnVal++;

                }
                else{
                    columnVal--;
                }
                   
             
              
             

               
           }

           //update
           if(row<=n/2)
           {    val++;
               space--;
               star=star+2;

           }
           else{
               space++;
               star=star-2;
               val--;
           }
           System.out.println();
       } 
    }
}
