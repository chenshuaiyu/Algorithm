package LeetCode0826_Most_Profit_Assigning_Work;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int ans = 0;
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < difficulty.length; i++) {
            points.add(new Point(difficulty[i], profit[i]));
        }
        Collections.sort(points, (o1, o2) -> o1.x - o2.x);
        Arrays.sort(worker);

        int j = 0, p = 0;
        for (int i = 0; i < worker.length; i++) {
            while (j < difficulty.length && worker[i] >= points.get(j).x)
                p = Math.max(points.get(j++).y, p);
            ans += p;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.maxProfitAssignment(new int[]{2, 1, 3, 4}, new int[]{20, 10, 30, 40}, new int[]{1, 1, 3, 4});
        System.out.println(ans);
    }
}
