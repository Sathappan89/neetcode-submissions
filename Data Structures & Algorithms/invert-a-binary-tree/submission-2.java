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
    /*
    public void invertTreeHelper(TreeNode node) {
        //base case
        if (node == null){
            return;
        }

        //logic
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        //what makes recursion work
        invertTreeHelper(node.left);
        invertTreeHelper(node.right);
    }

    public TreeNode invertTree(TreeNode root) {
        invertTreeHelper(root);
        return root;    
    }*/

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            //swap
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }

}
