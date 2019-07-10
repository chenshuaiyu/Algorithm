package LeetCode0056_Merge_Intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/2 17:05
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        // 不利用额外空间
        for (int i = 0; i < intervals.size() - 1;) {
            int start1 = intervals.get(i).start;
            int start2 = intervals.get(i + 1).start;
            int end1 = intervals.get(i).end;
            int end2 = intervals.get(i + 1).end;
            // n1, n2为相交区间
            int n1 = Math.max(start1, start2);
            int n2 = Math.min(end1, end2);
            if (n1 <= n2) {
                Interval interval = intervals.get(i);
                interval.start = Math.min(start1, start2);
                interval.end = Math.max(end1, end2);
                intervals.remove(i + 1);
            }else
                i++;
        }
        return intervals;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(2, 6));
        list.add(new Interval(1, 3));
        list.add(new Interval(8, 10));
        list.add(new Interval(15, 18));
        List<Interval> ans = solution.merge(list);
        for (Interval interval : ans) {
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        }
    }
}
