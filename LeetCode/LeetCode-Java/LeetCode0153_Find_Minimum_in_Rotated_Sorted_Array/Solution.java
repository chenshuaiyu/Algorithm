package LeetCode0153_Find_Minimum_in_Rotated_Sorted_Array;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/1 13:42
 */
public class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int l = 0, r = nums.length - 1, mid;
        if (nums[l] < nums[r])
            return nums[0];
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if (nums[mid] > nums[r])
                l = mid + 1;
            else
                r = mid;
        }
        return nums[(l + r) / 2];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.findMin(new int[]{4, 5, 6, 7, 8, 0, 1, 2, 3});
        System.out.println(ans);
    }
}
