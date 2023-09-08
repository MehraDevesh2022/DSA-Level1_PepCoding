/*
Digits Of A Number :
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

import java.util.*; // contains Collections framework
public class Main{
  public static void main(String[] args){
       Scanner scn  = new Scanner(System.in);
         int n  =  scn.nextInt();
        
        int count  = CountDigit(n);
         int pow  = (int)Math.pow(10 , count-1);
         while(pow !=0){
          System.out.println(n/pow);
           n = n%pow;
           pow /=10;

         }
          
         


  }
  public static int CountDigit(int n){
      int count =0;
      while(n!=0){
        n /=10;
        count++;
      }
      return count;
  }

}

