package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer38_Tree_Depth;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    //递归
    public int TreeDepth(TreeNode root) {
        return root == null ? 0 : Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }

    //层级遍历
    public int TreeDepth1(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            ans++;
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode node = queue.remove();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return ans;
    }
}
