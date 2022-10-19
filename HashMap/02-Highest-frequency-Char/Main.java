// Just when the caterpillar thought the world was ending, he turned into a butterfly.

/*
 * Highest Frequency Character
 * Easy Prev Next
 * 1. You are given a string str.
 * 2. You are required to find the character with maximum frequency.
 * Input Format
 * A string str
 * Output Format
 * The character with highest frequency
 * Question Video
 * 
 * COMMENTConstraints
 * 0 < str.length() <= 100
 * There will be a single character with highest frequency
 * Sample Input
 * zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc
 * Sample Output
 * q
 */


 import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
       HashMap<Character , Integer> hm = new HashMap<>();

       for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
 // check if hm have already key stored then get value of that key and add 1   
        // if(hm.containsKey(ch)){
        //     int value = hm.get(ch); 
        //     hm.put(ch, value +1);
        // }
        // // else when hashmap has no such key available right now then add key and upadte frequency with 1 for that value 
        //  else{
        //     hm.put(ch, 1);
        //  }
          

          // another way of to update hm without if else using getordefault method
          hm.put(ch , hm.getOrDefault(ch, 0) +1); // if key already persent then get vaule of it and add 1 else add the key and provide default value 0 and add  1
        }

          char maxFreqeuncyKey = str.charAt(0);
          // keySet() method retuns all key from hashmap
          for(Character key : hm.keySet()){
             if(hm.get(key) > hm.get(maxFreqeuncyKey))
             maxFreqeuncyKey = key;
          }
          System.out.println(maxFreqeuncyKey);
    }

}