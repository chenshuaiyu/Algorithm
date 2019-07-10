package LeetCode0106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode build(int[] inorder, int il, int ir, int[] postorder, int pl, int pr) {
        if (pl > pr || il > ir)
            return null;
        TreeNode root = new TreeNode(postorder[pr]);
        for (int i = il; i <= ir; i++) {
            if (inorder[i] == root.val) {
                root.left = build(inorder, il, i - 1, postorder, pl, pl + i - 1 - il);
                root.right = build(inorder, i + 1, ir, postorder, pl + i - il, pr - 1);
                break;
            }
        }
        return root;
    }
}
