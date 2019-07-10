package LeetCode0101_Symmetric_Tree;

import java.util.LinkedList;

public class Solution {

    //递归判断左右子树是否堆成
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetricTree(root.left, root.right);
    }

    private boolean isSymmetricTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        else if (p.val != q.val)
            return false;
        return isSymmetricTree(p.left, q.right) && isSymmetricTree(p.right, q.left);
    }

    public boolean isSymmetric1(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.addFirst(root.left);
        linkedList.addLast(root.right);
        while (!linkedList.isEmpty()) {
            for (int l = 0, r = linkedList.size() - 1; l < r; l++, r--) {
                TreeNode leftNode = linkedList.pollFirst();
                TreeNode rightNode = linkedList.pollLast();
                if ((leftNode == null && rightNode == null)) {
                    continue;
                } else if (leftNode != null && rightNode != null && leftNode.val == rightNode.val) {
                    linkedList.addFirst(leftNode.right);
                    linkedList.addFirst(leftNode.left);
                    linkedList.addLast(rightNode.left);
                    linkedList.addLast(rightNode.right);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
