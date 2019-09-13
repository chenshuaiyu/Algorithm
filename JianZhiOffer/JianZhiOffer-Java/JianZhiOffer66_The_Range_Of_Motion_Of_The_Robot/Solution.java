package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer66_The_Range_Of_Motion_Of_The_Robot;

public class Solution {
    private int ans = 0;
    private int[][] visited;

    public int movingCount(int threshold, int rows, int cols) {
        visited = new int[rows][cols];
        helper(0, 0, threshold, rows, cols);
        return ans;
    }

    private void helper(int x, int y, int threshold, int rows, int cols) {
        if (x < 0 || x >= rows || y < 0 || y >= cols || sum(x) + sum(y) > threshold || visited[x][y] == 1)
            return;
        ans++;
        visited[x][y] = 1;
        helper(x - 1, y, threshold, rows, cols);
        helper(x + 1, y, threshold, rows, cols);
        helper(x, y - 1, threshold, rows, cols);
        helper(x, y + 1, threshold, rows, cols);
    }

    private int sum(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}
