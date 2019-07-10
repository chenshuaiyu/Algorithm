package LeetCode0283_Move_Zeroes;

import java.util.Arrays;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/5 18:18
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;
        int t;
        for (int i = 0, j = 1; i < nums.length - 1 && j < nums.length; j++) {
            if (nums[i] == 0) {
                if (nums[j] == 0) {
                    continue;
                }
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
