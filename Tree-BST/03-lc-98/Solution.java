/*
 * 98. Validate Binary Search Tree
 * Medium
 * 
 * 13513
 * 
 * 1106
 * 
 * Add to List
 * 
 * Share
 * Given the root of a binary tree, determine if it is a valid binary search
 * tree (BST).
 * 
 * A valid BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's
 * key.
 * The right subtree of a node contains only nodes with keys greater than the
 * node's key.
 * Both the left and right subtrees must also be binary search trees.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [2,1,3]
 * Output: true
 * Example 2:
 * 
 * 
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [1, 104].
 * -231 <= Node.val <= 231 - 1
 * 
 */

 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    // we are using long here bcz Constraints value is max range of int
    long prv =Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
       if(root==null){
        return true;
       }

       // inorder traversal
       
       boolean leftAns = isValidBST(root.left);
      if(leftAns ==false){
          return false;
      }

      // work 

      if(prv >= root.val){
       return false;
      }
      prv = root.val;

      // right call
      boolean rightAns = isValidBST(root.right);
      if(rightAns == false){
        return false;
      }

      return true;

    }
}