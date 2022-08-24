/*
  443. String Compression
Medium

2119

4264

Add to List

Share
Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

 

Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 

Constraints:

1 <= chars.length <= 2000
chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
Accepted
252,035
Submissions
528,527
 */

class Solution {
    public int compress(char[] str) {
    StringBuilder sb = new StringBuilder();
       char curr = str[0];
       sb.append(curr);
       int count =1;
       for(int i=1; i<str.length; i++){
            curr = str[i];
            int prv = str[i-1];
            if(curr == prv){
                count++;
            }
            else{
              if(count >1){
                sb.append(count);
              }
              sb.append(curr);
              count =1;
            }
       }
          if (count > 1) {
         sb.append(count);
       }
       for (int i = 0; i < sb.length(); i++) {
         str[i] = sb.charAt(i); // more value will trucncated bts using new size
       }
       return sb.length(); // return size of sb stringbuilder and bts new size of char array will difined
      
}
}