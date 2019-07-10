package LeetCode0027_Remove_Element;

import java.util.Arrays;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/20 22:43
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[current++] = nums[i];
            }
        }
        return current;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        System.out.println(ans);
    }
}
