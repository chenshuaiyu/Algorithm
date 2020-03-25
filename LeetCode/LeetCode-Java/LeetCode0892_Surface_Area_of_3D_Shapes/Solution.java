package LeetCode.LeetCode_Java.LeetCode0892_Surface_Area_of_3D_Shapes;

public class Solution {
    public int surfaceArea(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int count = 0;//个数
        int jian1 = 0;//单元格之间贴合的面
        int jian2 = 0;//每个单元格内部竖直贴合的面
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                count += grid[i][j];
                if (grid[i][j] != 0)
                    jian2 += (grid[i][j] - 1) * 2;
                jian1 += fun(grid, i, j, i - 1, j);
                jian1 += fun(grid, i, j, i + 1, j);
                jian1 += fun(grid, i, j, i, j - 1);
                jian1 += fun(grid, i, j, i, j - 1);
            }
        }
        return count * 6 - jian1 - jian2;
    }

    private int fun(int[][] grid, int i, int j, int i1, int j1) {
        if (i1 < 0 || i1 >= grid.length || j1 < 0 || j1 >= grid[0].length) {
            return 0;
        }
        return Math.min(grid[i][j], grid[i1][j1]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.surfaceArea(new int[][]{{1, 2}, {3, 4}});
        System.out.println(ans);
    }
}
