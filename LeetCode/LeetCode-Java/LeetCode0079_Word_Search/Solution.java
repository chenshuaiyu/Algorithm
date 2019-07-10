package LeetCode0079_Word_Search;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/25 15:12
 */
public class Solution {
    private boolean ans = false;
    int[][] v;
    int[] X = new int[]{0, 0, -1, 1};
    int[] Y = new int[]{-1, 1, 0, 0};

    public boolean exist(char[][] board, String word) {
        if (board == null) return false;
        v = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!ans) {
                    if (board[i][j] == word.charAt(0)) {
                        dfs(board, word, i, j, 0);
                    }
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] board, String word, int x, int y, int count) {
        if (x < 0 || x >= board.length) return;
        if (y < 0 || y >= board[0].length) return;
        if (v[x][y] == 1) return;
        if (word.charAt(count) != board[x][y]) return;

        if (count == word.length() - 1) {
            ans = true;
            return;
        }

        for (int i = 0; i < 4; i++) {
            v[x][y] = 1;
            dfs(board, word, x + X[i], y + Y[i], count + 1);
            if (ans)
                return;
            v[x][y] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.exist(new char[][]{{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'},{'A', 'D', 'E', 'E'}},"ABCCED");
        System.out.println(ans);
    }
}
