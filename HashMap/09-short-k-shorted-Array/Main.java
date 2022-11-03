/*
 * Sort K-sorted Array
 * Easy : Prev :  Next :
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. The array is nearly sorted. Every element is at-max displaced k spots left
 * or right to it's position in the sorted array. Hence it is being called
 * k-sorted array.
 * 4. You are required to sort and print the sorted array.
 * 
 * Note -> You can use at-max k extra space and nlogk time complexity.
 * Input Format
 * Input is managed for you
 * Output Format
 * Print the elements of sorted array in separate lines.
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 30
 * 0 <= n1, n2, .. n elements <= 100
 * 0 < k <= n
 * Sample Input
 * 9
 * 3
 * 2
 * 4
 * 1
 * 6
 * 5
 * 7
 * 9
 * 8
 * 3
 * Sample Output
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 
 */
// approch >
// insert first k elm into pq bcz elm will either up to k step will left or right
// after adding k elm . remove and print from pq and add new elm from array
// remain k elm will remove and print
 import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i=0; i<arr.length; i++){
        if(i<=k){
            pq.add(arr[i]);
        }else{
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }
      }
      while (pq.size() != 0) {
          System.out.println(pq.remove());
      }
   }
  

}

// second way :

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = Integer.parseInt(br.readLine());
//         }

//         int k = Integer.parseInt(br.readLine());

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for (int i = 0; i <= k; i++) {
//             pq.add(arr[i]);
//         }

//         for (int i = k + 1; i < arr.length; i++) {
//             System.out.println(pq.remove());
//             pq.add(arr[i]);
//         }

//         while (pq.size() > 0) {
//             System.out.println(pq.remove());
//         }
//     }

// }
