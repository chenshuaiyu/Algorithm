package LeetCode0836_Rectangle_Overlap;

public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int h1 = Math.max(rec1[0], rec2[0]);
        int h2 = Math.min(rec1[2], rec2[2]);
        int h3 = Math.max(rec1[1], rec2[1]);
        int h4 = Math.min(rec1[3], rec2[3]);
        if (h2 <= h1 || h4 <= h3)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3});
        System.out.println(ans);
    }
}
