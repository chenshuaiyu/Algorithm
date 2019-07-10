package LeetCode0258_Add_Digits;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/9 18:09
 */
public class Solution {
    public int addDigits(int num) {
        if (num < 10) return num;
        int n = num % 9;
        if (n == 0)
            return 9;
        else
            return n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.addDigits(38);
        System.out.println(ans);
    }
}
