/*
 * Consecutive 1's not allowed
MediumAccuracy: 48.5%Submissions: 21830Points: 4
Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1’s. Output your answer modulo 10^9 + 7.

Example 1:

Input:
N = 3
Output: 5
Explanation: 5 strings are (000,
001, 010, 100, 101).
Example 2:

Input:
N = 2
Output: 3
Explanation: 3 strings are
(00,01,10).
Your Task:
Complete the function countStrings() which takes single integer n, as input parameters and returns an integer denoting the answer. You don't to print answer or take inputs. 
 */










//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class optimization {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    long countStrings(int n) {
        // code here
        int mod = (int) 1e9 + 7;
        long oldValueZero = 1;
        long oldValueOne = 1;

        for (int i = 2; i <= n; i++) {
            long newValueZero = oldValueZero + oldValueOne % mod;
            long newValueOne = oldValueZero;

            oldValueZero = newValueZero;
            oldValueOne = newValueOne;
        }

        return (oldValueZero) % mod;

    }
}