/*
 *  Min Cost In Maze Traversal
Easy  Prev   Next
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a, which represents a maze.
4. You are standing in top-left cell and are required to move to bottom-right cell.
5. You are allowed to move 1 cell right (h move) or 1 cell down (v move) in 1 motion.
6. Each cell has a value that will have to be paid to enter that cell (even for the top-left and bottom- 
     right cell).
7. You are required to traverse through the matrix and print the cost of path which is least costly.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
The cost of least costly path.
Question Video

  COMMENTConstraints
1 <= n <= 10^2
1 <= m <= 10^2
0 <= e1, e2, .. n * m elements <= 1000
Sample Input
6
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1
Sample Output
23 
 *  
 */


import java.io.*;
import java.util.*;

public class  tabulation{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int cost[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cost[i][j] = scn.nextInt();
            }
        }
        int dp[][] = new int[n][m];
        int ans = minCost(n, m, cost, dp);
        System.out.println(ans);

    }

    public static int minCost(int n, int m, int cost[][], int dp[][]) {

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1) {
                    dp[i][j] = cost[i][j];
                } else if (i == n - 1) {
                    dp[i][j] = cost[i][j] + dp[i][j + 1];

                } else if (j == m - 1) {
                    dp[i][j] = cost[i][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = cost[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                }

            }
        }
        return dp[0][0];
    }
}