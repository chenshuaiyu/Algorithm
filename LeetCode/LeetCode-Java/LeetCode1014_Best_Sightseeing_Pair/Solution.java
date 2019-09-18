package LeetCode.LeetCode_Java.LeetCode1014_Best_Sightseeing_Pair;

public class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        if (A == null || A.length == 0)
            return 0;
        int ans = Integer.MIN_VALUE;
        int pre = A[0] + 0;
        for (int i = 1; i < A.length; i++) {
            ans = Math.max(ans, pre + A[i] - i);
            pre = Math.max(pre, A[i] + i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6});
        System.out.println(ans);
    }
}
