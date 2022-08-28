/*
 * " First, solve the problem. Then, write the code.
 * -John Johnson"
 * 
 * 
 * Get Stair Paths
 * Easy Prev Next
 * 1. You are given a number n representing number of stairs in a staircase.
 * 2. You are standing at the bottom of staircase. You are allowed to climb 1
 * step, 2 steps or 3 steps in one move.
 * 3. Complete the body of getStairPaths function - without changing signature -
 * to get the list of all paths that can be used to climb the staircase up.
 * Use sample input and output to take idea about output.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * Input Format
 * A number n
 * Output Format
 * Contents of the arraylist containing paths as shown in sample output
 * Question Video
 * 
 * COMMENTConstraints
 * 0 <= n <= 10
 * Sample Input
 * 3
 * Sample Output
 * [111, 12, 21, 3]
 * 
 * 
 * 
 * 
 */






// this code is optimized way of get stairs using loop instead of 3 if statement
package getStairsOptimizedWay;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> FinalAns = getStairPaths(n);
        System.out.println(FinalAns);

    }

    // dry run from here=> for more idea
    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        for (int step = 1; step <= 3; step++) { // bcz only three step possible 1 , 2 , 3
            // if n=1 , step 2, 3 so call not occures
            if ((n - step) >= 0) {
                ArrayList<String> recAns = getStairPaths(n - step); // same like n-1 ,n-2 ,n-3
                for (String s : recAns) {
                    myAns.add(step + s);
                }

            }

        }

        return myAns;
    }

}