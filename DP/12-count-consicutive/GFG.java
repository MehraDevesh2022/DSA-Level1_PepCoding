//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
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
    long dp[][] = new long[2][n + 1];

    for (int j = 1; j < dp[0].length; j++) {
      for (int i = 0; i < dp.length; i++) {
        if (j == 1) {
          dp[i][j] = 1;
        } else {
          if (i == 0) {
            dp[i][j] = (dp[i][j - 1] + dp[i + 1][j - 1]) % mod;
          } else {
            dp[i][j] = dp[i - 1][j - 1];
          }

        }
      }
    }

    return (dp[0][n] + dp[1][n]) % mod;
  }
}