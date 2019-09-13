package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer44_Reverse_Words_in_Sentence;

import java.util.Arrays;

public class Solution {
    public String ReverseSentence(String str) {
        if (str == null || str.length() <= 0)
            return str;
        String[] arr = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            ans.append(arr[i] + " ");
        }
        if (ans.length() > 0)
            return ans.subSequence(0, ans.length() - 1).toString();
        else
            return str;
    }

    public String ReverseSentence1(String str) {
        if (str == null || str.length() == 0)
            return str;
        String[] arr = str.split(" ");
        if (arr.length <= 1) return str;
        int l = 0, r = arr.length - 1;
        while (l < r) {
            String s = arr[l];
            arr[l++] = arr[r];
            arr[r--] = s;
        }
        return Arrays.stream(arr)
                .reduce((str1, str2) -> str1 + " " + str2)
                .get();
    }
}
