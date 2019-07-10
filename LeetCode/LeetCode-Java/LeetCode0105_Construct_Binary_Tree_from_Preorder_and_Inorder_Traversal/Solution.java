package LeetCode0105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return constructBinaryTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode constructBinaryTree(int[] pre, int pl, int pr, int[] in, int il, int ir) {
        if (pl > pr || il > ir)
            return null;
        TreeNode root = new TreeNode(pre[pl]);
        for (int i = il; i <= ir; i++) {
            if (in[i] == root.val) {
                root.left = constructBinaryTree(pre, pl + 1, pl + i - il, in, il, i - 1);
                root.right = constructBinaryTree(pre, pl + i - il + 1, pr, in, i + 1, ir);
                break;
            }
        }
        return root;
    }
}
