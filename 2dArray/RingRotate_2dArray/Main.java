// Ring Rotate
// Easy

// You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
// You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

// shell-rotate

// You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
// You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// -10^9 <= e11, e12, .. n * m elements <= 10^9
// 0 < s <= min(n, m) / 2
// -10^9 <= r <= 10^9

// Format
// Input
// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements of array a
// A number s
// A number r

// Output
// output is handled by display function

// Example
// Sample Input

// 5
// 7
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 21
// 22
// 23
// 24
// 25
// 26
// 27
// 31
// 32
// 33
// 34
// 35
// 36
// 37
// 41
// 42
// 43
// 44
// 45
// 46
// 47
// 51
// 52
// 53
// 54
// 55
// 56
// 57
// 2
// 3

// Sample Output
// 11 12 13 14 15 16 17
// 21 25 26 36 46 45 27
// 31 24 33 34 35 44 37
// 41 23 22 32 42 43 47
// 51 52 53 54 55 56 57

package RingRotate_2dArray;

import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);
   
    public static void display(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


    public static void from1dto2d(int arr[][] , int oneD[] , int s){
        int n = arr.length;
        int m = arr[0].length;

        int minr = s-1;
        int minc = s-1;

        int maxr = n-s;
        int maxc = m-s;

        
        int idx = 0;
       

        for(int i = minr; i<=maxr; i++){
            arr[i][minc] = oneD[idx] ;
            idx++;
        }
        minc++;
        for(int j = minc; j<=maxc; j++){
             arr[maxr][j] =oneD[idx];
            idx++;
        }
        maxr--;
        for(int i=maxr; i>=minr; i-- ){
             arr[i][maxc] = oneD[idx] ;
            idx++;
        }
        maxc--;
        for(int j =maxc; j>=minc; j--){
              arr[minr][j] = oneD[idx];
            idx++;
        }
        minr++;
    }

    public static void swap(int a[] , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

 public static void reverse(int a[] , int i , int j){
     while(i<=j){
         swap(a , i ,j);
         i++;
         j--;
     }
 }   

   public static void rotate(int a[] , int k){
       int n = a.length;
       k = k % n;
       if(k < 0){
          k = n + k; 
       }
       reverse(a, 0 , n-k-1);
       reverse(a, n-k , n-1);
       reverse(a, 0 , n-1);
        
   }

    public static int[] from2dto1d(int arr[][] , int s){
        int n = arr.length;
        int m = arr[0].length;

        int minr = s-1;
        int minc = s-1;

        int maxr = n-s;
        int maxc = m-s;

        int size = 2*(maxr -minr + maxc- minc);
        int idx = 0;
        int oneD[] = new int[size];

        for(int i = minr; i<=maxr; i++){
            oneD[idx] = arr[i][minc];
            idx++;
        }
        minc++;
        for(int j = minc; j<=maxc; j++){
            oneD[idx] = arr[maxr][j];
            idx++;
        }
        maxr--;
        for(int i=maxr; i>=minr; i-- ){
            oneD[idx] = arr[i][maxc];
            idx++;
        }
        maxc--;
        for(int j =maxc; j>=minc; j--){
            oneD[idx] = arr[minr][j];
            idx++;
        }
        minr++;
        return oneD;
    }

  public static void ringRotate(int arr[][] , int s , int r){
        //from2dto1d
        //rotate 1d
        //from1dto2d
        int oneD[] = from2dto1d(arr , s);

         rotate(oneD , r);
         from1dto2d(arr , oneD , s);

  }

   


public static void input(int arr[][]){
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[0].length; j++){
               arr[i][j] = scn.nextInt();
           }
       }
   }

   public static void main(String[] args) {
       int n = scn.nextInt();
       int m = scn.nextInt();

       int arr[][] = new int[n][m];
       input(arr);
       int s = scn.nextInt();
       int r = scn.nextInt();

       ringRotate(arr , s , r);
       display(arr);


   }

}