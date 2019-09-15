package LeetCode.LeetCode_Java.LeetCode0295_Find_Median_from_Data_Stream;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    private int size = 0;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if (size % 2 == 0) {
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        } else {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }
        size++;
    }

    public double findMedian() {
        if (size % 2 == 0) {
            return (double) (minHeap.peek() + maxHeap.peek()) / 2;
        } else {
            return maxHeap.peek();
        }
    }
}
