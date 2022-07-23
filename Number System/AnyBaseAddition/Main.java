package AnyBaseAddition;

/*
 * Any Base Addition
 * Easy Prev Next
 * 1. You are given a base b.
 * 2. You are given two numbers n1 and n2 of base b.
 * 3. You are required to add the two numbes and print their value in base b.
 * Input Format
 * A base b
 * A number n1
 * A number n2
 * Output Format
 * A number representing the sum of n1 and n2 in base b.
 * Question Video
 * 
 * COMMENTConstraints
 * 2 <= b <= 10
 * 0 <= n1 <= 256
 * 0 <= n2 <= 256
 * Sample Input
 * 8
 * 777
 * 1
 */

 import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int ans = 0;
        int pow = 1;
        int carry = 0;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int rem = ((n1 != 0) ? n1 % 10 : 0) + ((n2 != 0) ? n2 % 10 : 0) + carry;
            carry = rem / b; // for carry
            rem = rem % b; // for left digit if rem>=b (eg= 8>=8 then 8%8 is =0 same like for base 10 ,
                           // 10>=10 then 10%10 =0)
            ans = ans + pow * rem;
            pow = pow * 10;
            n1 /= 10;
            n2 /= 10; // for reamining regits for addition
        }
        return ans;
    }
}