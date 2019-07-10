package LeetCode0088_Merge_Sorted_Array;

import java.util.Arrays;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/2 16:19
 */
public class Solution {
    // 从最后生成的数组出发看问题，倒序赋值也是一个小技巧
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {
            if (index1 < 0) {
                nums1[i] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[i] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[i] = nums1[index1--];
            } else {
                nums1[i] = nums2[index2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    // 效率极低的暴力法
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            int j;
            for (j = m; j > 0; j--) {
                if (nums1[j - 1] <= nums2[i]) {
                    nums1[j] = nums2[i];
                    m++;
                    break;
                } else {
                    nums1[j] = nums1[j - 1];
                }
            }
            if (j == 0) {
                int t = i - 1;
                nums1[j] = nums2[i];
                m++;
                for (int k = m; k > 0; k--) {
                    nums1[k + t] = nums1[k - 1];
                }
                for (int k = 0; k <= t; k++) {
                    nums1[k] = nums2[k];
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
