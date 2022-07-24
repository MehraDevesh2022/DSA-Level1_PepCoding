import java.util.Scanner;

/*
Sum Of Two Arrays
Easy

1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10

Format
Input
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated

Output
A number representing sum of two numbers, represented by two arrays.

Example
Sample Input

5
3
1
0
7
5
6
1
1
1
1
1
1

Sample Output

1
4
2
1
8
6

*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int a1[] = new int[n1];
    for(int i =0; i<n1; i++)
    {
      a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int a2[] = new int[n2];
    for(int i =0; i<n2; i++)
    {
      a2[i] = scn.nextInt();
    }
    SumofTwo(a1 , a2);
}
   
public static void SumofTwo(int a1[],  int a2[])
{
    int i = a1.length;
    int j = a2.length;
    int k = (i>j) ? i : j;
    int a3[] = new int[k];
    i = i-1;
    j =j-1;
    k=k-1;
    int carry =0;
    while(k >=0)
    {
       int sum =0;
       if(i>=0)
       {
           sum= sum + a1[i];
       }
       if(j>=0)
       {
           sum = sum + a2[j];
       }
       if(carry >0)
       {
           sum = sum+carry;
       }
       
         carry = sum /10;
          sum %=10;
          a3[k] = sum;
          k--;
          j--;
          i--;
    }
    
   for(int p= 0; p<a3.length; p++ )
   {    if(carry >0){
            System.out.println(carry);  // when 9999
              carry=0;                  //        +1
           }                             //    10000 when ans > n1,n2 then print carry sapretly
       System.out.println(a3[p]);
   }
}
}