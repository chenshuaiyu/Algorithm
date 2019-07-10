package LeetCode0009_Palindrome_Number;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/18 0:05
 */
public class Solution {
    // 反转一半数字
    public boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0))
            return false;
        if (x == 0)
            return true;
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        }
        return (x == reverse) || (x == reverse / 10);
    }

    public boolean isPalindrome1(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;
        int reverse = 0;
        int n = x;
        while (n != 0) {
            int pop = n % 10;
            n /= 10;
            reverse = reverse * 10 + pop;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.isPalindrome(10);
        System.out.println(ans);
    }
}
