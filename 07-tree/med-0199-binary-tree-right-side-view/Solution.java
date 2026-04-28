import java.util.*;

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

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)
            return ans;

        q.offer(root); 

        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size; i++) {

                TreeNode child = q.poll();

                if(i == size - 1)
                    ans.add(child.val);

                if(child.left != null)
                    q.offer(child.left);
                if(child.right != null)
                    q.offer(child.right);
            }
        }
        return ans;
    }
    
}