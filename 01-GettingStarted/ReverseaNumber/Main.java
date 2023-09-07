import java.util.Scanner;

// Reverse A Number
// Easy

// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

// Constraints
// 1 <= n < 10^9

// Format
// Input
// "n" where n is any integer.

// Output
// d1
// d2
// d3
// ... digits of the number in reverse

// Example
// Sample Input

// 65784383

// Sample Output
// 3
// 8
// 3
// 4
// 8
// 7
// 5
// 6

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        reverseDigit(scn.nextInt());
    }

    public static void reverseDigit(int n) {
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            System.out.println(rem);
        }
    }
}
