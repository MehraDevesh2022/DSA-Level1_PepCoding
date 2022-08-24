/* 
String Compression
Easy  Prev   Next
1. You are given a string. 
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
Input Format
A String
Output Format
Two strings representing first compressed string and second compressed string respectively.
Question Video

  COMMENTConstraints
1 <= length of string <= 1000
Sample Input
wwwwaaadexxxxxx
Sample Output
wadex
w4a3dex6
*/


import java.io.*;
import java.util.*;

public class Main {

    public static String compression1(String str){
		// write your code here
		StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prv = str.charAt(i-1);
            if(curr != prv){
                sb.append(curr);
            } 
        }

		return sb.toString();
	}

    public static String compression2(String str) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int count =1;
        for(int i=1; i<str.length(); i++){ // i=1 bcz we alredy appended 0 idx char from str in sb
            char curr = str.charAt(i);
            char prv = str.charAt(i-1);
            if(prv == curr){
                count++;
            }
            else {
                if(count>1){
                    sb.append(count);
                }
                count =1;
                sb.append(curr);
            }
            
        }
        // while loop terminated but count last value may reamins to append at sb 
        if(count>1){
            sb.append(count);
        }
        return sb.toString(); // converting StringBuilder to String
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}