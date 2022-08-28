 /* 
     Either write something worth reading or do something worth writing.
     -Benjamin Franklin



  * 1. You are given a string str. The string str will contains numbers only,
  * where each number stands for a key pressed on a mobile phone.
  * 2. The following list is the key to characters map :
  * 0 -> .;
  * 1 -> abc
  * 2 -> def
  * 3 -> ghi
  * 4 -> jkl
  * 5 -> mno
  * 6 -> pqrs
  * 7 -> tu
  * 8 -> vwx
  * 9 -> yz
  * 3. Complete the body of getKPC function - without changing signature - to get
  * the list of all words that could be produced by the keys in str.
  * Use sample input and output to take idea about output.
  * 
  * Note -> The online judge can't force you to write the function recursively
  * but that is what the spirit of question is. Write recursive and not iterative
  * logic. The purpose of the question is to aid learning recursion and not test
  * you.
  * Input Format
  * A string str
  * Output Format
  * Contents of the arraylist containing words as shown in sample output
  * Question Video
  * 
  * COMMENTConstraints
  * 0 <= str.length <= 10
  * str contains numbers only
  * Sample Input
  * 78
  * Sample Output
  * [tv, tw, tx, uv, uw, ux]
  */


  import java.io.*;
 import java.util.*;

 public class Main {
    
    public static String[] code = {".;" , "abc" ,"def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

     public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       ArrayList<String> kpcAns = getKPC(str);
       System.out.println(kpcAns);
     }

     public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
              ArrayList<String> base = new ArrayList<>();
              base.add("");
              return base;   
        }

      char ch = str.charAt(0);
      String subStr =  str.substring(1);
      ArrayList<String> recAns = getKPC(subStr);
      ArrayList<String> myAns = new ArrayList<>();
      int idx  =  ch-'0';  // type conversion will give another ascci value so use this method eg : ch=> '7' -'0' == 67 -60 ==> 7
      
   
      String currStr = code[idx];
      for(int i=0; i<currStr.length(); i++){

        for(String j : recAns){
            myAns.add(currStr.charAt(i)+j);
        }
      }
      return myAns;
     }

 }