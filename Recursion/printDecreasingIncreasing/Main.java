/*
 * Print Increasing Decreasing
 * Easy Prev Next
 * 1. You are given a positive number n.
 * 2. You are required to print the counting from n to 1 and back to n again.
 * 3. You are required to not use any loops. Complete the body of pdi function
 * to achieve it. Don't change the signature of the function.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is.Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * Input Format
 * A number n
 * Output Format
 * n
 * n - 1
 * n - 2
 * ..
 * 1
 * 1
 * 2
 * 3
 * ..
 * n
 */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n) {
        // wrok 1 and base case
        if (n == 0) {
            return;
        }
        // work 2 and expectation
        System.out.println(n);
        pdi(n - 1); // work 3 and faith
        // work 4 and expectation
        System.out.println(n);

    }

}