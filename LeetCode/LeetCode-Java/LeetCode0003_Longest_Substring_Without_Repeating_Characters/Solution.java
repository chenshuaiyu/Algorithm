package LeetCode0003_Longest_Substring_Without_Repeating_Characters;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/13 18:38
 */
public class Solution {

    // 暴力法
    public int lengthOfLongestSubstring1(String s) {
        String subString = "";
        for (int i = 0; i < s.length(); i++) {
            String str = "" + s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (str.contains(s.charAt(j) + "")) {
                    break;
                } else {
                    str += s.charAt(j);
                }
            }
            if (str.length() > subString.length()){
                subString = str;
            }
        }
        return subString.length();
    }

    // 滑动窗口
    public int lengthOfLongestSubstring(String s) {
        String subString = "";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (!str.contains(s.charAt(i) + ""))
                str += s.charAt(i);
            else {
                str += s.charAt(i);
                int p = str.indexOf(s.charAt(i));
                str = str.substring(p + 1);
            }
            if (subString.length() < str.length()) {
                subString = str;
            }
        }
        return subString.length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = solution.lengthOfLongestSubstring("pwwkew");
        System.out.println(num);
    }
}
