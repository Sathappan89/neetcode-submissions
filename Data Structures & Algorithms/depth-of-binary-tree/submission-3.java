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
    Recursion
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
        
    }*/

    //Using Stack
    public int maxDepth(TreeNode root) {
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 1));
        int res = 0;

        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> current = stack.pop();
            TreeNode node = current.getKey();
            int parentDepth = current.getValue();

            if (node != null) {
                res = Math.max(res, parentDepth);
                stack.push(new Pair<>(node.left, parentDepth + 1));
                stack.push(new Pair<>(node.right, parentDepth + 1));
            }
        }
        return res;
    }

}
