package LeetCode0103_Binary_Tree_Zigzag_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        boolean order = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            if (order) {
                for (int i = queue.size() - 1; i >= 0; i--) {
                    TreeNode node = queue.poll();
                    linkedList.addLast(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);

                }
            } else {
                for (int i = queue.size() - 1; i >= 0; i--) {
                    TreeNode node = queue.poll();
                    linkedList.addFirst(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            order = !order;
            ans.add(linkedList);
        }
        return ans;
    }
}
