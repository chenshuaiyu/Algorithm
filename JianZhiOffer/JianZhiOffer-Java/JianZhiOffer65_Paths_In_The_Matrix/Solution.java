package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer65_Paths_In_The_Matrix;

public class Solution {
    private int[] visited;
    private boolean ans = false;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        visited = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == str[0] && !ans) {
                helper(i, matrix, rows, cols, str, 0);
            }
        }
        return ans;
    }

    private void helper(int i, char[] matrix, int rows, int cols, char[] str, int index) {
        if (i < 0 || i >= matrix.length || visited[i] == 1 || matrix[i] != str[index] || ans)
            return;
        if (index == str.length - 1) {
            ans = true;
            return;
        }
        visited[i] = 1;
        helper(i - 1, matrix, rows, cols, str, index + 1);
        helper(i + 1, matrix, rows, cols, str, index + 1);
        helper(i - cols, matrix, rows, cols, str, index + 1);
        helper(i + cols, matrix, rows, cols, str, index + 1);
        visited[i] = 0;
    }
}
