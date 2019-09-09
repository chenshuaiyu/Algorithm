package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer02_Replace_Blank;

public class Solution {
    public String replaceSpace2(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        return str.toString().replaceAll(" ", "%20");
    }

    //效率高
    public String replaceSpace1(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        for (char c : str.toString().toCharArray()) {
            ans.append(c == ' ' ? "%20" : c);
        }
        return ans.toString();
    }

    public String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count++;
        }
        int i1, i2;
        i1 = str.length() - 1;
        str.setLength(str.length() + count * 2);
        i2 = str.length() - 1;
        while (i1 >= 0) {
            if (str.charAt(i1) == ' ') {
                str.setCharAt(i2--, '0');
                str.setCharAt(i2--, '2');
                str.setCharAt(i2--, '%');
            } else {
                str.setCharAt(i2--, str.charAt(i1));
            }
            i1--;
        }
        return str.toString();
    }
}
