package LeetCode0733_Flood_Fill;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor)
            dfs(image, sr, sc, color, newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sr >= image.length) return;
        if (sc < 0 || sc >= image[0].length) return;
        if (image[sr][sc] == color){
            image[sr][sc] = newColor;
            dfs(image, sr - 1, sc, color, newColor);
            dfs(image, sr + 1, sc, color, newColor);
            dfs(image, sr, sc - 1, color, newColor);
            dfs(image, sr, sc + 1, color, newColor);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ans = solution.floodFill(new int[][]{{0, 0, 0}, {0, 1, 1}}, 1, 1, 1);
        for (int[] r : ans) {
            for (int p : r) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
