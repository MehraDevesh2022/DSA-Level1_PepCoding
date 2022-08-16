import java.util.Scanner;

/*
 * Sum of All Odd Length Subarrays
 * Easy
 * 
 * Given an array of positive integers arr, calculate the sum of all possible
 * odd-length subarrays.
 * 
 * A subarray is a contiguous subsequence of the array.
 * 
 * Return the sum of all odd-length subarrays of arr.
 * 
 * Constraints
 * 1 <= arr.length <= 100
 * 1 <= arr[i] <= 1000
 * 
 * Format
 * Input
 * Input and output are managed for you. Just complete the function.
 * 
 * Output
 * Input and output are managed for you. Just complete the function.
 * 
 * Example
 * Sample Input
 * 
 * 5
 * 1 4 2 5 3
 * 
 * Sample Output
 * 58
 * 
 * 
 */
public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static int OddSum(int arr[]) {
        // write your code here.
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    if (i % 2 == 0 && j % 2 == 0) {
                        sum += arr[k];
                    } else if (j % 2 == 1 && i % 2 == 1) {
                        sum += arr[k];
                    }

                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int arr[] = new int[n];
        input(arr);
        int result = OddSum(arr);
        System.out.println(result);
    }
}