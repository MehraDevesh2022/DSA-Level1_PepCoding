package CeileFloor;
/*
 * Broken Economy
Easy  Prev   Next
In a country of novice government, the economic system is changed where only coins are used that too of various denominations. Whenever a foreigner visits this country, they visit a money exchanger to get the currency of the same country. As the foreigner is unaware of the denomination of the country, the money exchange prefers to tell them the denomination which is the nearest maximum and nearest minimum to the denomination mentioned by the foreigner. In case they get the correct guess of the denomination, they are told the same denomination. The denominations are always quoted in ascending order.

Example 1: In a country, 8 given denominations are as follows
[5, 10, 15, 22, 33, 40, 42, 55]

The foreigner asks for denomination 25.
The money exchange tells them that denominations of 33 and 22 are available.

Example 2: 
In a country, 5 given denominations are as follows
[7, 14, 18, 25, 30]

The foreigner asks for the denomination of 18.

The money exchange tells them a denomination of 18 is available.  

You are required to print the values told by the money exchange to the foreigner.

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of the array a.
3. You are given another number d.
4. You are required to find the ceil and floor of d in array a.
Input Format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing ceil
A number representing floor
 * 
 * 
 */


import java.util.*;

public class Main {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        int a[] = new int[n];
        input(a);
        int d = scn.nextInt();
        CeilFloor(a, d);
    }

    public static void input(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }
    }

    public static void CeilFloor(int arr[], int d) {

        int mid = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            mid = (i + j) / 2;
            if (arr[mid] == d) {
                System.out.println(arr[mid]);
                return;
            } else if (arr[mid] > d) {
                j = mid - 1;
            } else if (arr[mid] < d) {
                i = mid + 1;

            }
        }

        System.out.println(arr[i]);
        System.out.println(arr[j]);

    }

}