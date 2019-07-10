package LeetCode0070_Climbing_Stairs;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/26 20:29
 */
public class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.climbStairs(2);
        System.out.println(ans);
    }
}
