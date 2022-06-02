// Is A Number Prime
// Easy

// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

// Constraints
// 1 <= t <= 10000
// 2 <= n < 10^9

// Format
// Input
// A number t
// A number n
// A number n
// .. t number of times

// Output
// prime
// not prime
// not prime
// .. t number of times

// Example
// Sample Input

// 5
// 13
// 2
// 3
// 4
// 5

// Sample Output
// prime
// prime
// prime
// not prime
// prime


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt();
    int high = scn.nextInt();
    
    for (int n=low; n <= high; n++) {
      int flag = 0;
      
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
         flag = 1;
          break;
        }
      }
      if (flag != 1)
        System.out.println(n);
    }
  }
}
