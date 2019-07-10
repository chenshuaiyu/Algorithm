package LeetCode0199_Binary_Tree_Right_Side_View;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    //BFS
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode t = queue.pollFirst();
                if (t.left != null) queue.add(t.left);
                if (t.right != null) queue.add(t.right);
                if (i == 0)
                    ans.add(t.val);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(4);
        List<Integer> ans = solution.rightSideView(treeNode);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}
