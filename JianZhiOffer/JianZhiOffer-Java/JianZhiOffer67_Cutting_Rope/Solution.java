package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer67_Cutting_Rope;

public class Solution {
    //贪心
    public int cutRope(int target) {
        if (target == 2)
            return 1;
        if (target == 3)
            return 2;
        int x = target % 3;
        int y = target / 3;
        if (x == 0)
            return (int) Math.pow(3, y);
        else if (x == 1)
            return 2 * 2 * (int) Math.pow(3, y - 1);
        else
            return (int) (2 * Math.pow(3, y));
    }

    //动态规划
    public int cutRope1(int target) {
        if (target <= 1) {
            return target;
        }
        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= target; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {
                max = max3(max, j * (i - j), j * dp[i - j]);
            }
            dp[i] = max;
        }
        return dp[target];
    }

    private int max3(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }
}
