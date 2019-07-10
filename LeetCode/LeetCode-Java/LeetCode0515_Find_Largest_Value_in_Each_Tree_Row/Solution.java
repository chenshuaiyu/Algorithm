package LeetCode0515_Find_Largest_Value_in_Each_Tree_Row;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/21 21:41
 */
public class Solution {
    int[] nums = new int[100000];
    int p = 0;
    int max = 0;

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Arrays.fill(nums, Integer.MIN_VALUE);
        dfs(root);
        ArrayList list = new ArrayList();
        for (int i = 0; i <= max; i++) {
            list.add(nums[i]);
        }

        return list;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;
        nums[p] = Math.max(nums[p], node.val);
        max = Math.max(max, p);
        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0:
                    p++;
                    dfs(node.left);
                    p--;
                    break;
                case 1:
                    p++;
                    dfs(node.right);
                    p--;
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        List<Integer> ans = solution.largestValues(root);
        for (Integer i : ans) {
            System.out.println(i);
        }

    }
}
