package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer08_Jump_Floor;

public class Solution {
    //斐波那契数列

    public int JumpFloor(int target) {
        if (target <= 2) return target;
        //可保存之前的状态
        int[] dp = new int[target + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= target; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[target];
    }

    public int JumpFloor1(int target) {
        if (target <= 2) return target;
        int ans = 0, n1 = 1, n2 = 2;
        for (int i = 3; i <= target; i++) {
            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }
        return ans;
    }
}
