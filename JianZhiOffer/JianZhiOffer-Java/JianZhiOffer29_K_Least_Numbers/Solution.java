package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer29_K_Least_Numbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (input == null || k > input.length || k == 0) return ans;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Comparator.reverseOrder());
        for (int i = 0; i < input.length; i++) {
            if (maxHeap.size() != k)
                maxHeap.add(input[i]);
            else if (input[i] < maxHeap.peek()) {
                maxHeap.remove();
                maxHeap.add(input[i]);
            }
        }
        ans.addAll(maxHeap);
        return ans;
    }
}
