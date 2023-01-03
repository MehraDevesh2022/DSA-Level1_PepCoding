import javax.swing.RootPaneContainer;
import javax.xml.crypto.Data;

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

    
     public int [] diameter(TreeNode root){
        if(root ==null){
            int [] base ={0 ,-1};
            return base;
        }

        int leftDiameter [] = diameter(root.left);
        int rightDiameter [] = diameter(root.right);

        int myDiameter[] = new int[2];

        // myDiameter[0] == Data
        // myDiameter[1] == height

        myDiameter[1] = Math.max(leftDiameter[1], rightDiameter[1]) + 1;

        int myAns = leftDiameter[1] + rightDiameter[1] + 2;

        myDiameter[0] = Math.max(myAns, Math.max(leftDiameter[0], rightDiameter[0]));

        return myDiameter;

     }
    public int diameterOfBinaryTree(TreeNode root) {
             int ans[]  = diameter(root);
             return ans[0];
    }

 
    
}