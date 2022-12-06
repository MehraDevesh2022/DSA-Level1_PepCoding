/*Largest Area Histogram
Hard  Prev   Next
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the height of bars in a bar chart.
3. You are required to find and print the area of largest rectangle in the histogram.

e.g.
for the array [6 2 5 4 5 1 6] -> 12
Input Format
Input is managed for you
Output Format
A number representing area of largest rectangle in histogram
Question Video

  COMMENTConstraints
0 <= n < 20
0 <= a[i] <= 10
Sample Input
7
6
2
5
4
5
1
6
Sample Output
12
 * 
 * 
 */

 import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code
    // next right smallest elm
     int [] rightSmallElm = rightSmallElm(a);
     int [] leftSmallElm = leftSmallElm(a);
    int ans = caluclateHexagram(a , rightSmallElm ,leftSmallElm);
       System.out.println(ans);    

 }
 public static int[] rightSmallElm(int arr[]){
      Stack<Integer> st = new Stack<>();
      int ans[] = new int[arr.length];
      Arrays.fill(ans, arr.length);
      for(int i=0; i<arr.length; i++){
            while(st.size() !=0 && arr[st.peek()] > arr[i]){
                int idx = st.pop();
                ans[idx] = i;
            }
            st.push(i);
      }
      
    return ans;
 }

 public static int[] leftSmallElm(int arr[]){
     Stack<Integer> st = new Stack<>();
     int ans[] = new int[arr.length];
     Arrays.fill(ans, -1);
     for (int i = arr.length-1; i>=0; i--) {
         while (st.size() != 0 && arr[st.peek()] > arr[i]) {
             int idx = st.pop();
             ans[idx] = i;
         }
         st.push(i);
     }

     return ans;
 }
 public static int caluclateHexagram(int arr[] , int rightSmallArr[] , int leftSmallArr[]){
    int ans[] = new int[arr.length];
     for(int i=0; i<ans.length; i++){
      
        ans[i] = arr[i] * (rightSmallArr[i] - leftSmallArr[i] - 1);
     }
     int max = Integer.MIN_VALUE;
     for(int i=0; i<ans.length; i++){
        if(max <ans[i]){
            max = ans[i];
        }
     }
     return max;
 }
}