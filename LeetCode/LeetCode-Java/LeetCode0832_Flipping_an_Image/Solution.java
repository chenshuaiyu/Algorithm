package LeetCode0832_Flipping_an_Image;

import java.util.Arrays;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A[0].length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < (len + 1) / 2; j++) {
                int tmp = A[i][j] ^ 1;
                A[i][j] = A[i][len - 1 - j] ^ 1;
                A[i][len - 1 - j] = tmp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        for (int[] i : ints) {
            System.out.println(Arrays.toString(i));
        }
        int[][] ans = solution.flipAndInvertImage(ints);
        for (int[] i : ans) {
            System.out.println(Arrays.toString(i));
        }
    }
}
