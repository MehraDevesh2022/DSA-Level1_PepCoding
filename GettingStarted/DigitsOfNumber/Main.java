import java.util.Scanner;

/*
Digits Of A Number
Easy  Prev   Next
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Input Format
"n" where n is any integer.
Output Format
d1
d2
d3
... digits of the number
Question Video

  COMMENTConstraints
1 <= n < 10^9
Sample Input
65784383
Sample Output
6
5
7
8
4
3
8
3

*/
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
        int n= scn.nextInt();
        int temp=n;
        int d=0;
        int pow=1;
        while(temp >10) // bcz for bigger number pow liimit will exceed in int case 
        {
            temp=temp/10;
            pow =pow*10;
           
        }
      while(n!=0)
      {
          int ans = n/pow;
          System.err.println(ans);
           n = n%pow;
           pow=pow/10;
           

      }
     
    }
}
