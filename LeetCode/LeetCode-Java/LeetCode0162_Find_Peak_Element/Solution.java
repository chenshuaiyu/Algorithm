package LeetCode0162_Find_Peak_Element;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/24 14:27
 */
public class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.findPeakElement(new int[]{1, 2, 3, 1});
        System.out.println(ans);
    }
}
