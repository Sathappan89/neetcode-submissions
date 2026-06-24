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
    int globalMaxDiameter = 0;

    public int diameterOfBinaryTreeHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = diameterOfBinaryTreeHelper(root.left);
        int rightHeight = diameterOfBinaryTreeHelper(root.right);

        int diameter = leftHeight + rightHeight;
        globalMaxDiameter = Integer.max(globalMaxDiameter, diameter);
        return Integer.max(leftHeight, rightHeight) + 1;

    }

    public int diameterOfBinaryTree(TreeNode root) {

        diameterOfBinaryTreeHelper(root);
        return globalMaxDiameter;
    }


}
