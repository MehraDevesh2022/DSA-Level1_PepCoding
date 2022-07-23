package DecimalBaseAddition;

import java.util.Scanner;

// addtiion decimal to decimal 

// Input  : B1. = 99876
//        : B2. = 00983
// Output : 210859 

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b1 = scn.nextInt();
    int b2 = scn.nextInt();
    int ans = DecimalAddition(b1, b2);
    System.out.println(ans);
  }

  public static int DecimalAddition(int n, int m) {
    int sum = 0;
    int pow = 1;
    int carry = 0;
    while (n != 0 || m != 0 || carry != 0) {
      int rem = ((n != 0) ? n % 10 : 0) + ((m != 0) ? m % 10 : 0) + carry;
      carry = rem / 10;
      rem = rem % 10;
      sum = sum + pow * rem;
      pow = pow * 10;
      n = n / 10;
      m = m / 10;
    }
    return sum;
  }
}
