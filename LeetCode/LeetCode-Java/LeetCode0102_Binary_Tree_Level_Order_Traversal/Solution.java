package LeetCode0102_Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<>();
        if (root == null)
            return ans;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ans.addLast(new ArrayList<>(Arrays.asList(root.val)));
        while (!queue.isEmpty()) {
            LinkedList<Integer> l = new LinkedList<>();
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode t = queue.pollFirst();
                if (t != null && t.left != null) {
                    l.add(t.left.val);
                    queue.add(t.left);
                }
                if (t != null && t.right != null) {
                    l.add(t.right.val);
                    queue.add(t.right);
                }
            }
            if (l.size() != 0)
                ans.addLast(l);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        List<List<Integer>> ans = solution.levelOrder(treeNode);
        for (List<Integer> list : ans) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
