package LeetCode0026_Remove_Duplicates_from_Sorted_Array;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/25 20:42
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1])
                nums[j++] = nums[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.println(ans);
    }
}
