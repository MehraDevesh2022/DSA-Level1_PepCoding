/*
 * 200. Number of Islands
Medium

18626

415

Add to List

Share
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
Accepted
2,038,714
Submissions
3,596,083
 */

 class Solution {
 // make a direction array =>
    public void findIsland(char[][] grid , int i , int j){
        int n = grid.length-1;
        int m = grid[0].length-1;    
        
        grid[i][j] = '0';
          // make call top right bottom left using if else || make dir array =>
            int dir [][] = {{1 ,0} ,{0 , 1}, {-1 ,0} ,{0 ,-1} };
            for(int elm[] : dir){
                int row = i + elm[0];
                int col = j + elm[1];

                if(row >=0 && row<=n && col >=0 && col <=m && grid[row][col] !='0'){
                    findIsland(grid, row, col);
                }
            }

    }
    public int numIslands(char[][] grid) {
        int count =0;   
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] =='1'){
                    count++;
                    findIsland(grid , i , j);
                }
            }
        }
        return count;
    }
}