// Inverse Of A Number
// Easy
import java.util.Scanner;

// 1. You are given a number following certain constraints.
// 2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
// 3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153    
// 4. Take as input number "n", assume that the number will follow constraints.
// 5. Print it's inverse.

// Constraints
// 1 <= n < 10^8, and follwing other constraints defined above.

// Format
// Input
// "n" where n is any integer, following constraints defined above.

// Output
// "i", the inverted number

// Example
// Sample Input

// 28346751

// Sample Output
// 73425681


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
      int temp = n;
       int count =0;
     while(temp>10){
         temp =temp/10;
         count ++;
     }
     int pow =(int)Math.pow(10, count);
      for(int i=1;i<=count+1; i++){
          temp = n;
          int pow2 = pow;
          int index =0;
          int ans=0;
          while(i!=ans)
          {     index++;
               ans = temp/pow2;
               temp=temp%pow2;
               pow2=pow2/10;
               if(i==ans)
               {
                System.out.println(index);
                break;
               }
          }
      }
    }
}