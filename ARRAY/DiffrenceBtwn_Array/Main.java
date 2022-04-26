import java.util.Scanner;

// Difference Of Two Arrays
// Easy

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

// Assumption - number represented by a2 is greater.

// Constraints
// 1 <= n1, n2 <= 100
// 0 <= a1[i], a2[i] < 10
// number reresented by a1 is smaller than number represented by a2

// Format
// Input
// A number n1
// n1 number of elements line separated
// A number n2
// n2 number of elements line separated

// Output
// A number representing difference of two numbers (a2 - a1), represented by two arrays.

// Example
// Sample Input

// 3
// 2
// 6
// 7
// 4
// 1
// 0
// 0
// 0

// Sample Output
// 7
// 3
// 3

// public class Main {
//   public static void main(String[] args) {

//     Scanner scn = new Scanner(System.in);
//     int n1 = scn.nextInt();
//     int a1[] = new int[n1];
//     for (int i = 0; i < n1; i++) {
//       a1[i] = scn.nextInt();
//     }

//     int n2 = scn.nextInt();
//     int a2[] = new int[n2];
//     for (int i = 0; i < n2; i++) {
//       a2[i] = scn.nextInt();
//     }
//     differenceBtnArray(a1, a2);

//   }

//   public static void differenceBtnArray(int a1[], int a2[]) {
//     int borrow = 0;
//     int diff[] = new int[a2.length];
//     int i = a1.length - 1; 
//     int j = a2.length - 1;
//     int k = diff.length-1; 
    
//     while (k >= 0) {
//       int val = 0;
//       if (i >= 0) {
//         val = a1[i];

//       }
//       if (a2[j] + borrow >= val) {
//         diff[k] = a2[j] + borrow - val;
//         borrow = 0;
//       } else {
//         diff[k] = a2[j] + borrow + 10 - val;
//         borrow = -1;
//       }
//       i--;
//       j--;
//       k--;

//     }
//     int idx = 0;
//     while (idx < diff.length) {
//       if (diff[idx] == 0)
//         idx++;
//       else
//         break;
//     }
//     while (idx < diff.length) {
//       System.out.println(diff[idx]);
//       idx++;
//     }

//   }
// }

public class Main {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int a1[] = new int[n1];
    for (int i = 0; i < n1; i++) {
      a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int a2[] = new int[n2];
    for (int i = 0; i < n2; i++) {
      a2[i] = scn.nextInt();
    }
  diffrence(a1 , a2);
  }
  public static void diffrence(int a1[] , int a2[])
  {
    int borrow = 0;
    int  ans[] = new int[a2.length]; // larger array contain the ans 
    int i= a1.length-1;
    int j = a2.length-1;
    int k = ans.length-1;
    while(k>=0) // travleing from end of elements
    {

      int digit = 0;
      digit = a2[j] +borrow; // cause a2 and ans array are equal we don'nt need to check length
      if(i>=0) // cause a1 array might be smaller than a2 array
      {
        digit -= a1[i];
      }
      if(digit < 0) // when digit in minus that mean a2[j] value smaller than a1[i] value 
      {
        digit = digit + 10; // taking borrow
        borrow =-1;
      }
      else
      {
        borrow =0; // when diffrence of both vale is non negative in that case either borrow satllted else borrow not taken yet
      }
      ans[k] = digit; // asigning value at ans array

      i--;
      j--;
      k--;
    }
 

  
  // edge case when starting values of array are zero e.g 00999 in that case we need to print only 999
 // first non zero index  => fnzi 
   int fnzi = -1;
  for( i =0 ; i< ans.length; i++)
 {
   if(ans[i] != 0)
   {
     fnzi = i;
     break;  // when non zero value found .
   }
 }
 // edge case ==> when diffrence is zero eg. 111-111=000
 if(fnzi==-1)
 {
   System.out.print("0");
   return ;
 }
 for( i =fnzi ; i< ans.length ; i++)
 {
  System.out.println(ans[i]);
 }
   
}
}