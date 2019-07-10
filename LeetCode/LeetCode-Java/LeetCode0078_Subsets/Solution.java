package LeetCode0078_Subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        dfs(nums, 0, list);
        return ans;
    }

    private void dfs(int[] nums, int i, List<Integer> list) {
        ans.add(new ArrayList<>(list));
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            dfs(nums, j + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.subsets(new int[]{1, 2, 3});
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
