package LeetCode0257_Binary_Tree_Paths;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return ans;
        dfs(root, root.val + "");
        return ans;
    }

    private void dfs(TreeNode root, String s) {
        if (root.left == null && root.right == null) {
            ans.add(s);
            return;
        }
        if (root.left != null)
            dfs(root.left, s + "->" + root.left.val);
        if (root.right != null)
            dfs(root.right, s + "->" + root.right.val);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(5);

        List<String> ans = solution.binaryTreePaths(treeNode);
        System.out.println(ans);
    }
}
