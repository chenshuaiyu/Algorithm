package LeetCode.LeetCode_Java.LeetCode0028_Implement_strStr;

public class Solution {
    //暴力
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        if (haystack.length() == 0 && needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;
        if (needle.length() == 0)
            return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + needle.length() <= haystack.length() &&
                        haystack.substring(i, i + needle.length()).equals(needle))
                    return i;
            }
        }
        return -1;
    }

    //KMP
    public int strStr1(String haystack, String needle) {
        return -1;
    }
}
