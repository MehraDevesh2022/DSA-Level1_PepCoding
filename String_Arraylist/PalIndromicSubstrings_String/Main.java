

// 1. You are given a string. 
// 2. You have to print all palindromic substrings of the given string.

// Constraints
// 1 <= length of string <= 500

// Format
// Input
// A String

// Output
// All palindromic substrings(one in a line).
// First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

// Example
// Sample Input

// abcc

// Sample Output
// a
// b
// c
// cc
// c
import java.io.*;
import java.util.*;

public class Main {
      public static boolean isPalindromic(String str){
        int i =0;
        int j = str.length()-1;
        while(i<=j){
            char left = str.charAt(i);
            char right = str.charAt(j);
            if(left !=right){
                return false;
            }
            i++;
            j--;
        }
        
        
        return true;

      }
     public static void subString(String str){
            int n = str.length();
            for(int start =0; start<n; start++){
                for(int end =start ; end<n; end++){
                    String ss = str.substring(start, end +1); // end +1 bcz subrtings function termiante at end -1 index
                    
                    if(isPalindromic(ss)){
                        System.out.println(ss);
                    }
                    
                }
                
            }
     }
	public static void solution(String str){
		//write your code here
		subString(str);

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
  
		solution(str);
	}

}