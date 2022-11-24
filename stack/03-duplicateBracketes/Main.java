/*
 * Duplicate Brackets
 * Easy Prev Next
 * 1. You are given a string exp representing an expression.
 * 2. Assume that the expression is balanced i.e. the opening and closing
 * brackets match with each other.
 * 3. But, some of the pair of brackets maybe extra/needless.
 * 4. You are required to print true if you detect extra brackets and false
 * otherwise.
 * 
 * e.g.'
 * ((a + b) + (c + d)) -> false
 *  
 * Input Format
 * A string str
 * Output Format
 * true or false
 * Question Video
 * 
 * COMMENTConstraints
 * 0 <= str.length <= 100
 * Sample Input
 * (a + b) + ((c + d))
 * Sample Output
 * true
 */

 import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
         String str = scn.nextLine();
   
         boolean ans = isDupicate(str);
         System.out.println(ans);
    }

    private static boolean isDupicate(String str ) {
      Stack<Character> st = new Stack<>();
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch != ')') {
          st.push(ch);
        } else {
          if (st.peek() == '(') {
             return true; // agar stack main closing brackets ke just baad opening brackets aata hai iska mtlb hai uske beech mai koi bhi  content nhi tha to i wha dupicate useless barckets hoga to true return kr do
          }
          while (st.peek() != '(') {
            st.pop();
          }
          st.pop();
        }

      }
       return false;
    }

}