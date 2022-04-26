package reccursion1st;
/*
1. You are given a positive number n. 
2. You are required to print the counting from n to 1 and back to n again.
3. You are required to not use any loops. Complete the body of pdi function to achieve it. Don't change the signature of the function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
Output Format
n
n - 1
n - 2
..
1
1
2
3
..
n
*/

import java.util.Scanner;

public class printIncDec {
    public static void main(String[] arg)
    {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        printIncDec(n);
    }
    public static void printIncDec(int n)
    {
        if(n==0) //base case
       {
            return; 
        }
        System.out.println(n); // expectaion- i'll print myself
        printIncDec(n-1); // faith- (n-1) do their work
        System.out.println(n); // expectaion - again i'll print myself
    }
}
