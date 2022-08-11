/*
 * String Compression
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
   //using two pointer curr and prv 
	public static String compression1(String str){
	      StringBuilder sb = new StringBuilder(); // using StringBuilder
          char curr = str.charAt(0);
	       sb.append(curr); // adding first element of string in empty sb 
           for(int i=1; i<str.length(); i++){
            curr = str.charAt(i);
            char prv = str.charAt(i-1);
            if(curr != prv){
                sb.append(curr);
            }
           }

		return sb.toString();
	}

	public static String compression2(String str){
	 
        StringBuilder sb = new StringBuilder();
        char curr = str.charAt(0);
        sb.append(curr);
        int count =1;
        for (int i = 1; i < str.length(); i++) {
            curr = str.charAt(i);
            char prv = str.charAt(i -1);
             if(curr == prv){
                count++; // when values are same
             }
             else{
                if(count > 1){
                    sb.append(count); // curr >1 because if only 1 time then no need to add number occures 
                }
                sb.append(curr);
                count =1;
             }
        }
          if (count > 1) {  // when last element remains but loop terminated.
            sb.append(count);
        }
        return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}