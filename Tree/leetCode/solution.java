/*
 * 543. Diameter of Binary Tree
 * Easy
 * 
 * 10374
 * 
 * 655
 * 
 * Add to List
 * 
 * Share
 * Given the root of a binary tree, return the length of the diameter of the
 * tree.
 * 
 * The diameter of a binary tree is the length of the longest path between any
 * two nodes in a tree. This path may or may not pass through the root.
 * 
 * The length of a path between two nodes is represented by the number of edges
 * between them.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 * Example 2:
 * 
 * Input: root = [1,2]
 * Output: 1
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [1, 104].
 * -100 <= Node.val <= 100
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
public int maxDepth(root){
    // finding the height =>
    // return (root ==null ? -1 : Math.max(maxDepth(root.left), maxDepth(root.right)) +1 );

    if(root ==null){
        return -1;
    }
    int leftHeight = maxDepth(root.left);
    int rightHeight = maxDepth(root.right);
    int max  = Math.max(leftHeight, rightHeight);
    return max+1;
}

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int dobLeft = diameterOfBinaryTree(root.left);
        int dobRight = diameterOfBinaryTree(root.right);

        int leftHight = maxDepth(root.left);
        int rightHight = maxDepth(root.right);

      int myDiameter = leftHight + rightHight +2;
      
      return (Math.max(myDiameter , Math.max(dobLeft , dobRight)));

    }
}