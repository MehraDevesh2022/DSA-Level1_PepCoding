class memuization {
    public int stairPath(int src, int dst, int dp[]) {
        // edge case
        if (src == dst) {
            return dp[src] = 1;
        }
       // middleware => if path already visited then no need for further calls for again again for same postion
        if (dp[src] != 0) {
            return dp[src];
        }

        int count = 0;
        // two step allowd 
        for (int jump = 1; jump <= 2; jump++) {
            if (src + jump <= dst) {
                count += stairPath(src + jump, dst, dp);
            }

        }
        // add and return steps 
        return dp[src] = count;
    }

    public int climbStairs(int n) {
        int dp[] = new int[n + 1];
        return stairPath(0, n, dp);
    }
}