package LeetCode0014_Longest_Common_Prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            int j;
            for (j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || c != strs[j].charAt(i))
                    return strs[j].substring(0, i);
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.longestCommonPrefix(new String[]{"aa", "a"});
        System.out.println(ans);
    }
}
