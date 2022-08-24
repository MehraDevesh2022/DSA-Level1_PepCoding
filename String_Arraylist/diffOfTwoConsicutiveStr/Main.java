package diffOfTwoConsicutiveStr;

/*
 * String With Difference Of Every Two Consecutive Characters
Easy  Prev   Next
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
Input Format
A String
Output Format
A String
Question Video

  COMMENTConstraints
1 <= length of string <= 1000
Sample Input
pepCODinG
 * 
 */
import java.io.*;
import java.util.*;

public class Main {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        char curr = str.charAt(0);
        for(int i=1; i<str.length(); i++){
            char prv = str.charAt(i-1);
             sb.append(prv);
            curr = str.charAt(i);
         
            int diff = curr-prv;
            sb.append(diff);
        }
        sb.append(curr);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }

}