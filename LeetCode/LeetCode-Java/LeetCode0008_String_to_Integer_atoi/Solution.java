package LeetCode0008_String_to_Integer_atoi;

public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) return 0;
        StringBuilder ans = new StringBuilder();
        int symbol = 1;
        if (str.charAt(0) == '-') {
            ans.append(str.charAt(0));
            symbol = -1;
            str = str.substring(1, str.length());
        } else if (str.charAt(0) == '+') {
            ans.append(str.charAt(0));
            str = str.substring(1, str.length());
        }
        if (str.length() == 0) return 0;
        if ((str.charAt(0) < '0' || str.charAt(0) > '9'))
            return 0;
        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9')
                ans.append(c);
            else
                break;
        }
        try {
            int i = Integer.parseInt(ans.toString());
            return i;
        } catch (Exception e) {
            if (symbol > 0) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.myAtoi("  -42");
        System.out.println(ans);
    }
}
