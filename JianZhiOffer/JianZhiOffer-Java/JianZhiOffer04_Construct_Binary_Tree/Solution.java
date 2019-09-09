package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer04_Construct_Binary_Tree;

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return constructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode constructBinaryTree(int[] pre, int pl, int pr, int[] in, int il, int ir) {
        if (pl > pr || il > ir)
            return null;
        //创建根节点
        TreeNode root = new TreeNode(pre[pl]);
        for (int i = il; i <= ir; i++) {
            //在中序遍历序列中寻找根节点
            if (in[i] == root.val) {
                root.left = constructBinaryTree(pre, pl + 1, pl + i - il, in, il, i - 1);
                root.right = constructBinaryTree(pre, pl + i - il + 1, pr, in, i + 1, ir);
                break;
            }
        }
        return root;
    }
}
