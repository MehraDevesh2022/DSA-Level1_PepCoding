package reccursion1st;
/* 
1. You are given a positive number n. 
2. You are required to print the counting from 1 to n.
3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
*/

import java.util.Scanner;

public class printIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        printIncreasing(n);
    }
    public static void printIncreasing(int n)
    {
        if(n<=0)
        {
          return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
