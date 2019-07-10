package LeetCode0217_Contains_Duplicate;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/4 14:21
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        System.out.println(ans);
    }
}
