/*
 * 70. Climbing Stairs
Easy

14637

432

Add to List

Share
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45
Accepted
1,895,737
Submissions
3,667,397
 */

class Solution {

    public int climbStairs(int N) {
        int dp[] = new int[N + 1];
        for (int n = 0; n < dp.length; n++) {

            if (n == 0) {
                dp[n] = 1;
                continue;
            }
            int count = 0;
            for (int jump = 1; jump <= 2; jump++) {
                if (n - jump >= 0) {
                    count += dp[n - jump];
                }

            }
            dp[n] = count;
            ;
        }
        return dp[N];
    }

}