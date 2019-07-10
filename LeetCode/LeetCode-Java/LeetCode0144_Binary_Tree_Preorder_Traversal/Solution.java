package LeetCode0144_Binary_Tree_Preorder_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    private List<Integer> ans = new ArrayList<>();

    //前序遍历-递归
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return ans;
        ans.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return ans;
    }

    //前序遍历-栈
    public List<Integer> preorderTraversal1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                ans.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop().right;
        }
        return ans;
    }
}
