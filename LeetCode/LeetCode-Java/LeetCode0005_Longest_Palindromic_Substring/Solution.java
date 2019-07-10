package LeetCode0005_Longest_Palindromic_Substring;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/13 18:38
 */
public class Solution {

    // dp
    public String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;
        int[][] dp = new int[s.length()][s.length()];
        String ans = "" + s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j + i < s.length(); j++) {
                if (i == 1 && s.charAt(j) == s.charAt(j + i)) {
                    dp[j][j + i] = 1;
                    ans = (ans.length() < i + 1) ? s.substring(j, j + i + 1) : ans;
                } else if (s.charAt(j) == s.charAt(j + i) && dp[j + 1][j + i - 1] == 1) {
                    dp[j][j + i] = 1;
                    ans = (ans.length() < i + 1) ? s.substring(j, j + i + 1) : ans;
                } else {
                    dp[j][j + i] = 0;
                }
            }
        }
        return ans;
    }

    // 中心拓展算法
    public String longestPalindrome2(String s) {
        String ans = "";
        double i = 0.0;
        int left = 0;
        int right = 0;
        for (; i <= s.length() - 1; i += 0.5) {
            if (i % 1 == 0.5) {
                left = (int) (i - 0.5);
                right = (int) (i + 0.5);
            } else
                left = right = (int) i;
            for (; left >= 0 && right <= s.length() - 1; left--, right++) {
                if (s.charAt(left) == s.charAt(right))
                    ans = (ans.length() < right - left + 1) ? s.substring(left, right + 1) : ans;
                else
                    break;
            }
        }
        return ans;
    }

    // 暴力法
    public String longestPalindrome1(String s) {
        if (s.length() <= 1)
            return s;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int left = 0;
            int right = 0;
            for (int j = s.length() - 1; j >= i + 1; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    left = i;
                    right = j;
                    for (int k = 1; k < (j - i + 1) / 2; k++) {
                        left = i + k;
                        right = j - k;
                        if ((left <= right) && (s.charAt(left) != s.charAt(right)))
                            break;
                    }
                    if (s.charAt(left) == s.charAt(right)) {
                        ans = (ans.length() < j - i + 1) ? s.substring(i, j + 1) : ans;
                        break;
                    }
                }
            }
        }
        if (ans.length() == 0) {
            ans += s.charAt(0);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.longestPalindrome("aaaa");
        System.out.println(ans);
    }
}
