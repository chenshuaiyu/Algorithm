package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer43_Left_Rotate_String;

public class Solution {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0) return str;
        int len = str.length();
        n %= len;
        StringBuilder ans = new StringBuilder();
        ans.append(str, n, len);
        ans.append(str, 0, n);
        return ans.toString();
    }

    public String LeftRotateString1(String str, int n) {
        if (str == null || str.length() == 0) return str;
        int len = str.length();
        n %= len;
        str += str;
        return str.substring(n, n + len);
    }
}
