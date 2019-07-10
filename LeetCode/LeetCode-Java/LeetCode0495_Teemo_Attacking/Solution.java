package LeetCode0495_Teemo_Attacking;


public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) return 0;
        int ans = duration;
        for (int i = 1; i < timeSeries.length; i++)
            ans += Math.min(duration, timeSeries[i] - timeSeries[i - 1]);
        return ans;
    }

    public int findPoisonedDuration1(int[] timeSeries, int duration) {
        int ans = 0;
        int cur = 0;
        for (int n : timeSeries) {
            ans += duration;
            if (cur > n) {
                ans -= cur - n;
                cur = Math.max(duration + n, cur);
            } else
                cur = n + duration;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.findPoisonedDuration(new int[]{1, 4}, 2);
        System.out.println(ans);
    }
}
