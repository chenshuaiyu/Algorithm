package LeetCode0066_Plus_One;

import java.util.Arrays;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/28 13:18
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int c = 0;
        int len = digits.length;
        int t = 0;
        int i;
        for (i = len - 1; i >= 0; i--) {
            if (c == 1 || i == len - 1) {
                if (i == len - 1)
                    t = digits[i] + c + 1;
                else
                    t = digits[i] + c;
                digits[i] = t % 10;
                if (t >= 10)
                    c = 1;
                else
                    break;
            }
        }
        if (i == -1 && c == 1) {
            int[] ans = new int[len + 1];
            ans[0] = 1;
            System.arraycopy(digits,0 ,ans, 1, len);
            return ans;
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.plusOne(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(ans));
    }
}
