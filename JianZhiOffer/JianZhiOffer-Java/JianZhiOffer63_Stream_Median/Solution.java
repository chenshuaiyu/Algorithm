package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer63_Stream_Median;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Solution {
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();//存大数
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());//存小数
    private int count = 0;

    public void Insert(Integer num) {
        if (count % 2 == 0) {
            //偶数变奇数 -> minHeap
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        } else {
            //奇数变偶数 -> maxHeap
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
        count++;
    }

    public Double GetMedian() {
        if (count % 2 == 0) {
            double d1 = minHeap.peek();
            double d2 = maxHeap.peek();
            return (d1 + d2) / 2;
        } else {
            return Double.valueOf(minHeap.peek());
        }
    }

    private LinkedList<Integer> linkedList = new LinkedList<>();

    public void Insert1(Integer num) {
        if (linkedList.isEmpty() || linkedList.get(0) > num) {
            linkedList.addFirst(num);
        } else {
            int i, len = linkedList.size();
            for (i = 1; i < len; i++) {
                Integer integer = linkedList.get(i);
                if (integer >= num) {
                    linkedList.add(i, num);
                    break;
                }
            }
            if (i == len)
                linkedList.addLast(num);
        }
    }

    public Double GetMedian1() {
        int len = linkedList.size();
        if (len == 0)
            return null;
        if (len % 2 == 1) {
            return Double.valueOf(linkedList.get(len / 2));
        } else {
            double d1 = linkedList.get(len / 2 - 1);
            double d2 = linkedList.get(len / 2);
            return (d1 + d2) / 2;
        }
    }
}
