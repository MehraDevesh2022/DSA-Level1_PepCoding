import java.util.Scanner;

/*
Pattern 16
Easy

1. You are given a number n.
      2. You've to write code to print the pattern given in output format below

Constraints
1 <= n <= 10

Format
Input
A number n

Output
pat161

Example
Sample Input

7

Sample Output
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1
*/


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star =1;
        int space =n*2-3;
        for(int row =1; row<=n; row++)
        {     int number =1;
            for(int cst =1; cst<=star; cst++)
            {
                System.out.print(number +"\t");
                number++;
            }
            for(int csp=1; csp<=space; csp++)
            {
                System.out.print("\t");
            }
            if(row==n)
            {
                number--;
                star--;
            }
            for(int cst =1; cst<=star; cst++)
            {     number--;
                System.out.print(number +"\t");
               
            }

            star++;
            space=space-2;
            System.out.println();
        }
    }
}
