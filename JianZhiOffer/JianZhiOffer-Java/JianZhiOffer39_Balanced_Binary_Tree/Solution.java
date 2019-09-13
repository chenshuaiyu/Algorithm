package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer39_Balanced_Binary_Tree;

public class Solution {
    private boolean ans = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;
        depth(root);
        return ans;
    }

    private int depth(TreeNode root) {
        if (root == null)
            return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        if (Math.abs(left - right) > 1)
            ans = false;
        return Math.max(left, right) + 1;
    }
}
