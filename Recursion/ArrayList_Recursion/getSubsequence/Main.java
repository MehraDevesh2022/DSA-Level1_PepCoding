// Get Subsequence
// Easy  Prev   Next
// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
// Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
// Input Format
// A string str
// Output Format
// Contents of the arraylist containing subsequences as shown in sample output
// Question Video

//   COMMENTConstraints
// 0 <= str.length <= 20
// Sample Input
// abc
// Sample Output
// [, c, b, bc, a, ac, ab, abc]


import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner(System.in);  
          String str = new String();
                 str = scn.nextLine();
          ArrayList<String> SubSeq = gss(str);
          System.out.println(SubSeq);
    }

    public static ArrayList<String> gss(String str) {
        // base case => return empty value as array list
           if(str.length() == 0){ // after last elm " " == 0  its same 
               ArrayList<String> base = new ArrayList<>();
               base.add(" ");
               return base;
           }
        // first character extracting from string for make call for other subString 
           char ch = str.charAt(0);
           String subString = str.substring(1);
           // call with subString :
           ArrayList<String> recAns = gss(subString);  // faith : [a call ===> bc and get ans as array list]
           ArrayList<String> finalAns = new ArrayList<>();
           // expecation => what ever ans comes i will add myShelf 
           for(String s : recAns){
              finalAns.add(s);           //    ["" , c , b , bc] . when not adding 
           }                                                              // adding from here
             for(String s : recAns){                      //.............  //................
              finalAns.add(ch + s);    // adding himshelf ["" ,c , b , bc  , a , ac , ab, abc]
           }
           return finalAns;
           
    }

}