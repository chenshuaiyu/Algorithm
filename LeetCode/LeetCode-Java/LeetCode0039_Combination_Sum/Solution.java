package LeetCode0039_Combination_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/24 23:14
 */
public class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> list = new ArrayList<>();
            dfs(candidates, 0, i, target, list);
        }
        return ans;
    }

    private void dfs(int[] candidates, int n, int index, int target, List<Integer> list) {
        if (n + candidates[index] > target) return;
        if (n + candidates[index] == target){
            list.add(candidates[index]);
            ans.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[index]);
            dfs(candidates, n + candidates[index], i, target, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.combinationSum(new int[]{2, 3, 5}, 8);
        for (List<Integer> list : ans) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
