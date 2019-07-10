package LeetCode0219_Contains_Duplicate_II;

import java.util.HashMap;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/4 14:30
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && k >= i - map.get(nums[i]))
                return true;
            else
                map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
        System.out.println(ans);
    }
}
