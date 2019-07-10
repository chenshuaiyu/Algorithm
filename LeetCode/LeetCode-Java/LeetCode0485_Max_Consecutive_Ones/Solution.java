package LeetCode0485_Max_Consecutive_Ones;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, current = 0;
        boolean flag = false;
        for (int n : nums) {
            if (n == 1)
                current++;
            else {
                ans = Math.max(ans, current);
                current = 0;
            }
        }
        ans = Math.max(ans, current);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        System.out.println(ans);
    }
}
