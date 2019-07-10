package LeetCode0429_N_ary_Tree_Level_Order_Traversal;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    //BFS
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> integers = new ArrayList<>();
            for (int i = queue.size() - 1; i >= 0; i--) {
                Node node = queue.poll();
                integers.add(node.val);
                for (Node n : node.children)
                    queue.add(n);
            }
            ans.add(integers);
        }
        return ans;
    }

    //递归
    public List<List<Integer>> levelOrder1(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        level(root, 0, ans);
        return ans;
    }

    private void level(Node root, int l, List<List<Integer>> ans) {
        if (root == null) return;
        if (ans.size() == l)
            ans.add(new ArrayList<>());
        ans.get(l).add(root.val);
        for (Node n : root.children)
            level(n, l + 1, ans);
    }
}
