package LeetCode0169_Majority_Element;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/1 14:07
 */
public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1 || nums.length == 2) return nums[0];
        int count = 0;
        int majority = nums[0];
        for (int num: nums) {
            if (count == 0){
                majority = num;
                count++;
            } else {
                if (majority == num)
                    count++;
                else
                    count--;
            }
        }
        return majority;
    }

    // HashMap
    public int majorityElement1(int[] nums) {
        if (nums.length == 1 || nums.length == 2) return nums[0];
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        for (Integer s : map.keySet()) {
            int t = map.get(s).intValue();
            if (t > n)
                return s;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.majorityElement(new int[]{3, 2, 3});
        System.out.println(ans);
    }
}
