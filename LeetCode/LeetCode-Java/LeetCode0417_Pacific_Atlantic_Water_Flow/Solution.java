package LeetCode0417_Pacific_Atlantic_Water_Flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private int[][] d = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return ans;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] pacific = new int[row][col];
        int[][] atlantic = new int[row][col];

        //从外围向内部dfs
        for (int i = 0; i < col; i++) {
            dfs(matrix, pacific, 0, i);
            dfs(matrix, atlantic, row - 1, i);
        }
        for (int i = 0; i < row; i++) {
            dfs(matrix, pacific, i, 0);
            dfs(matrix, atlantic, i, col - 1);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (pacific[i][j] == 1 && atlantic[i][j] == 1)
                    ans.add(new int[]{i, j});
            }
        }
        return ans;
    }

    private void dfs(int[][] matrix, int[][] position, int x, int y) {
        if (position[x][y] == 1)
            return;
        position[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int x1 = x + d[i][0], y1 = y + d[i][1];
            if (x1 < 0 || x1 >= matrix.length || y1 < 0 || y1 >= matrix[0].length)
                continue;
            if (matrix[x1][y1] >= matrix[x][y])
                dfs(matrix, position, x1, y1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<int[]> ans = solution.pacificAtlantic(new int[][]{
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        });
        for (int[] ints : ans) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
