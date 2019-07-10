package LeetCode0700_Search_in_a_Binary_Search_Tree;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/12 14:26
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val){
            if (root.val < val)
                root = root.right;
            else
                root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(4);
        root.right = new TreeNode(7);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        TreeNode ans = solution.searchBST(root, 2);
        System.out.println(ans.val);
    }
}
