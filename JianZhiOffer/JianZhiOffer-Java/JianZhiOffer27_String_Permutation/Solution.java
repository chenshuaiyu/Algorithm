package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer27_String_Permutation;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> ans = new ArrayList<>();
        if (str == null || str.length() == 0) return ans;
        helper(str.toCharArray(), 0, ans);
        Collections.sort(ans);
        return ans;
    }

    //使用递归
    private void helper(char[] chars, int i, ArrayList<String> ans) {
        if (i == chars.length - 1) {
            String s = String.valueOf(chars);
            if (!ans.contains(s))
                ans.add(s);
        } else {
            for (int j = i; j < chars.length; j++) {
                swap(chars, i, j);
                helper(chars, i + 1, ans);
                swap(chars, i, j);
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }
}
