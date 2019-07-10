package JianZhiOffer18_Mirror_of_Binary_Tree;

public class Solution {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        //递归
        Mirror(root.left);
        Mirror(root.right);
    }
}
