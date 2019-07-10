package LeetCode0125_Valid_Palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        char[] arr = s.toLowerCase().toCharArray();
        char lc;
        char rc;
        while (l < r) {
            lc = arr[l];
            rc = arr[r];

            if (!((lc >= '0' && lc <= '9') || (lc >= 'a' && lc <= 'z'))) {
                l++;
                continue;
            }
            if (!((rc >= '0' && rc <= '9') || (rc >= 'a' && rc <= 'z'))) {
                r--;
                continue;
            }
            if (lc != rc)
                return false;
            l++;
            r--;
        }
        return true;
    }

    public boolean isPalindrome1(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            //Character.isLetterOrDigit()判断是否为字母或数组
            if (Character.isLetterOrDigit(c))
                sb.append(c);
        }
        s = sb.toString();

        int len = s.length();
        String s1 = s.substring(0, len / 2).toLowerCase();
        String s2 = s.substring((len / 2) + (len % 2), len).toLowerCase();
        s2 = new StringBuilder(s2).reverse().toString();
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans);
    }
}
