// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        return isValidNode(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean isValidNode(TreeNode root, long max, long min) {
        if (root==null) return true;
        if (!(root.val<max && root.val>min)) return false;
        boolean leftNodeIsValid = isValidNode(root.left, root.val, min);
        boolean rightNodeIsValid = isValidNode(root.right, max, root.val);
        return leftNodeIsValid && rightNodeIsValid;
    }
}