import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

/*
 * 450. Delete Node in a BST
 * Medium
 * 
 * 6789
 * 
 * 173
 * 
 * Add to List
 * 
 * Share
 * Given a root node reference of a BST and a key, delete the node with the
 * given key in the BST. Return the root node reference (possibly updated) of
 * the BST.
 * 
 * Basically, the deletion can be divided into two stages:
 * 
 * Search for a node to remove.
 * If the node is found, delete the node.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [5,3,6,2,4,null,7], key = 3
 * Output: [5,4,6,2,null,null,7]
 * Explanation: Given key to delete is 3. So we find the node with value 3 and
 * delete it.
 * One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
 * Please notice that another valid answer is [5,2,6,null,4,null,7] and it's
 * also accepted.
 * 
 * Example 2:
 * 
 * Input: root = [5,3,6,2,4,null,7], key = 0
 * Output: [5,3,6,2,4,null,7]
 * Explanation: The tree does not contain a node with value = 0.
 * Example 3:
 * 
 * Input: root = [], key = 0
 * Output: []
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [0, 104].
 * -105 <= Node.val <= 105
 * Each node has a unique value.
 * root is a valid binary search tree.
 * -105 <= key <= 105
 * 
 * 
 * Follow up: Could you solve it with time complexity O(height of tree)?
 * 
 * Accepted
 * 333,684
 * Submissions
 * 666,337
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
    public int max(TreeNode root) {
        TreeNode curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.val;

    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        // cheak for left side
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } // right side
        else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            // when key == root.val so do some work
            // jab root ke 1 hi child ho ya ho hi nhi
            if (root.left == null || root.right == null) {
                if (root.left != null) {
                    return root.left;
                } else {
                    return root.right;
                }
            }

            // jab root ke pass 2 child ho =>
            // ya to root.right se min value nikal ke subtree main se . min ko swap kr do
            // key ke sath and min vlaue ke node ko delete kr do
            // ya fir left se max value nikal ke key se swap krke max value k node ko delete
            // kr do

            int maxElm = max(root.left);
            root.val = maxElm;
            // now delete max elm in subtree
            root.left = deleteNode(root.left, maxElm);
        }
        return root;
    }
}