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
    public int maxDepthHelper(TreeNode node, int[] currHeight) {
        if (node == null) {
            return currHeight[0];
        }

        int leftHeight = maxDepthHelper(node.left, currHeight);
        int rightHeight = maxDepthHelper(node.right, currHeight);

        return Integer.max(leftHeight, rightHeight) + 1;
    }
    public int maxDepth(TreeNode root) {
        int[] currHeight = new int[1];
        return maxDepthHelper(root, currHeight);
        
    }
}
