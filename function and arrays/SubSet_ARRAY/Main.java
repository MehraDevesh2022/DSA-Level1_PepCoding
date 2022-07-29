import java.util.Scanner;

/*
 * Subsets Of Array
Easy  Prev   Next
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
[Tab separated elements of subset]
..
All subsets
Question Video

  COMMENTConstraints
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3
Sample Input
3
10
20
30
Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	

 */

    public class Main{
       static Scanner scn = new Scanner(System.in);
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        input(a);
       substring(a);

     }
    public static void substring(int[] arr) {
         int n = arr.length;
           for(int i=0; i<(int)Math.pow(2, n); i++){
                int val = DectoBinary(i);
                 String str ="";
                for (int j = n - 1; j >= 0; j--) {
                    int num = val % 10;
                    val = val / 10;
                    if(num ==0){
                        str = "-\t" + str;
                    }
                    else{
                       str = arr[j] +"\t" + str; 
                    }
                }
                System.out.println(str);
           }
         

    }
    public static int DectoBinary(int i) {
           int ans =0;
           int pow =1;
        while( i !=0){
               int rem =i%2;
                   i =i/2;
                 ans = ans + pow*rem;
                 pow =pow*10;
        }
        return ans;
    }
    public static void input(int[] a) {
      for(int i=0; i<a.length; i++){
        a[i] = scn.nextInt();
      }


    }

    }



//     import java.io.*;
// import java.util.*;

// public class Main {
//   static Scanner scn = new Scanner(System.in);

//   public static void main(String[] args) throws Exception {

//     int n = scn.nextInt();
//     int a[] = new int[n];
//     input(a);
//     subsets(a);
//   }

//   public static void input(int[] a) {
//     for (int i = 0; i < a.length; i++) {
//       a[i] = scn.nextInt();
//     }
//   }

//   public static void subsets(int[] a) {
//     int n = a.length;
//     int limit = (int) Math.pow(2, n); // either number will print or not so 2 things, and 3 power
//     for (int i = 0; i < limit; i++) {
//       int temp = i; // 0-to- 2^n-1 time susbsets prints
//       String str = "";
//       for (int j = n - 1; j >= 0; j--) {
//         int rem = temp % 2; // binary converts number
//         temp = temp / 2;
//         if (rem == 0) {
//           str = "-\t" + str;
//         } else {
//           str = a[j] + "\t" + str;
//         }

//       }
//       System.out.println(str);

//     }

//   }

// }