package IsPrimeNumber;

import java.util.Scanner;

// Is A Number Prime

// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
// Input Format
// A number t
// A number n
// A number n
// .. t number of times
// Output Format
// prime
// not prime
// not prime
// .. t number of times
// Question Video

//   COMMENTConstraints
// 1 <= t <= 10000
// 2 <= n < 10^9
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

public class Main{
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt();
    int high = scn.nextInt();
     primeTillN(low ,high);
    }
    
    public static void primeTillN(int low , int high){
        for(int num = low; num<=high; num++){
        boolean ans  = isPrime(num);
          if(ans == true){
               System.out.println(num);
          }
        }
    }
    public static boolean isPrime(int num){
        for(int i=2; i*i<num; i++){
            if(num %2 ==0){
                return false;
            }
        }
        return true;
    }
}