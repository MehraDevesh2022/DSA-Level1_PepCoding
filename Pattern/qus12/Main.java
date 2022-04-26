import java.util.Scanner;
/*
Pattern 12
Easy

1. You are given a number n.
2. You've to create a pattern as shown in output format.

Constraints
1 <= n <= 5

Format
Input
A number n

Output
pat121

Example
Sample Input

5

Sample Output
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377

*/

 
public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int a=0;
        int b=1;
        int c;
        int tnl=1; // total number in line
        for(int row=1; row<=n; row++)
        {
            for(int colum=1; colum<=tnl; colum++)
            {
                System.out.print(a +"\t");
                c=a+b;
                a=b;
                b=c;
            }

            //upadte value
            tnl++;
            System.out.println();
        }
    }  
}
