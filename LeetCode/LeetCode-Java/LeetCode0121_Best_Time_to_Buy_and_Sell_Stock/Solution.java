package LeetCode.LeetCode_Java.LeetCode0121_Best_Time_to_Buy_and_Sell_Stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > ans)
                ans = prices[i] - minPrice;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2});
        System.out.println(ans);
    }
}
