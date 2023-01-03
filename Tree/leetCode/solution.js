/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
//  * @param {TreeNode} root
//  * @return {number}
//  */
// var diameterOfBinaryTree = function(root) {
//       if(root == null){
//         return 0;
//       }

//     let leftDia = diameterOfBinaryTree(root.left);
//     let rightDia = diameterOfBinaryTree(root.rigth);

//       let leftHight = maxDepth(root.left);
//       let rightHight = maxDepth(root.right);

//       let myDia  = leftHight + rightHight + 2;

//       return (Math.max(myDia , Math.max(leftDia , rightDia)));
// };

// function maxDepth(root){
//     return (root ===null ? -1 : Math.max(maxDepth(root.left) , maxDepth(root.right) +1));
// }
