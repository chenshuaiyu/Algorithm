package JianZhiOffer49_String_to_Int;

public class Solution {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) return 0;
        int ans = 0;
        for (int i = ((str.charAt(0) == '+') || (str.charAt(0) == '-')) ? 1 : 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') return 0;
            ans = (ans << 1) + (ans << 3) + (c - '0');
        }
        return ans * ((str.charAt(0) == '-') ? -1 : 1);
    }
}
