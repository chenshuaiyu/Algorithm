package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer62_54_Kth_Node_In_BST;

import java.util.ArrayList;

public class Solution {
    private ArrayList<TreeNode> list = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k == 0)
            return null;
        inOrder(pRoot);
        if (k > list.size())
            return null;
        return list.get(k - 1);
    }

    private void inOrder(TreeNode pRoot) {
        if (pRoot != null) {
            inOrder(pRoot.left);
            list.add(pRoot);
            inOrder(pRoot.right);
        }
    }

    TreeNode KthNode1(TreeNode pRoot, int k) {
        return null;
    }
}
