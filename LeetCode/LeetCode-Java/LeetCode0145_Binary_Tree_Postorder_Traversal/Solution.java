package LeetCode0145_Binary_Tree_Postorder_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    private List<Integer> ans = new ArrayList<>();

    //后序遍历-递归
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return ans;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ans.add(root.val);
        return ans;
    }

    //后序遍历-栈
    public List<Integer> postorderTraversal1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode pre = null;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.peek();
            if (node.right == null || node.right == pre) {
                pre = stack.pop();
                ans.add(node.val);
                node = null;
            } else
                node = node.right;
        }
        return ans;
    }
}
