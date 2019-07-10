package LeetCode0268_Missing_Number;

import java.util.stream.IntStream;

public class Solution {
    public int missingNumber(int[] nums) {
        return IntStream.rangeClosed(1, nums.length).sum() - IntStream.of(nums).sum();
    }

    public int missingNumber1(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans + i - nums[i];
        }
        return ans + nums.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(ans);
    }
}
