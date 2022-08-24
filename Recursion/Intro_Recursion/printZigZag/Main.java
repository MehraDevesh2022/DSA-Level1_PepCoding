/*
 * Print Zigzag
 * Easy Prev Next
 * 1. Here are a few sets of inputs and outputs for your reference
 * Input1 -> 1
 * Output1 -> 1 1 1
 * 
 * Input2 -> 2
 * Output2 -> 2 1 1 1 2 1 1 1 2
 * 
 * Input2 -> 3
 * Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
 * 
 * 2. Figure out the pattern and complete the recursive function pzz to achieve
 * the above for any positive number n.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is.Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * Input Format
 * A number n
 * Output Format
 * As discussed in point 1 of description
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 10
 * Sample Input
 * 3
 * Sample Output
 * 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
 */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
    }

    public static void pzz(int n) {
        // work 1st and base case
        if (n == 0) {
            return;
        }
        // work 2nd and expectation
        System.out.print(n + " ");
        // work 3 and faith 1st
        pzz(n - 1);
        // work 4rd and expectation
        System.out.print(n + " ");
        // work 5 and faith 2nd
        pzz(n - 1);
        // work 6th and expectation
        System.out.print(n + " ");
    }

}