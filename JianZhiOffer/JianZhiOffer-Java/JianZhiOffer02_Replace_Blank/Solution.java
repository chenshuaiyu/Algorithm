package JianZhiOffer02_Replace_Blank;

public class Solution {
    //效率高
    public String replaceSpace(StringBuffer str) {
        StringBuilder ans = new StringBuilder();
        for (char c : str.toString().toCharArray()) {
            if (c == ' ')
                ans.append("%20");
            else
                ans.append(c);
        }
        return ans.toString();
    }

    public String replaceSpace1(StringBuffer str) {
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
                str.setCharAt(i2, str.charAt(i1));
                i2--;
            }
            i1--;
        }
        return str.toString();
    }
}
