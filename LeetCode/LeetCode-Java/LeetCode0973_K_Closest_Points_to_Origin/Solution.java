package LeetCode0973_K_Closest_Points_to_Origin;

import java.util.*;

public class Solution {
    class Node {
        int n;
        int index;

        public Node(int n, int index) {
            this.n = n;
            this.index = index;
        }
    }

    public int[][] kClosest(int[][] points, int K) {
        ArrayList<Node> list = new ArrayList<>();
        int[][] ans = new int[K][2];
        for (int i = 0; i < points.length; i++) {
            list.add(new Node(points[i][0] * points[i][0] + points[i][1] * points[i][1], i));
        }
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.n - o2.n;
            }
        });
        for (int i = 0; i < K; i++) {
            int index = list.get(i).index;
            ans[i] = points[index];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ans = solution.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1);
        for (int[] nums : ans) {
            System.out.println(Arrays.toString(nums));
        }
    }
}
