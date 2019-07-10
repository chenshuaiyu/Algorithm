package LeetCode0112_Path_Sum;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/23 23:28
 */
public class Solution {

    public boolean hasPathSum1(TreeNode root, int sum) {
        if (root == null) return false;
        if (sum == root.val && root.left == null && root.right == null)
            return true;
        return hasPathSum1(root.left, sum - root.val) || hasPathSum1(root.right, sum - root.val);
    }

    boolean ans = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root != null)
            dfs(root, 0, sum);
        return ans;
    }

    private void dfs(TreeNode root, int n, int sum) {
        if (root == null) return;
        if (n + root.val == sum && root.left == null && root.right == null) {
            ans = true;
            return;
        }
        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0:
                    dfs(root.left, n + root.val, sum);
                    break;
                case 1:
                    dfs(root.right, n + root.val, sum);
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(11);
//        root.left.right = null;
//        root.left.left.left = new TreeNode(7);
//        root.left.left.right = new TreeNode(2);
//        root.right.left = new TreeNode(13);
//        root.right.right = new TreeNode(4);
//        root.right.right.right = new TreeNode(1);
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
        TreeNode root = new TreeNode(-2);
        root.right = new TreeNode(-3);
        boolean ans = solution.hasPathSum(root, -5);
        System.out.println(ans);
    }
}
