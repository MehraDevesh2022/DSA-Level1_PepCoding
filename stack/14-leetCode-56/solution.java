import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/*
 * 56. Merge Intervals
 * Medium
 * 
 * 17193
 * 
 * 611
 * 
 * Add to List
 * 
 * Share
 * Given an array of intervals where intervals[i] = [starti, endi], merge all
 * overlapping intervals, and return an array of the non-overlapping intervals
 * that cover all the intervals in the input.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * Example 2:
 * 
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * 
 * 
 * Constraints:
 * 
 * 1 <= intervals.length <= 104
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 104
 * Accepted
 * 1,730,208
 * Submissions
 * 3,760,792
 */


 class Solution {
    public int[][] merge(int[][] intervals) {
          // sort matrix 0th elm using lmbda expresion =>
               Arrays.sort(intervals  , (int [] a ,int []b) ->{
                         return a[0] -b[0]; // incresing order 0th elm of matrix
               });

               Stack<int []> st = new Stack<>();
                 st.push(intervals[0]); // first row into stack
                   for(int i=0; i<intervals.length; i++){
                         int ondD[] = st.pop(); // pop() to array from stack
                         int s1 = ondD[0]; //0th elm of Array pairs from matrix stored in stack
                         int e1 = ondD[1]; // 1th elm Array pairs from matrix stored in stack

                         int s2 = intervals[i][0]; // 0th elm from matrix ith row
                         int e2 = intervals[i][1]; // 1st elm from  matrix ith row
                          

                         // if stacks stored array 1st elm >=0 matrix ith row array.
                         // then numbers ara overlap then merge them
                         if(e1>=s2){  
                            int max = Math.max(e1, e2);  // find max value btwn stack 1st elm and matrix ith row 1st elm
                            int merge[] = {s1 , max};   // now merge from stack 0th to matrix ith array 1st elm
                            st.push(merge);  // push them
                         }
                         // when elm are not overlaping to each other
                         else{
                            st.push(ondD); // first push poped array from stack
                            st.push(intervals[i]); // new ith rows array pair from matrix
                         }


                   }

                  // create a new array for ans => stack size row and 2 clm 
                  // add all elm from stack into array
                  int ans[][] = new int[st.size()][2]; 
                   for(int i=ans.length-1; i>=0; i-- ){
                     int ondD[] = st.pop();    
                    ans[i][0] =  ondD[0];
                    ans[i][1] =  ondD[1];
                   }
            return ans; 
    }
}