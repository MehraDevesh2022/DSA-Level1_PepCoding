import javax.swing.RootPaneContainer;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

     public class pair{
        int data = 0;
        int height =-1;
         
        pair(){}
        
        pair(int data  , int height){
            this.data  = data;
            this.height = height;
        }
     }

     public pair diameter(TreeNode root){
        if(root ==null){
            return new pair(0 ,-1);
        }

        pair leftDiameter = diameter(root.left);
        pair rightDiameter = diameter(root.right);

        pair myDiameter = new pair();

        myDiameter.height = Math.max(leftDiameter.height, rightDiameter.height) + 1;

        int myAns = leftDiameter.height + rightDiameter.height + 2;

        myDiameter.data = Math.max(myAns, Math.max(leftDiameter.data, rightDiameter.data));

        return myDiameter;

     }
    public int diameterOfBinaryTree(TreeNode root) {
             pair ans  = diameter(root);
             return ans.data;
    }

 
    
}