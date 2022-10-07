
/*
 * Goldmine
 * Easy Prev Next
 * 1. You are given a number n, representing the number of rows.
 * 2. You are given a number m, representing the number of columns.
 * 3. You are given n*m numbers, representing elements of 2d array a, which
 * represents a gold mine.
 * 4. You are standing in front of left wall and are supposed to dig to the
 * right wall. You can start from
 * any row in the left wall.
 * 5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell
 * right-down(d3).
 * 
 * goldmine
 * 
 * 6. Each cell has a value that is the amount of gold available in the cell.
 * 7. You are required to identify the maximum amount of gold that can be dug
 * out from the mine.
 * Input Format
 * A number n
 * A number m
 * e11
 * e12..
 * e21
 * e22..
 * .. n * m number of elements
 * Output Format
 * An integer representing Maximum gold available.
 * Question Video
 * 
 * COMMENTConstraints
 * 1 <= n <= 10^2
 * 1 <= m <= 10^2
 * 0 <= e1, e2, .. n * m elements <= 1000
 * Sample Input
 * 6
 * 6
 * 0 1 4 2 8 2
 * 4 3 6 5 0 4
 * 1 2 4 1 4 6
 * 2 0 7 3 2 2
 * 3 1 5 9 2 4
 * 2 7 0 8 5 1
 * Sample Output
 * 33
 * 
 * 
 */
import java.io.*;
import java.util.*;

public class mamoiztion {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        // we need to store arr total max gold value for each block
        int dp[][] = new int[n][m];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int ans = goldMine(i, 0, arr ,dp);
            max = Math.max(max, ans);
        }
        System.out.println(max);
    }

    public static int goldMine(int i, int j, int arr[][] ,int dp[][]) {
        // check jab ghde main gir jaye
        if (i < 0 || i >= arr.length || j >= arr[0].length) {
            return 0;
        }
         // middle ware to check if cost alredy calculated till that block  
        if(dp[i][j] !=0) return dp[i][j];
     
        // 3 steps of diif route
        int a = goldMine(i - 1, j + 1, arr,dp);
        int b = goldMine(i, j + 1, arr,dp);
        int c = goldMine(i + 1, j + 1, arr,dp);
        
        // max nikalo teeno path ka and add own block cost with it
        int max = Math.max(a, Math.max(c, b)) + arr[i][j];
        // store cost of each block those are caluclated for further calls
        return dp[i][j] = max;
    }
}
