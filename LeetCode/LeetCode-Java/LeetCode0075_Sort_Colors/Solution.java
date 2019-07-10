package LeetCode0075_Sort_Colors;

import java.util.Arrays;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/27 16:26
 */
public class Solution {
    public void sortColors(int[] nums) {
        int n0 = 0;
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0:
                    n0++;
                    break;
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < n0; i++) nums[i] = 0;
        for (int i = n0; i < n1 + n0; i++) nums[i] = 1;
        for (int i = n1 + n0; i < n2 + n1 + n0; i++) nums[i] = 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }
}
