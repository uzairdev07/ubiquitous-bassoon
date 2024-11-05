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

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null)
            return res;

        levelOrderTraverse(root, 0);
        return res;

    }

    private void levelOrderTraverse(TreeNode root, int l) {
        if (root == null)
            return;

        if (res.size() == l) {
            List<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            res.add(temp);
        } else {
            res.get(l).add(root.val);
        }

        levelOrderTraverse(root.left, l+1);
        levelOrderTraverse(root.right, l+1);

    }

}