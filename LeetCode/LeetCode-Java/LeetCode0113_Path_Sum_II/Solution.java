package LeetCode0113_Path_Sum_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return ans;
        dfs(root, new ArrayList<>(), sum);
        return ans;
    }

    private void dfs(TreeNode root, List<Integer> list, int n) {
        if (root == null) return;
        list.add(root.val);
        if (root.val == n && root.left == null && root.right == null)
            ans.add(new ArrayList<>(list));
        dfs(root.left, list, n - root.val);
        dfs(root.right, list, n - root.val);
        list.remove(list.size() - 1);
    }
}
