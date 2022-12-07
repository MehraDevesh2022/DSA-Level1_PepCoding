/*
"An algorithm must be seen to be believed.
~ Donald Knuth"


 * Merge Overlapping Interval
 * Medium Prev Next
 * 1. You are given a number n, representing the number of time-intervals.
 * 2. In the next n lines, you are given a pair of space separated numbers.
 * 3. The pair of numbers represent the start time and end time of a meeting
 * (first number is start time and second number is end time)
 * 4. You are required to merge the meetings and print the merged meetings
 * output in increasing order of start time.
 * 
 * E.g. Let us say there are 6 meetings
 * 1 8
 * 5 12
 * 14 19
 * 22 28
 * 25 27
 * 27 30
 * 
 * Then the output of merged meetings will belongs
 * 1 12
 * 14 19
 * 22 30
 * 
 * Note -> The given input maynot be sorted by start-time.
 * Input Format
 * Input is managed for you
 * Output Format
 * Print a merged meeting start time and end time separated by a space in a line
 * .. print all merged meetings one in each line.
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 10^4
 * 0 <= ith start time < 100
 * ith start time < ith end time <= 100
 * Sample Input
 * 6
 * 22 28
 * 1 8
 * 25 27
 * 14 19
 * 27 30
 * 5 12
 * Sample Output
 * 1 12
 * 14 19
 * 22 30
 */


 import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
      

        int[][] arr = new int[n][2];


        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time

        Arrays.sort(arr, (a, b) -> {
            return a[0] - b[0];
        });

      Stack<int []> st = new Stack<>();
        // initial value of stack . 1st row from matrix
      st.push(arr[0]);
    for(int i=1; i<arr.length; i++){
          int oneD[] = st.pop();
          int s1 = oneD[0];
          int e1 =oneD[1];
          
          int s2 = arr[i][0];
          int e2 = arr[i][1];

          if(e1 >=s2){
           
            int max = Math.max(e1, e2);
          
            int merge[] = {s1 , max};
            st.push(merge);
          }
          else{
            st.push(oneD);
            st.push(arr[i]);
          }
    }

   int ans[][] = new int[st.size()][2];
   int j=0;
     while(st.size() !=0){
       int oneD[] = st.pop();
       ans[j][0] = oneD[0];
       ans[j][1] = oneD[1];
       j++;
     }

     for(int i=ans.length-1; i>=0; i--){
        System.out.println(ans[i][0] + " " + ans[i][1]);
     }

    }

}