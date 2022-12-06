/* AS SAME AS LEETCODE 20
 *                    
       "The purpose of a software engineer is to control complexity not to create it"
 * 
 * 
 * 
 *  Balanced Brackets
 * Easy Prev Next
 * 1. You are given a string exp representing an expression.
 * 2. You are required to check if the expression is balanced i.e. closing
 * brackets and opening brackets match up well.
 * 
 * e.g.
 * [(a + b) + {(c + d) * (e / f)}] -> true
 * [(a + b) + {(c + d) * (e / f)]} -> false
 * [(a + b) + {(c + d) * (e / f)} -> false
 * ([(a + b) + {(c + d) * (e / f)}] -> false
 * Input Format
 * A string str
 * Output Format
 * true or false
 * Question Video
 * 
 * COMMENTConstraints
 * 0 <= str.length <= 100
 * Sample Input
 * [(a + b) + {(c + d) * (e / f)}]
 * Sample Output
 * true
 * 
 */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean ans = isBalanced(str);
        System.out.println(ans);
    }

    private static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.size() == 0 || st.peek() != '(') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == ']') {
                if (st.size() == 0 || st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == '}') {
                if (st.size() == 0 || st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }

        return st.size() == 0; // agar st.size 0 bacha to true else false
    }

}