package LeetCode0867_Transpose_Matrix;

import java.util.Arrays;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/19 22:51
 */
public class Solution {
    public int[][] transpose(int[][] A) {
        int[][] ans = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                ans[j][i] = A[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ans = solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (int[] a :ans) {
            System.out.println(Arrays.toString(a));
        }
    }
}
