/*
 * 863. All Nodes Distance K in Binary Tree
 * Medium
 * 
 * 8026
 * 
 * 159
 * 
 * Add to List
 * 
 * Share
 * Given the root of a binary tree, the value of a target node target, and an
 * integer k, return an array of the values of all nodes that have a distance k
 * from the target node.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
 * Output: [7,4,1]
 * Explanation: The nodes that are a distance 2 from the target node (with value
 * 5) have values 7, 4, and 1.
 * Example 2:
 * 
 * Input: root = [1], target = 1, k = 3
 * Output: []
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the tree is in the range [1, 500].
 * 0 <= Node.val <= 500
 * All the values Node.val are unique.
 * target is the value of one of the nodes in the tree.
 * 0 <= k <= 1000
 */

 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> ansArr = new ArrayList<>();

    public List<TreeNode> findTragetPath(TreeNode root, TreeNode target) {
        if (root == null) {
            return new ArrayList<TreeNode>();
        }
        if (root == target) {
            List<TreeNode> myAns = new ArrayList<TreeNode>();
            myAns.add(root);
            return myAns;

        }
        List<TreeNode> leftAns = findTragetPath(root.left, target);
        if (leftAns.size() > 0) {
            leftAns.add(root);
            return leftAns;
        }

        List<TreeNode> rightAns = findTragetPath(root.right, target);
        if (rightAns.size() > 0) {
            rightAns.add(root);
            return rightAns;
        }

        return new ArrayList<TreeNode>();

    }

    public void kDistanceAway(TreeNode root, TreeNode blocker, int k) {

        if (root == null || blocker == root) {
            return;
        }
        if (k == 0) {
            ansArr.add(root.val);
            return;
        }
        kDistanceAway(root.left, blocker, k - 1);
        kDistanceAway(root.right, blocker, k - 1);

    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        List<TreeNode> Path = findTragetPath(root, target);
        TreeNode blocker = null;

        for (int i = 0; i < Path.size(); i++) {
            TreeNode pathNode = Path.get(i);
            kDistanceAway(pathNode, blocker, k - i);
            blocker = pathNode;
        }
        return ansArr;

    }
}