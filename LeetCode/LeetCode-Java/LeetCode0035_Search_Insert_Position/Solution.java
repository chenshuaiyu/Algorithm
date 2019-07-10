package LeetCode0035_Search_Insert_Position;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.searchInsert(new int[]{1, 3, 5, 6}, 5);
        System.out.println(ans);
    }
}
