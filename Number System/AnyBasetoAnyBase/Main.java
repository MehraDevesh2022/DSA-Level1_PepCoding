package AnyBasetoAnyBase;

/*
 * Any Base To Any Base
 * Easy Prev Next
 * 1. You are given a number n.
 * 2. You are given a base b1. n is a number on base b.
 * 3. You are given another base b2.
 * 4. You are required to convert the number n of base b1 to a number in base
 * b2.
 * Input Format
 * A number n
 * A base b1
 * A base b2
 * Output Format
 * A number of base b2 equal in value to n of base b1.
 * Question Video
 * 
 * COMMENTConstraints
 * 0 <= n <= 512
 * 2 <= b1 <= 10
 * 2 <= b2 <= 10
 * Sample Input
 * 111001
 * 2
 * 3
 * Sample Output
 * 2010
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int base_10 = sourceBaseToDecimal(n, sourceBase); // anyBase to decimal first.
        int result = DecimalTodestBase(base_10, destBase); // decimal to anybase.
        System.out.println(result);

    }

    public static int sourceBaseToDecimal(int n, int sourceBase) {
        int ans = 0;
        int pow = 1;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans + rem * pow;
            pow = pow * sourceBase;
        }
        return ans;
    }

    public static int DecimalTodestBase(int n, int destBase) {
        int ans = 0;
        int pow = 1;
        while (n != 0) {
            int rem = n % destBase;
            n = n / destBase;
            ans = ans + rem * pow;
            pow = pow * 10; // from base 10 to destBASE
        }
        return ans;
    }
}