
/*
 * " In order to understand recursion, one must first understand recursion."
 * 
 * Print Permutations
 * Easy Prev Next
 * 1. You are given a string str.
 * 2. Complete the body of printPermutations function - without changing
 * signature - to calculate and print all permutations of str.
 * Use sample input and output to take idea about permutations.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * Input Format
 * A string str
 * Output Format
 * Permutations of str in order hinted by Sample output
 * Question Video
 * 
 * COMMENTConstraints
 * 0 <= str.length <= 7
 * Sample Input
 * abc
 * Sample Output
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 */
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str, "");

    }

    public static void printPermutations(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }
      
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i); // when i =0 so left str = from(0 to -1) => "" will return bcz end idx cosnsider exclusive elm 
            String right = str.substring(i + 1); // when (length ==3) && i == str.length()-1; so right str = (2+1); =>
                                                 // "" will return
            String ros = left + right; // ros : rest of string
            printPermutations(ros, asf + ch);
        }

    }

}