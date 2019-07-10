package LeetCode0589_N_ary_Tree_Preorder_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    private List<Integer> ans = new ArrayList<>();

    //递归
    public List<Integer> preorder(Node root) {
        if (root != null) {
            ans.add(root.val);
            for (Node n : root.children) {
                preorder(n);
            }
        }
        return ans;
    }

    //非递归
    public List<Integer> preorder1(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root != null)
            stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            ans.add(node.val);
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.add(node.children.get(i));
            }
        }
        return ans;
    }
}
