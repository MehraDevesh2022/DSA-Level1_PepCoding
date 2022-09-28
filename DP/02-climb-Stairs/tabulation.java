
import java.io.*;
import java.util.*;

public class tabulation {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n + 1];
        int ans = climbStairTabu(n, dp);
        System.out.println(ans);
    }

    public static int climbStairTabu(int N, int dp[]) {
        for (int n = 0; n < dp.length; n++) {
            // base :
            if (n == 0) {
                dp[n] = 1;
                continue; // instead of return continue used here
            }

            int count = 0;
            if (n - 1 >= 0) {
                count += dp[n - 1];
            }
            if (n - 2 >= 0) {
                count += dp[n - 2];
            }
            if (n - 3 >= 0) {
                count += dp[n - 3];
            }
            dp[n] = count; // instead of return continue used here automatically its untill loop not end
        }
        return dp[N];   // now return N th vaule from array
    }
}

