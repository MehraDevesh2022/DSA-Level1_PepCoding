// Rotate A Number
// Easy

// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
// 2. Take as input n and k.
// 3. Print the rotated number.
// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//    n = 12340056
//    k = 3
//    r = 05612340

// Constraints
// 1 <= n < 10^9
// -10^9 < k < 10^9

// Format
// Input
// "n" where n is any integer.
// "K" where k is any integer.

// Output
// "r", the rotated number

// Example
// Sample Input

// 562984
// 2

// Sample Output
// 845629


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int pow = 1;
        int nod = 0;
        // Count number of digit
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        // Edge case for k<0 and K>nod
        k = k % nod; // while k>nod eg. k=10; nod = 5; so k =k%nod ==>2
        if (k < 0) {
            k = nod + k; // eg k=-3; and nod =5;
        }

        temp = k;
        while (temp-- > 0) // pow for left and right value
        {
            pow = pow * 10;
        }
        int left = n / pow; // lets say for k=2 --> pow=100 so n/100
        int right = n % pow;

        // for adding both number we need to make right side number to complete number
        // eg for 12345 right=45 make it 45000
        temp = nod - k;
        pow = 1;
        while (temp-- > 0) { // eg-- for 12345 == left=123 and right =45 in this case pow =1000 so 45 * 1000
                             // + 123 = 45123
            pow = pow * 10;
        }

        // add the left value right value for inverse the number

        int ans = right * pow + left;
        System.out.println(ans);

    }
}