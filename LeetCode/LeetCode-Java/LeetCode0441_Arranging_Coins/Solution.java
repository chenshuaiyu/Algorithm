package LeetCode0441_Arranging_Coins;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/20 22:28
 */
public class Solution {
    public int arrangeCoins(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            n -= i;
        }
        return i - 1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.arrangeCoins(5);
        System.out.println(ans);
    }
}
