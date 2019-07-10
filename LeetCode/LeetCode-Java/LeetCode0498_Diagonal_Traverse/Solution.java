package LeetCode0498_Diagonal_Traverse;

import java.util.Arrays;

public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[]{};
        int row = matrix.length, col = matrix[0].length;
        int len = row * col;
        int[] ans = new int[len];
        int p = 0;
        int i = 0, j = 0;
        boolean flag = false;
        while (p != len) {
            ans[p++] = matrix[i][j];
            if (!flag) {
                if (j == col - 1 && i == 0) {
                    flag = true;
                    i++;
                } else if (j == col - 1) {
                    flag = true;
                    i++;
                } else if (i == 0) {
                    flag = true;
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == row - 1 && j == 0) {
                    flag = false;
                    j++;
                } else if (i == row - 1) {
                    flag = false;
                    j++;
                } else if (j == 0) {
                    flag = false;
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.findDiagonalOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
        System.out.println(Arrays.toString(ans));
    }
}
