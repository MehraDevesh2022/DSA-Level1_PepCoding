/*
 * Digit Frequency
Easy  Prev   Next
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
Input Format
A number n
A digit d
Output Format
A number representing frequency of digit d in number n
Question Video

  COMMENTConstraints
0 <= n <= 10^9
0 <= d <= 9
  
Sample Input
994543234
 4
Sample Output
3
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n  = scn.nextInt();
        int val  = scn.nextInt();
        int result = DigitFrequency(n,val);
        System.out.println(result);

    }
    public static int DigitFrequency(int n , int val)
    {  int num=0;
        while(n !=0)
        {
            int rem =n%10;
            n=n/10;
            if(rem==val)
            {
                num++;
            }
        }
        return num;
    }
}