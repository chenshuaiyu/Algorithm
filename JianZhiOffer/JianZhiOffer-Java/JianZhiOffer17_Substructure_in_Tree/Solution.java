package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer17_Substructure_in_Tree;

public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean ans = false;
        if (root1 != null && root2 != null) {
            //查找值相等的节点
            if (root1.val == root2.val)
                ans = isSubtree(root1, root2);
            if (!ans)
                ans = isSubtree(root1.left, root2);
            if (!ans)
                ans = isSubtree(root1.right, root2);
        }
        return ans;
    }

    private boolean isSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val != root2.val) return false;
        return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
    }
}
