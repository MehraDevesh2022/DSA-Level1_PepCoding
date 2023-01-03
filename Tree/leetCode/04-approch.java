

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
    int ans = Integer.MIN_VALUE;

  public int diameter(TreeNode root){
    if(root ==null){
        return -1;
    }
    int leftHight = diameter(root.left);
    int rightHight = diameter(root.right);

    ans  = Math.max(ans , leftHight + rightHight +2);

    int myHight  =  Math.max(leftHight , rightHight) +1;
    return myHight;
  }


    public int diameterOfBinaryTree(TreeNode root) {
          diameter(root);
          return ans;
    }
}