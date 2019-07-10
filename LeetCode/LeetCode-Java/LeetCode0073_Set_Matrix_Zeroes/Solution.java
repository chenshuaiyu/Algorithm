package LeetCode0073_Set_Matrix_Zeroes;

import java.util.HashSet;
import java.util.Set;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/7 23:12
 */
public class Solution {
    // 空间复杂度 O(M + N)
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows.contains(i) || cols.contains(j))
                    matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.setZeroes(new int[][]{
                {1, 1, 1},
                {0, 1, 2},
                {1, 1, 1}}
        );
    }
}
