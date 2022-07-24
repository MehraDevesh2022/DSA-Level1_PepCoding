/*
 * 
 * Inverted Bar Chart
Easy  Prev   Next
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print an inverted bar chart representing value of arr a.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
An inverted bar chart of asteriks representing value of array a
Question Video

Constraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 10
Sample Input
5
3
1
0
7
5
Sample Output
*	*		*	*	
*			*	*	
*			*	*	
			*	*	
			*	*	
			*		
			*	

 */

import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int arr[] = new int[n];
        input(arr);
        Barchart(arr);
    }

    public static void input(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void Barchart(int arr[]) {
        int max = findMax(arr);
        System.out.println(max);
        for (int i = 0; i < max; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

}
