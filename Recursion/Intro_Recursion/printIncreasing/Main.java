/*
 * Print Increasing
Easy  Prev   Next
1. You are given a positive number n. 
2. You are required to print the counting from 1 to n.
3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
Output Format
1
2
3
..
n
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      printIncreasing(n);
    }

    public static void printIncreasing(int n){
        // base case & work 1st
        if(n==0){
             return;
        }
        // work2 & faith
        printIncreasing(n-1);
        //work3 & expecatation
        System.out.println(n);
    }

}