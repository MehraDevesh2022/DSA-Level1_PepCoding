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

// using tabulation =>
class tabulation {
    public int stairPath(int SRC, int dst, int dp[]) {
        // flow goes right to left
        for (int src = dst; src >= 0; src--) {
            if (src == dst) {
                dp[src] = 1;
                continue;
            }
            // 2 jump only
            int count = 0;
            for (int jump = 1; jump <= 2; jump++) {
                if (src + jump <= dst) {
                    count += dp[src + jump];
                }

            }
            dp[src] = count;
        }
        return dp[SRC]; // return steps from 0th idx
    }

    public int climbStairs(int n) {
        int dp[] = new int[n + 1];
        return stairPath(0, n, dp);
    }
}


