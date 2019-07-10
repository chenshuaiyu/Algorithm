package LeetCode0463_Island_Perimeter;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/17 22:30
 */
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    if (i - 1 < 0 || grid[i - 1][j] == 0) ans++;
                    if (i + 1 >= row || grid[i + 1][j] == 0) ans++;
                    if (j - 1 < 0 || grid[i][j - 1] == 0) ans++;
                    if (j + 1 >= col || grid[i][j + 1] == 0) ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.islandPerimeter(new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}}
        );
        System.out.println(ans);
    }
}
