/*
 * Paint House
Easy  Prev   Next
1. You are given a number n, representing the number of houses.
2. In the next n rows, you are given 3 space separated numbers representing the cost of painting nth house with red or blue or green color.
3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.
Input Format
A number n
n1red n1blue n1green
n2red n2blue n2green
.. n number of elements
Output Format
A number representing the minimum cost of painting all houses without painting any consecutive house with same color.
Question Video

  COMMENTConstraints
1 <= n <= 1000
0 <= n1red, n1blue, .. <= 1000
Sample Input
4
1 5 7
5 8 4
3 2 9
1 2 4
Sample Output
8
 */

import java.io.*;
import java.util.*;

public class error {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int[n][3];

        int ans[][] = solution(arr, dp);
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < dp[0].length; j++) {

            min = Math.min(min, ans[n - 1][j]);
        }
        System.out.println(min);
    }

    public static int[][] solution(int arr[][], int dp[][]) {

        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = arr[i][j];
                }

                else {
                    int ans = findMin(dp, i, j);
                    dp[i][j] = ans + arr[i][j];
                }

            }
        }

        return dp;
    }

    public static int findMin(int[][] dp, int i, int j) {

        int min = Integer.MAX_VALUE;

        for (int clm = 0; clm < dp[0].length; clm++) {
            if (dp[i - 1][clm] != dp[i - 1][j]) {
                min = Math.min(min, dp[i - 1][clm]);
            }
        }
        return min;
    }
}