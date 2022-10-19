/*    
                   If you can't explain it simply, you don't understand it well enough.
                                        ~Albert Einstein
               

 * Get Common Elements - 1
 * Easy Prev Next
 * 1. You are given a number n1, representing the size of array a1.
 * 2. You are given n1 numbers, representing elements of array a1.
 * 3. You are given a number n2, representing the size of array a2.
 * 4. You are given n2 numbers, representing elements of array a2.
 * 5. You are required to print all elements of a2 which are also present in a1
 * (in order of their occurence in a2). Make sure to not print duplicates (a2
 * may have same value present many times).
 * Input Format
 * A number n1
 * n1 number of elements line separated
 * A number n2
 * n2 number of elements line separated
 * Output Format
 * All relevant elements of a2 in separate lines (no duplicacy)
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n1, n2 <= 100
 * 0 <= a1[i], a2[i] < 10
 * Time complexity should be O(n)
 * sample input :
 *  8 [2,34,566,3,3,4,6] 
 *  9 [2,1,5,3,3,4,6 ,6 ,10] 
 */

 import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
         int n1 = scn.nextInt();
         int arr1[] = new int[n1];
         for(int i=0; i<n1; i++){
            arr1[i] = scn.nextInt();
         }

         int n2 = scn.nextInt();
         int arr2[] = new int[n2];
         for(int i=0; i<n2; i++){
            arr2[i] = scn.nextInt();
         }
         HashMap<Integer, Integer> hm = new HashMap<>();
        // make arr1 as a hashmap
         for(int elm : arr1){
            hm.put(elm, hm.getOrDefault(elm, 0) +1);

         }
         for(int elm : arr2){
             if(hm.containsKey(elm)) // if arr2 elm available in hashmap as key then print them else ignore
            {
              System.out.println(elm);
              
              // now remove key and value from hashmap for no duplicasy ones printed if value repated in arr2 then no key match for that elm again
      hm.remove(elm);
             }
         }


       
    }

}