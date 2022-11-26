/*
 * Next Greater Element To The Left
 * Medium Prev Next
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to find "next greater element on the left" for all
 * elements of array
 * 4. Input and output is handled for you.
 * 
 * "Next greater element on the left" of an element x is defined as the first
 * element to left of x having value greater than x.
 * Note -> If an element does not have any element on it's left side greater
 * than it, consider -1 as it's "next greater element on left"
 * e.g.
 * for the array [2 5 9 3 1 12 6 8 7]
 * Next greater for 2 is -1
 * Next greater for 5 is -1
 * Next greater for 9 is -1
 * Next greater for 3 is 9
 * Next greater for 1 is 3
 * Next greater for 12 is -1
 * Next greater for 6 is 12
 * Next greater for 8 is 12
 * Next greater for 7 is 8
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
 * -1
 * 5
 * -1
 * 8
 * 8
 * 
 */
import java.io.*;
import java.util.*;

import javax.naming.ldap.StartTlsRequest;

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

        int[] ngl = solve(a);
        display(ngl);
    }

    public static int[] solve(int[] arr) {
        // solve
        int ans[] = new int[arr.length];
        // default value should be -1
        Arrays.fill(ans, -1); // as same as using loop for n elm and asign value -1 every idx 
       Stack<Integer> st = new  Stack<>();
       for(int i = ans.length-1; i>=0; i--){ // loop from n-1 to 0 because we need left greater first elm for every elm
        while(st.size()!=0 && arr[st.peek()] <arr[i]){ // check size of stack and compare value from array i+1 to i where st.peek() has i+1 idx store 
            int idx = st.pop(); // now pop top
            ans[idx] = arr[i]; // add arr greater value on that idx in ans array
        }
        st.push(i); // push idx 
       }

        return ans;
    }

}