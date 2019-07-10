package LeetCode0046_Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int[] visited = new int[nums.length];
        dfs(nums, visited, new ArrayList<>());
        return ans;
    }

    private void dfs(int[] nums, int[] visited, ArrayList<Integer> list) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (visited[j] == 0) {
                list.add(nums[j]);
                visited[j] = 1;
                dfs(nums, visited, list);
                visited[j] = 0;
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.permute(new int[]{1, 2, 3});
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
