// 48. Rotate Image
// Medium

// 9039

// 480

// Add to List

// Share
// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

// Example 1:


// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]
// Example 2:


// Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
// Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 

// Constraints:

// n == matrix.length == matrix[i].length
// 1 <= n <= 20
// -1000 <= matrix[i][j] <= 1000

class Solution {
    public void reverse(int row[]){
        int n = row.length;
        int i=0; 
        int j= n-1;
        while(i<=j){
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
            j--;
            i++;
        }
        
         }
    
    public void reverseRow(int arr[][]){
        for (int row[] : arr){  // using for each loop for every row . 
             reverse(row);
        }
    }
    
   public void swap(int arr[][],int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
   }

   public void transpose(int arr[][]){
       int n = arr.length;
       for(int i =0; i<n; i++){
        for(int j=i; j<n; j++){ // j =i ; bcz elements will swap again if j=0;
             swap(arr,i,j);  
        } 
       }
       
   }
   
   
   public void rotate(int[][] matrix) {
      // transpose matrix diagonally uper half
       transpose(matrix);
       reverseRow(matrix);
   }
}