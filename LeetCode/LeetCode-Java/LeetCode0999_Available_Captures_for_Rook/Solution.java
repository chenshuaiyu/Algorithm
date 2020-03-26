package LeetCode.LeetCode_Java.LeetCode0999_Available_Captures_for_Rook;

public class Solution {
    public int numRookCaptures(char[][] board) {
        if (board == null || board.length == 0)
            return 0;
        int i, j = 0;
        a:
        for (i = 0; i < 8; i++) {
            b:
            for (j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    break a;
                }
            }
        }
        int[] x = {0, 0, -1, 1};
        int[] y = {1, -1, 0, 0};
        int ans = 0;
        for (int k = 0; k < 4; k++) {
            int i1 = i + x[k], j1 = j + y[k];
            while (true) {
                if (i1 < 0 || i1 >= 8 || j1 < 0 || j1 >= 8 || board[i1][j1] == 'B')
                    break;
                if (board[i1][j1] == 'p') {
                    ans++;
                    break;
                }
                i1 += x[k];
                j1 += y[k];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.numRookCaptures(new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', 'R', '.', '.', '.', 'p'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}});
        System.out.println(ans);
    }
}
