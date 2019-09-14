package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer63_Stream_Median;

import java.util.LinkedList;

public class Solution {
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public void Insert(Integer num) {
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

    public Double GetMedian() {
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
