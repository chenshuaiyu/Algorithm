package LeetCode0001_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/13 18:38
 */
public class Solution {

    // 查表法，如果在 HashMap 中找到差值，则返回，否则将此元素加入 HashMap
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if (hashMap.containsKey(a)) {
                return new int[]{hashMap.get(a), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(num));
    }
}
