package LeetCode0746_Min_Cost_Climbing_Stairs;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/11 22:42
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) return cost[0];
        for (int i = 2; i < cost.length; i++)
            cost[i] = cost[i] + Math.min(cost[i - 1], cost[i - 2]);
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        System.out.println(ans);
    }
}
