package JianZhiOffer26_Convert_Binary_Search_Tree;

public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        convert(pRootOfTree, null, null);
        while (pRootOfTree.left != null)
            pRootOfTree = pRootOfTree.left;
        return pRootOfTree;
    }

    private void convert(TreeNode pRootOfTree, TreeNode left, TreeNode right) {
        if (pRootOfTree == null)
            return;
        convert(pRootOfTree.left, null, pRootOfTree);
        convert(pRootOfTree.right, pRootOfTree, null);
        if (left == null && right == null) {
            if (pRootOfTree.left != null)
                pRootOfTree.left.right = pRootOfTree;
            if (pRootOfTree.right != null)
                pRootOfTree.right.left = pRootOfTree;
        } else if (left == null) {
            if (pRootOfTree.left != null)
                pRootOfTree.left.right = pRootOfTree;
            if (pRootOfTree.right != null) {
                pRootOfTree.right.right = right;
                right.left = pRootOfTree.right;
                pRootOfTree.right.left = pRootOfTree;
            }
        } else {
            if (pRootOfTree.left != null) {
                pRootOfTree.left.left = left;
                left.right = pRootOfTree.left;
                pRootOfTree.left.right = pRootOfTree;
            }
            if (pRootOfTree.right != null)
                pRootOfTree.right.left = pRootOfTree;
        }
    }
}
