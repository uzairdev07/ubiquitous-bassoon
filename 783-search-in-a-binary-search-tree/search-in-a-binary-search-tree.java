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
    List<Integer> res = new ArrayList<>();
    public TreeNode searchBST(TreeNode root, int val) {
        return bs(root, val);
    }

    TreeNode bs(TreeNode root, int v) {
        if (root == null)
            return null;

        if (root.val == v)
            return root;
        else if (v < root.val)
            root = bs(root.left, v);
        else
            root = bs(root.right, v);
        return root;
    }
}