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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> L = new ArrayList<>();
        if (root == null)
            return L;
        if (root.left != null)
            L = inorderTraversal(root.left);
        L.add(root.val);
        if (root.right != null) 
            L.addAll(inorderTraversal(root.right));
        return L;

    }
}