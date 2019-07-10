package LeetCode0547_Friend_Circles;

public class Solution {
    private int ans = 0;

    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                ans++;
                dfs(M, i, visited);
            }
        }
        return ans;
    }

    private void dfs(int[][] m, int i, int[] visited) {
        visited[i] = 1;
        for (int k = 0; k < m.length; k++) {
            if (m[i][k] == 1 && visited[k] == 0)
                dfs(m, k, visited);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.findCircleNum(new int[][]{
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 1, 1}
        });
        System.out.println(ans);
    }
}
