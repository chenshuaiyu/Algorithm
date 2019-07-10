package JianZhiOffer59_Print_Tree_In_Zigzag;

import  java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (pRoot == null) return ans;
        boolean order = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            if (order) {
                for (int i = queue.size() - 1; i >= 0; i--) {
                    TreeNode node = queue.poll();
                    linkedList.addLast(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            } else {
                for (int i = queue.size() - 1; i >= 0; i--) {
                    TreeNode node = queue.poll();
                    linkedList.addFirst(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            order = !order;
            ans.add(new ArrayList<>(linkedList));
        }
        return ans;
    }
}
