package LeetCode.LeetCode_Java.LeetCode0004_Median_of_Two_Sorted_Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int index1 = 0, index2 = 0;
        int ans = 0, pre = 0;
        for (int i = 0; i <= len / 2; i++) {
            pre = ans;
            int t1 = Integer.MAX_VALUE;
            int t2 = Integer.MAX_VALUE;
            if (index1 < nums1.length)
                t1 = nums1[index1];
            if (index2 < nums2.length)
                t2 = nums2[index2];
            if (t1 < t2) {
                ans = t1;
                index1++;
            } else {
                ans = t2;
                index2++;
            }
        }
        if (len % 2 == 0)
            return (double) (pre + ans) / 2;
        else
            return ans;
    }

    //最大堆 + 最小堆
    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int size = 0;
        for (int i = 0; i < nums1.length; i++, size++) {
            if (size % 2 == 0) {
                maxHeap.add(nums1[i]);
                minHeap.add(maxHeap.poll());
            } else {
                minHeap.add(nums1[i]);
                maxHeap.add(minHeap.poll());
            }
        }
        for (int i = 0; i < nums2.length; i++, size++) {
            if (size % 2 == 0) {
                maxHeap.add(nums2[i]);
                minHeap.add(maxHeap.poll());
            } else {
                minHeap.add(nums2[i]);
                maxHeap.add(minHeap.poll());
            }
        }
        if (size % 2 == 0) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            return minHeap.peek();
        }
    }
}
