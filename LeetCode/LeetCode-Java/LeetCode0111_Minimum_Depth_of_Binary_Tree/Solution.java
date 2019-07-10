package LeetCode0111_Minimum_Depth_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    //BFS
    public int minDepth(TreeNode root) {
        int level = 0;
        if (root == null) return level;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            level++;
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null)
                    return level;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return -1;
    }

    //递归
    public int minDepth1(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null)
            return 1;
        int leftMin = (root.left != null ? minDepth1(root.left) : Integer.MAX_VALUE);
        int rightMin = (root.right != null ? minDepth1(root.right) : Integer.MAX_VALUE);
        return Math.min(leftMin, rightMin) + 1;
    }
}
