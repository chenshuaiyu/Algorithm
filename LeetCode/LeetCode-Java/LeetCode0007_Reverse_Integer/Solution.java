package LeetCode0007_Reverse_Integer;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/16 22:05
 */
public class Solution {
    public int reverse(int x) {
        if (x == 0) return x;
        int reverse = 0;
        int n = x;
        while (n != 0) {
            if ((reverse > (double)Integer.MAX_VALUE / 10) || ((reverse == (double)Integer.MAX_VALUE / 10) && n > Integer.MAX_VALUE % 10))
                return 0;
            if ((reverse < (double)Integer.MIN_VALUE / 10) || ((reverse == (double)Integer.MIN_VALUE / 10) && n < Integer.MIN_VALUE % 10))
                return 0;
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }
        return reverse;
    }

    public int reverse1(int x) {
        if (x == 0)
            return x;
        StringBuilder sb = new StringBuilder(Math.abs(x) + "");
        sb.reverse();
        String s = sb.toString();
        int ans = 0;
        try {
            if (x < 0)
                s = "-" + s;
            ans = Integer.parseInt(s);
        } catch (Exception e) {
            ans = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.reverse(1463847412);
        System.out.println(ans);
    }
}
