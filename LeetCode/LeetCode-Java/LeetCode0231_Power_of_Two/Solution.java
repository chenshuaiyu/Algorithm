package LeetCode0231_Power_of_Two;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/5 17:47
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.isPowerOfTwo(8);
        System.out.println(ans);
    }
}
