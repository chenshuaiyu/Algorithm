package LeetCode0709To_Lower_Case;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/12 14:18
 */
public class Solution {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.toLowerCase("Hello");
        System.out.println(ans);
    }
}
