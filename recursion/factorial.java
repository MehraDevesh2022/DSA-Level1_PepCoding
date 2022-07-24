package reccursion1st;

import java.util.Scanner;

public class factorial {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int result = factorial(n);
        System.out.println(result);
    
    }
    public static int factorial(int n){
        if(n==0)
        {
            return 1;
        }
     int result =n * factorial(n-1); // second method
                                     // return==0 ? 1; n*factorial(n-1);
          return result;

    }
}
