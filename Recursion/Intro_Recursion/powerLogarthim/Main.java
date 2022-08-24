/*
 * 
Power-logarithmic
Easy  Prev   Next
1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function.

Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.

Note2 -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number x
A number n
Output Format
x raised to the power n
Question Video

  COMMENTConstraints
1 <= x <= 10
0 <= n <= 9
Sample Input
2
5
Sample Output
32
 * 
 */


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);

    }

    public static int power(int x, int n) {
        // base case and work 1
        if (n == 0) {
            return 1; // bcz any num power 0 returns 1
        }
        // work 2 and faith =>
        int result = power(x, n / 2);
        // work3 and expectation. if n value is even (result * result) else (result *
        // result *x);

        if (n % 2 == 0) {
            // when n is even
            int ans = result * result;
            return ans;
        } else {
            // when n is odd
            int ans = result * result * x;
            return ans;
        }
    }

}