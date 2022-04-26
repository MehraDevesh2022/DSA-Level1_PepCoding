import java.util.Scanner;

/*
Pattern 13
Easy

1. You are given a number n.
2. You've to create a pattern as shown in output format

Constraints
1 <= n <= 10

Format
Input
A number n

Output
pat131

Example
Sample Input

5

Sample Output
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1
*/


// with the help of pascele theorim iCj = (iCj * (i-j) )/ iCj
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=0; i<n; i++)
        {   // every row has staring value is 1
            int iCj =1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(iCj + "\t");
                int iCjP =  (iCj * (i-j)) / (j+1);
                iCj =iCjP;
                }
                System.out.println();
            }
        }
    }
         