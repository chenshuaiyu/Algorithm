package JianZhiOffer60_Print_Tree_In_Row;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (pRoot == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = queue.size() - 1; i >= 0; i--) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            ans.add(list);
        }
        return ans;
    }
}
