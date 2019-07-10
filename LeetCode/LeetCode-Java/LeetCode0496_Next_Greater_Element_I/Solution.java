package LeetCode0496_Next_Greater_Element_I;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            int j;
            for (j = i + 1; j < nums2.length; j++) {
                if (nums2[i] < nums2[j]) {
                    map.put(nums2[i], nums2[j]);
                    break;
                }
            }
            if (j == nums2.length)
                map.put(nums2[i], -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        System.out.println(Arrays.toString(ans));
    }
}
