package AnyBaseSubtraction;

/*
 * Any Base Subtraction
 * Easy Prev Next
 * 1. You are given a base b.
 * 2. You are given two numbers n1 and n2 of base b.
 * 3. You are required to subtract n1 from n2 and print the value.
 * Input Format
 * A base b
 * A number n1
 * A number n2
 * Output Format
 * A number of base b equal in value to n2 - n1.
 * Question Video
 * 
 * COMMENTConstraints
 * 2 <= b <= 10
 * 0 <= n1 <= 256
 * n1 <= n2 <= 256
 * Sample Input
 * 8
 * 1
 * 100
 * Sample Output
 * 77
 * 
 * 
 */

 import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {

        int ans = 0;
        int pow = 1;
        int borrow = 0;
        while (n1 != 0 || n2 != 0) {
            int rem = ((n2 != 0) ? n2 % 10 : 0) - ((n1 != 0) ? n1 % 10 : 0) + borrow;

            if (rem < 0) {
                rem = rem + b; // if b 8 here and rem -1 then 8 -1 = 7 as same as base 10 ans rem -1 = 10-1 =9;
                borrow = -1;

            } else {
                borrow = 0;
            }
            ans = ans + pow * rem;
            pow *= 10;

            n1 /= 10;
            n2 /= 10;

        }
        return ans;
    }

}