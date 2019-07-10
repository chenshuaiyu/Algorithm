package LeetCode0090_Subsets_II;

import java.util.*;

public class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        dfs(nums, 0, list);
        return ans;
    }

    private void dfs(int[] nums, int i, List<Integer> list) {
        ans.add(new ArrayList<>(list));
        for (int j = i; j < nums.length; j++) {
            if (j != i && nums[j] == nums[j - 1])
                continue;
            list.add(nums[j]);
            dfs(nums, j + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.subsetsWithDup(new int[]{1, 2, 2});
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
