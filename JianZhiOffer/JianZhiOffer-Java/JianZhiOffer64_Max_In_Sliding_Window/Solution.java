package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer64_Max_In_Sliding_Window;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (num == null || size == 0 || num.length < size)
            return ans;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < num.length; i++) {
            if (i < size) {
                queue.add(num[i]);
            } else {
                ans.add(queue.peek());
                queue.remove(num[i - size]);
                queue.add(num[i]);
            }
        }
        ans.add(queue.peek());
        return ans;
    }
}
