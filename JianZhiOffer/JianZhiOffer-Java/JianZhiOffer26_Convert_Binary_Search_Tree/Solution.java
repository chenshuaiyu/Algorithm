package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer26_Convert_Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;

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

    private List<TreeNode> nodes = new ArrayList<>();

    //通过中序遍历对节点进行记录
    public TreeNode Convert1(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        inOrderTraverse(pRootOfTree);
        for (int i = 0; i < nodes.size(); i++) {
            if (i - 1 >= 0) {
                nodes.get(i).left = nodes.get(i - 1);
            }
            if (i + 1 < nodes.size()) {
                nodes.get(i).right = nodes.get(i + 1);
            }
        }
        return nodes.get(0);
    }

    private void inOrderTraverse(TreeNode node) {
        if (node == null) return;
        inOrderTraverse(node.left);
        nodes.add(node);
        inOrderTraverse(node.right);
    }
}
