package LeetCode0120_Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/23 20:58
 */
public class Solution {
    // 从下到上
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                triangle.get(i).set(j, Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)) + triangle.get(i).get(j));
            }
        }
        return triangle.get(0).get(0);
    }

    // 从上到下，效率低
    public int minimumTotal1(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0)
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                else if (j == triangle.get(i).size() - 1)
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                else
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
            }
        }
        int lastRow = triangle.size() - 1;
        int ans = dp[lastRow][0];
        for (int i = 0; i < triangle.get(lastRow).size(); i++) {
            ans = Math.min(ans, dp[lastRow][i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(6, 5, 7));
        list.add(Arrays.asList(4, 1, 8, 3));
        int ans = solution.minimumTotal(list);
        System.out.println(ans);
    }
}
