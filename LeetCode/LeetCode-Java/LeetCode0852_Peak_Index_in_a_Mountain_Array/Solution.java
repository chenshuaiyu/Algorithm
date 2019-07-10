package LeetCode0852_Peak_Index_in_a_Mountain_Array;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/24 14:47
 */
public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int l = 0;
        int r = A.length - 1;
        int mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (A[mid] > A[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.peakIndexInMountainArray(new int[]{0, 2, 1, 0});
        System.out.println(ans);
    }
}
