package LeetCode0559_Maximum_Depth_of_N_ary_Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    //BFS
    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        int count = 0;
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            count++;
            for (int i = queue.size() - 1; i >= 0; i--) {
                Node node = queue.pollFirst();
                if (node.children != null)
                    queue.addAll(node.children);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Node node = new Node(1,
                new ArrayList<Node>(Arrays.asList(new Node(3, new ArrayList<Node>(Arrays.asList(new Node(5, null), new Node(6, null)))),
                        new Node(2, null),
                        new Node(4, null))));
        int ans = solution.maxDepth(node);
        System.out.println(ans);
    }
}
