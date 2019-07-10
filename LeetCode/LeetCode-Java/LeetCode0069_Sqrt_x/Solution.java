package LeetCode0069_Sqrt_x;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/26 11:37
 */
public class Solution {
    public int mySqrt(int x) {
        double l = 0, r = x, mid;
        while (l < r) {
            mid = (int)(l + r) / 2;
            if (mid * mid > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return (l * l > x ? (int)(l - 1) : (int)l);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.mySqrt(1);
        System.out.println(ans);
    }
}
