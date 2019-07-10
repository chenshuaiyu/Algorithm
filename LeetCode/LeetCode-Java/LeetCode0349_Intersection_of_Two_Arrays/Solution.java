package LeetCode0349_Intersection_of_Two_Arrays;

import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }

        int[] ans = new int[nums2.length];
        int p = 0;
        for (int n : set2) {
            if (set1.contains(n))
                ans[p++] = n;
        }
        return Arrays.copyOf(ans, p);
    }

    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }

        set1.retainAll(set2);
        int[] ans = new int[nums1.length];
        int p = 0;
        for (int n : set1) {
            ans[p++] = n;
        }
        return Arrays.copyOf(ans, p);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println(Arrays.toString(ans));
    }
}
