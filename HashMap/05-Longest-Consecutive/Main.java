/*
 * Longest Consecutive Sequence Of Elements
 * Hard Prev Next
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to print the longest sequence of consecutive elements in
 * the array (ignoring duplicates).
 * 
 * Note -> In case there are two sequences of equal length (and they are also
 * the longest), then print the one for which the starting point of which occurs
 * first in the array.
 * Input Format
 * A number n
 * n1
 * n2
 * .. n number of elements
 * Output Format
 * Elements of longest sequence of consecutive elements of array in separate
 * lines (ignoring duplicates)
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 30
 * 0 <= n1, n2, .. n elements <= 15
 * Sample Input
 * 17
 * 12
 * 5
 * 1
 * 2
 * 10
 * 2
 * 13
 * 7
 * 11
 * 8
 * 9
 * 11
 * 8
 * 9
 * 5
 * 6
 * 11
 * Sample Output
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        HashMap<Integer, Boolean> hm = new HashMap<>();
       // create hashmap using an array and use array values as key and true as value for all
        for (int elm : arr) {
            hm.put(elm, true);
        }


        // potenial starting point of longest coniscutive seriase 
        for (int elm : arr) {
            if (hm.containsKey(elm - 1)) {
                hm.put(elm, false);
            }
        }
       // max lenth of consicutive seriase
        int maxLength = 0;
        // first value of consicutive elm
        int startPoint = 0;

        // now check for longest consicutive sub sequence and update it with maxLenght and startPoint variable
        for (int elm : arr) {
            if (hm.get(elm)) {
                int tempMaxLength = 1;
                int tmpStartPoint = elm;

                while (hm.containsKey(tmpStartPoint + tempMaxLength)) {
                    tempMaxLength++;
                }
                if (maxLength < tempMaxLength) {
                    maxLength = tempMaxLength;
                    startPoint = tmpStartPoint;
                }
            }

        }
             // print longest consicutive  from start point to  end point
        for (int i = startPoint; i < maxLength + startPoint; i++) {
            System.out.println(i);
        }
    }

}