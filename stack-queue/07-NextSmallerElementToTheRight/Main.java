/*  Level : 2
 * Next Smaller Element To The Right
 * Medium Prev Next
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to "next smaller element on the right" for all elements
 * of array
 * 4. Input and output is handled for you.
 * 
 * "Next smaller element on the right" of an element x is defined as the first
 * element to right of x having value smaller than x.
 * Note -> If an element does not have any element on it's right side smaller
 * than it, consider -1 as it's "next smaller element on right"
 * e.g.
 * for the array [2 5 9 3 1 12 6 8 7]
 * Next smaller for 2 is 1
 * Next smaller for 5 is 3
 * Next smaller for 9 is 3
 * Next smaller for 3 is 1
 * Next smaller for 1 is -1
 * Next smaller for 12 is 6
 * Next smaller for 6 is -1
 * Next smaller for 8 is 7
 * Next smaller for 7 is -1
 * Input Format
 * Input is managed for you
 * Output Format
 * Output is managed for you
 * Question Video
 * 
 * COMMENTConstraints
 * 0 <= n < 10^5
 * -10^9 <= a[i] <= 10^9
 * Sample Input
 * 5
 * 5
 * 3
 * 8
 * -2
 * 7
 * Sample Output
 * 3
 * -2
 * -2
 * -1
 * -1
 */

 import java.io.*;
import java.util.*;

public class Main {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        // solve

        // here in this is question we need to check smaller elm to the right =>
        // so : first add loop for array 0 to n elm .
        // then nesetd while loop and check stack size and also check is arr[stack.peek()] > arr[i] elm ke jaha pe stack.peek()  i-1 hai
        // agr condition true hai to peek idx ko pop kro and store kr do idx 
        // ush idx pe and array main arr[i] daal do jo right smallest elm hai
        // also inside first loop array i ko push kr do
        
        int ans[] = new int[arr.length];
        // add vaule -1 by deafult
        Arrays.fill(ans ,-1);
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(st.size() !=0 && arr[st.peek()] > arr[i]){
                int idx= st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }
        return ans;
    }

}