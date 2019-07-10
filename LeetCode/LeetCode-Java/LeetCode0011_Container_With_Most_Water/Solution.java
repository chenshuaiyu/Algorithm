package LeetCode0011_Container_With_Most_Water;

public class Solution {
    public int maxArea(int[] height) {
        int max = 0, l = 0, r = height.length - 1, cur = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                cur = height[l] * (r - l);
                l++;
            } else {
                cur = height[r] * (r - l);
                r--;
            }
            max = Math.max(max, cur);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(ans);
    }
}
