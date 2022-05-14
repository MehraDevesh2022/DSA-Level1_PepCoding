import java.util.Scanner;

/*
Find Element In An Array
Easy

1.You are given a number n, representing the size of array a.
2.You are given n distinct numbers, representing elements of array a.
3. You are given another number d.
4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

Constraints
1 <= n <= 10^7
-10^9 <= n1, n2 
.. n elements <= 10^9
-10^9 <= d <= 10^9

Format
Input
A number n
n1
n2
.. n number of elements
A number d

Output
A number representing index at which d is found in array a and -1 if not found

Example
Sample Input

6
15
30
40
4
11
9
40

Sample Output
2
*/

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // n total number of size
        int n = scn.nextInt();
        // a array with n size
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();

        }
        // d digit whom we need to find
        int d = scn.nextInt();
        findIndex(a, d);

    }

    public static void findIndex(int array[], int d) {
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] == d) {
                System.out.println(i);
                return;
            }
        }
     System.out.println(-1);

    }
}
