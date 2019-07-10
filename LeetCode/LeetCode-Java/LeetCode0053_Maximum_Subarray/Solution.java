package LeetCode0053_Maximum_Subarray;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/3 22:20
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (current < 0)
                current = nums[i];
            else
                current += nums[i];
            max = current > max ? current : max;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(ans);
    }
}
