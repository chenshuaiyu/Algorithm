package LeetCode0200_Number_of_Islands;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/23 22:44
 */
public class Solution {
    int ans = 0;
    int[] x = new int[]{0, 0, -1, 1};
    int[] y = new int[]{-1, 1, 0, 0};

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int[][] v = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (v[i][j] == 0 && grid[i][j] == '1') {
                    dfs(i, j, grid, v);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(int i, int j, char[][] grid, int[][] v) {
        if (i < 0 || i >= grid.length) return;
        if (j < 0 || j >= grid[0].length) return;
        if (v[i][j] == 1 || grid[i][j] == 0) return;

        if (v[i][j] == 0 && grid[i][j] == '1') {
            v[i][j] = 1;
            for (int k = 0; k < 4; k++)
                dfs(i + x[k], j + y[k], grid, v);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.numIslands(new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}});
        System.out.println(ans);
    }
}
