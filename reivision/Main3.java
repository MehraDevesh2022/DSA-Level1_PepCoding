package revision;
/*
 * Ring Rotate
 * Easy Prev Next
 * You are given a n*m matrix where n are the number of rows and m are the
 * number of columns. You are also given n*m numbers representing the elements
 * of the matrix.
 * You will be given a ring number 's' representing the ring of the matrix. For
 * details, refer to image.
 * 
 * shell-rotate
 * 
 * You will be given a number 'r' representing number of rotations in an
 * anti-clockwise manner of the specified ring.
 * You are required to rotate the 's'th ring by 'r' rotations and display the
 * rotated matrix.
 * Input Format
 * A number n
 * A number m
 * e11
 * e12..
 * e21
 * e22..
 * .. n * m number of elements of array a
 * A number s
 * A number r
 * Output Format
 * output is handled by display function
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 10^2
 * 1 <= m <= 10^2
 * -10^9 <= e11, e12, .. n * m elements <= 10^9
 * 0 < s <= min(n, m) / 2
 * -10^9 <= r <= 10^9
 * Sample Input
 * 5
 * 7
 * 11
 * 12
 * 13
 * 14
 * 15
 * 16
 * 17
 * 21
 * 22
 * 23
 * 24
 * 25
 * 26
 * 27
 * 31
 * 32
 * 33
 * 34
 * 35
 * 36
 * 37
 * 41
 * 42
 * 43
 * 44
 * 45
 * 46
 * 47
 * 51
 * 52
 * 53
 * 54
 * 55
 * 56
 * 57
 * 2
 * 3
 * Sample Output
 * 11 12 13 14 15 16 17
 * 21 25 26 36 46 45 27
 * 31 24 33 34 35 44 37
 * 41 23 22 32 42 43 47
 * 51 52 53 54 55 56 57
 */


 /*
  * Approch =>
  * Convert s sell to 2d to 1d 
  * 1d array rotate r time 
  * 1d to 2d again same s sell.
  */ 

 import java.io.*;
 import java.util.*;

 public class Main3 {
    
      static Scanner scn = new Scanner(System.in);
      // input 2d array
       public static void input(int arr[][]){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
       }
       
        // ring roatate
       public static void ringRotate(int arr[][] , int s, int r){
          // 2d to 1d
         int oneD[] =  TwoDtoOneD(arr , s ,r);

         // rotate array r time anticlock wise 
         int i = 0;
         reverse(oneD, i, size - r - 1);
         reverse(oneD, size - r, size - 1);
         reverse(oneD, i, size - 1);
         // 1d to 2d
         oneDto2D(arr, oneD, s);
        
              
       }

        // 2d to 1d array s cell elements
       public static int[] TwoDtoOneD(int arr[][] , int s , int r){
        int n = arr.length;
        int m = arr[0].length;
        int minr = s-1;
        int minc = s-1;
        int maxc = m-s;
        int maxr = n-s;
    /*
     * permiter of rectangle = 2(l+w); ---->  1
     *                l = maxr -minr; ----->  2
     *                w = maxc - minc; -----> 3
     *     from equation 1 ,2 ,3
     *             size = 2*(maxr -minr + maxc + minc );
     */

        int size =  2*(maxr - minr + maxc - minc );
        int oneD[] = new int[size];
      
        int idx =0;
        // 1d to 2d =>
        // minr ----> maxr
        for(int i= minr ; i<=maxr ; i++){
            oneD[idx] = arr[i][minc];
            idx++;
        }
        minc++;
      
        // minc ----> maxc
        for(int j=minc ; j<=maxc; j++){
            oneD[idx] = arr[maxr][j];
            idx++;
        }
      
        maxr--;
        // maxr -----> minc
         for(int i=maxr ; i>=minr; i--){
            oneD[idx] = arr[i][maxc];
            idx++;
         }
         maxc--;
        
         // maxc ---> minc
         for(int j=maxc; j>=minc; j--){
            oneD[idx] = arr[minr][j];
            idx++;
         }
       
  

         // rotate oneD =>
        
         

       }
      
       // for rotate array r time with reverse method
       public static void reverse(int a[] , int i , int j){
        while(i<=j){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
          i++;
          j--;
        }
       }
       
       // after rotate array  convert 1d o 2d in s cell.
       public static void oneDto2D(int arr[][] , int oneD[] , int s){
           int n = arr.length;
           int m = arr[0].length;
           int minr = s - 1;
           int minc = s - 1;
          
           int maxr = n - s;
           int maxc = m - s;

           int idx =0;
           
           // 1d to 2d =>
           // minr ----> maxr
           for (int i = minr; i <= maxr; i++) {
                arr[i][minc] =oneD[idx];
                idx++;
           }
           minc++;
        
           // minc ----> maxc
           for (int j = minc; j <= maxc; j++) {
                arr[maxr][j] = oneD[idx];
                idx++;
           }
         
           maxr--;
           // maxr -----> minc
           for (int i = maxr; i >= minr; i--) {
                arr[i][maxc] = oneD[idx] ;
                idx++;
           }
           maxc--;
          
           // maxc ---> minc
           for (int j = maxc; j >= minc; j--) {
                arr[minr][j] = oneD[idx];
                idx++;
           }
           minr++;

       }
       public static void main(String[] args) throws Exception {
         int n = scn.nextInt();
         int m = scn.nextInt();
         int arr[][] = new int[n][m];
         input(arr);
         int s = scn.nextInt();
         int r = scn.nextInt();
         ringRotate(arr ,s ,r);
         
         
     }
     
      // display
     public static void display(int[][] arr) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[0].length; j++) {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
     }

 }
