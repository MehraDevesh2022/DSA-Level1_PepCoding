package LeetCode-54;
/*
 * 54. Spiral Matrix
Medium

8394

891

Add to List

Share
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
 */

class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int minr = 0;
        int minc = 0;

        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        // creating array list for return type
        ArrayList<Integer> al = new ArrayList<Integer>();

        while (minc <= maxc && minr <= maxr) {
            if (minc <= maxc && minr <= maxr)
                for (int j = minc; j <= maxc; j++) {
                    int val = arr[minr][j];
                    al.add(val);
                }

            minr++;
            // if condtion for when all elements end but inside while all loops will exicute
            // without if condtion
            if (minc <= maxc && minr <= maxr)
                for (int i = minr; i <= maxr; i++) {
                    int val = arr[i][maxc];
                    al.add(val);
                }

            maxc--;
            if (minc <= maxc && minr <= maxr)
                for (int j = maxc; j >= minc; j--) {
                    int val = arr[maxr][j];
                    al.add(val);

                }
            maxr--;
            if (minc <= maxc && minr <= maxr)
                for (int i = maxr; i >= minr; i--) {
                    int val = arr[i][minc];
                    al.add(val);
                }

            minc++;

        }
        return al;
    }
}
