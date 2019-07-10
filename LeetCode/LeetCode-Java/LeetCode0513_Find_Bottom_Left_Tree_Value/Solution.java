package LeetCode0513_Find_Bottom_Left_Tree_Value;

import java.util.LinkedList;

public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        int val = root.val;
        queue.add(root);
        while (!queue.isEmpty()) {
            val = queue.getFirst().val;
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode t = queue.pollFirst();
                if (t.left != null) queue.add(t.left);
                if (t.right != null) queue.add(t.right);
            }
        }
        return val;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        int ans = solution.findBottomLeftValue(treeNode);
        System.out.println(ans);
    }
}
