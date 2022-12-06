
/*
"Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma - which is living with the results of other people's thinking.
~ Steve Jobs"


 * Next Greater Element To The Right
Medium  Prev   Next
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the right" for all elements of array
4. Input and output is handled for you.

"Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.
Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"
e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is 5
Next greater for 5 is 9
Next greater for 9 is 12
Next greater for 3 is 12
Next greater for 1 is 12
Next greater for 12 is -1
Next greater for 6 is 8
Next greater for 8 is -1
Next greater for 7 is -1
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
0 <= n < 10^5
-10^9 <= a[i] <= 10^9
Sample Input
5
5
3
8
-2
7
Sample Output
8
8
-1
7
-1
 */
import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   // solve
   int ans[] = new int[arr.length];   // make an ans array for storing right greater number for every idx 
//    for(int i=0; i<ans.length; i++){   // set each idx value -1 by default
//     ans[i] =-1;
//    }
Arrays.fill(ans ,-1); // this is method same is replacement of upper written for loop
   Stack<Integer> st = new Stack<>();  // create a stack for storing idx of each elm from array
  
   for(int i=0; i<arr.length; i++){     // loop for array n elm 
    while(st.size() !=0 && arr[st.peek()] < arr[i]){     // now check is arr[st.peek()] value is less than arr[i]
 // where st.peek() is prv idx number from array and  arr[st.peek()] is value of that idx
 int idx = st.pop(); // if condition match then pop prv idx        
 ans[idx] = arr[i];  // and add in ans array greater value in that idx postion
    }
    st.push(i);  // add idx into stack
   }
   return ans;
 }

}