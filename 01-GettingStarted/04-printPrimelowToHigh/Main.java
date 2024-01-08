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


import java.util.*;

/**
 * Main
 */
public class Main {

  public static void main(String [] args){
    Scanner scn = new Scanner(System.in);
    int low  = scn.nextInt();
    int high  = scn.nextInt();

      // check all prime in low to high range

         checkPrimes(low  , high);


  }
     public static void checkPrimes(int low , int high){
        for(int i= low; i<=high; i++){
          boolean isPrime = isNumberPrime(i);
          if(isPrime){
            System.out.println("Number " + i + " is a prime");
          }
        }
     }
    public static boolean isNumberPrime(int num){
      for(int i=2; i*i<=num; i++){
          if(num % i ==0){
            return false;
          }
      }
      return true;
    }

}