package LeetCode0094_Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    private List<Integer> ans = new ArrayList<>();

    //中序遍历-递归
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return ans;
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
        return ans;
    }

    //中序遍历-栈
    public List<Integer> inorderTraversal1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
}
