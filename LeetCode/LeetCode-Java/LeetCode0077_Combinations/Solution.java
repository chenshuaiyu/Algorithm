package LeetCode0077_Combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(0, n, k, new ArrayList<>());
        return res;
    }

    private void dfs(int i, int n, int k, ArrayList<Integer> list) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int j = i + 1; j <= n; j++) {
            list.add(j);
            dfs(j, n, k, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.combine(4, 2);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
