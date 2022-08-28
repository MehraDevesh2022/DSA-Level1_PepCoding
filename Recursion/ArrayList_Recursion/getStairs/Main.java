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

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> FinalAns = getStairPaths(n);
        System.out.println(FinalAns);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        // call for step 1
        ArrayList<String> myAns = new ArrayList<>();
        if ((n - 1) >= 0) {
            ArrayList<String> recAns = getStairPaths(n - 1); // faith  
            for (String s : recAns) {
                myAns.add("1" + s);  // expecation : i will add myshelf in front of recAns
            }
        }
     // call for step 2
        if ((n - 2) >= 0) {
            ArrayList<String> recAns = getStairPaths(n - 2);
            for (String s : recAns) {
                myAns.add("2" + s);
            }
        }
    // call for step 3
        if ((n - 3) >= 0) {
            ArrayList<String> recAns = getStairPaths(n - 3);
            for (String s : recAns) {
                myAns.add("3" + s);
            }
        }

        return myAns;
    }

}






