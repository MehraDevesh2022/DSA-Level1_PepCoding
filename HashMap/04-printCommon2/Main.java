/*
 * Get Common Elements - 2
 * Easy Prev Next
 * 1. You are given a number n1, representing the size of array a1.
 * 2. You are given n1 numbers, representing elements of array a1.
 * 3. You are given a number n2, representing the size of array a2.
 * 4. You are given n2 numbers, representing elements of array a2.
 * 5. You are required to find the intersection of a1 and a2. To get an idea
 * check the example below:
 * 
 * if a1 -> 1 1 2 2 2 3 5
 * and a2 -> 1 1 1 2 2 4 5
 * intersection is -> 1 1 2 2 5
 * 
 * Note -> Don't assume the arrays to be sorted. Check out the question video.
 * Input Format
 * A number n1
 * n1 number of elements line separated
 * A number n2
 * n2 number of elements line separated
 * Output Format
 * All relevant elements of intersection in separate lines
 * The elements of intersection should be printed in order of their occurence in
 * a2.
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n1, n2 <= 100
 * 0 <= a1[i], a2[i] < 10
 * Time complexity should be O(n)
 * Sample Input
 * 7
 * 1
 * 1
 * 2
 * 2
 * 2
 * 3
 * 5
 * 7
 * 1
 * 1
 * 1
 * 2
 * 2
 * 4
 * 5
 * Sample Output
 * 1
 * 1
 * 2
 * 2
 * 5
 */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
      
      HashMap<Integer , Integer> hm  = new HashMap<>();
      
      // add first array into the hashmap :
      for(int elm  : arr1){
        // add elm as key and  frequnecy of that elm as value
        hm.put(elm , hm.getOrDefault(elm, 0) +1);

      }
// now match with second array element if elemnt available then print :
// check with hashMap  key is arr2 elm matched or not 
// check is hashMap key value grrater then 0 then print for pair element

for(int elm : arr2){
    // check elm macthed or not and elm frequency availble or not
    if(hm.containsKey(elm) && hm.get(elm) >0){
         System.out.println(elm);
         // once print then decirease  the elm frequency from value of hashMap
        int oldFreqeuncy = hm.get(elm);
        // decrease the frequnecy of the value from hashmap
        int newFreqeuency = oldFreqeuncy-1;
        // now add new freqeuncy into the hashmap 
        hm.put(elm, newFreqeuency);
    }
}
    }

}