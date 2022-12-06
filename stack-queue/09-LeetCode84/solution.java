import java.util.Arrays;
import java.util.Stack;

/*
 * 84. Largest Rectangle in Histogram
 * Hard
 * 
 * 12712
 * 
 * 179
 * 
 * Add to List
 * 
 * Share
 * Given an array of integers heights representing the histogram's bar height
 * where the width of each bar is 1, return the area of the largest rectangle in
 * the histogram.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: heights = [2,1,5,6,2,3]
 * Output: 10
 * Explanation: The above is a histogram where width of each bar is 1.
 * The largest rectangle is shown in the red area, which has an area = 10 units.
 * Example 2:
 * 
 * 
 * Input: heights = [2,4]
 * Output: 4
 */
class Solution {
    public int largestRectangleArea(int[] heights) {
      // first find small elm to the right
           int ElmToRight [] = smallElmToRight(heights);
           int ElmToLeft [] = smallElmToLeft(heights);
           int largestRectangle = compareLeftRight(heights , ElmToRight ,ElmToLeft);
           return largestRectangle;
    }

    public int[] smallElmToRight(int heights[]){
       Stack<Integer> st = new Stack<>();
       int ans[] = new int[heights.length];
       Arrays.fill(ans, heights.length); // from write side if there no big elm then width should be array ki lenght kr
                                         // brabar hogi
       for(int i=0; i<heights.length; i++) {
        while( st.size() !=0  &&   heights[st.peek()] > heights[i]){
            int idx = st.pop();
            ans[idx] =i;
        }
        st.push(i);
       }
        return ans;
    }

    public int[]  smallElmToLeft(int heights[]){
       Stack<Integer> st = new Stack<>();
       int ans[] = new int[heights.length]; 
       Arrays.fill(ans, -1);
       for(int i=ans.length-1; i>=0; i--){
        while( st.size() !=0 &&   heights[st.peek()] >heights[i]){
            int idx = st.pop();
            ans[idx] = i;
        }
        st.push(i);
       }
        return ans;
    }
public int compareLeftRight(int heights[] , int ElmToRight[] , int ElmToLeft[]){
    // using formula => hegightElm * ( ElmToRight - ElmToLeft -1)
    int ansArr [] = new int[heights.length];
    for(int i=0; i<ansArr.length; i++){
        ansArr[i] = heights[i] * (ElmToRight[i] - ElmToLeft[i] -1);
         
    }
    int max = Integer.MIN_VALUE;
    for(int i=0; i<ansArr.length; i++){
    if(max < ansArr[i]){
        max=ansArr[i];
    }
    }
    
    return max;

}

}

