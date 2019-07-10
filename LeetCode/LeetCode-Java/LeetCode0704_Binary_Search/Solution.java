package LeetCode0704_Binary_Search;

public class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            if (target > nums[mid]) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        System.out.println(ans);
    }
}
