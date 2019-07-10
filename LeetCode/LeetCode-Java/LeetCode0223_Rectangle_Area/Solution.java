package LeetCode0223_Rectangle_Area;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = (C - A) * (D - B) + (G - E) * (H - F);
        int h1 = Math.max(A, E);
        int h2 = Math.min(C, G);
        int h3 = Math.max(B, F);
        int h4 = Math.min(D, H);
        if (h2 <= h1 || h4 <= h3)
            return area;
        else
            return area - (h2 - h1) * (h4 - h3);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);
        System.out.println(ans);
    }
}
