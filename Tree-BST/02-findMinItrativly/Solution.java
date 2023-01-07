/*
 * Minimum element in BST
 * BasicAccuracy: 70.95%Submissions: 101K+Points: 1
 * Lamp
 * Save Today, Earn More Tomorrow. Get 25% off on Complete Interview Preparation
 * 
 * Given a Binary Search Tree. The task is to find the minimum element in this
 * given BST.
 * 
 * Example 1:
 * 
 * Input:
 * 5
 * / \
 * 4 6
 * / \
 * 3 7
 * /
 * 1
 * Output: 1
 * Example 2:
 * 
 * Input:
 * 9
 * \
 * 10
 * \
 * 11
 * Output: 9
 * Your Task:
 * The task is to complete the function minValue() which takes root as the
 * argument and returns the minimum element of BST. If the tree is empty, there
 * is no minimum element, so return -1 in that case.
 * 
 * Expected Time Complexity: O(Height of the BST)
 * Expected Auxiliary Space: O(1).
 * 
 * Constraints:
 * 0 <= N <= 104
 */

 class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {

        if (node == null) {
            return -1;
        }

        Node currNode = node;
        while (currNode.left != null) {
            currNode = currNode.left;
        }
        return currNode.data;
    }
}
