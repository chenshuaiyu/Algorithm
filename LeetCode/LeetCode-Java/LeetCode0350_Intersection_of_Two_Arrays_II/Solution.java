package LeetCode0350_Intersection_of_Two_Arrays_II;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            if (!map.containsKey(n))
                map.put(n, 1);
            else
                map.put(n, map.get(n) + 1);
        }
        int[] ans = new int[nums2.length];
        int p = 0;
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) != 0) {
                ans[p++] = n;
                map.put(n, map.get(n) - 1);
            }

        }
        return Arrays.copyOf(ans, p);
    }

    public int[] intersect1(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums1) {
            list.add(n);
        }
        int[] ans = new int[nums2.length];
        int p = 0;
        for (int n : nums2) {
            if (list.contains(n)) {
                ans[p++] = n;
                list.remove(new Integer(n));
            }
        }
        return Arrays.copyOf(ans, p);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println(Arrays.toString(ans));
    }
}
