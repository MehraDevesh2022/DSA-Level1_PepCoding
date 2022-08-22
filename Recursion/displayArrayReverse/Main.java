/*
 * Display Array In Reverse
 * Easy Prev Next
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to print the elements of array from end to beginning each
 * in a separate line.
 * 4. For the above purpose complete the body of displayArrReverse function.
 * Don't change the signature.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * Input Format
 * A number n
 * n1
 * n2
 * .. n number of elements
 * Output Format
 * n1
 * n2
 * .. n elements
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 30
 * 0 <= n1, n2, .. n elements <= 10
 * Sample Input
 * 5
 * 3
 * 1
 * 0
 * 7
 * 5
 * Sample Output
 * 5
 * 7
 * 0
 * 1
 * 3
 */
import java.io.*;
import java.util.*;

// public class Main {
//    static Scanner scn = new Scanner(System.in);
// public static void input(int arr[]){
//     for(int i=0; i<arr.length; i++){
//         arr[i] = scn.nextInt();
//     }
// }
//     public static void main(String[] args) throws Exception {
//         // write your code here
//         int n = scn.nextInt();
//         int arr[] = new int[n];
//         input(arr);
//         int idx  = arr.length-1;
//         displayArrReverse(arr, idx);
//     }

//     public static void displayArrReverse(int[] arr, int idx) {
//           if(idx<0){
//             return;
//           }
//           // expectation : i am printing my shelf.
//           System.out.println(arr[idx]);
//           // faith : idx-1 indexse will done there work.
//           displayArrReverse(arr, idx-1);
//     }

// }

// another way =>
public class Main {
    static Scanner scn = new Scanner(System.in);

    public static void input(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        int arr[] = new int[n];
        input(arr);
        int idx = 0;
        displayArrReverse(arr, idx);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        // faith : idx+1 indexse will done there work.
        displayArrReverse(arr, idx + 1);

        // expectation :then  i will print my shelf.
        System.out.println(arr[idx]);

    }

}