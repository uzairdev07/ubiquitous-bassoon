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
    int count = 0;
    int[] path;

    public int pseudoPalindromicPaths(TreeNode root) {
        path = new int[10];
        _traverse(root);
        return count;
    }

    void _traverse(TreeNode node) {
        if (node == null)
            return;

        path[node.val]++;
        if (node.left == null && node.right == null) {
            if (isPalindrome(path))
                count++;
        } else {
            _traverse(node.left);
            _traverse(node.right);
        }
        path[node.val]--;
    }

    boolean isPalindrome(int[] arr) {
        int cOdd = 0;
        for (int n : arr)
            if (n % 2 == 1)
                cOdd++;
        return cOdd <= 1;
    }
}