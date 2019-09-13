package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer41_Continues_Sequence_with_Sum;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int l = 1, r = 2;
        while (l < r) {
            //(首项 + 末项) * 项数 / 2
            int n = (l + r) * (r - l + 1) / 2;
            if (n == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = l; i <= r; i++)
                    list.add(i);
                ans.add(list);
                l++;
            } else if (n < sum) {
                r++;
            } else {
                l++;
            }
        }
        return ans;
    }
}
