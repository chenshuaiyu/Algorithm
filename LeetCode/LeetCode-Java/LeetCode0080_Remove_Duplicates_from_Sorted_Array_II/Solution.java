package LeetCode0080_Remove_Duplicates_from_Sorted_Array_II;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/25 20:29
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
        System.out.println(ans);
    }
}
