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
    public int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root, low, high);
        return sum;
    }
    private void helper(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }
        helper(root.left, low, high);
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        helper(root.right, low, high);
    }
}