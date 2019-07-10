package LeetCode0118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/30 11:46
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) return ans;

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0)
                list.add(1);
            else {
                list.add(1);
                list.add(1);
                for (int j = 1; j < i; j++)
                    list.add(j, ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.generate(5);
        for (List<Integer> list : ans) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
