package JianZhiOffer44_Reverse_Words_in_Sentence;

public class Solution {
    public String ReverseSentence(String str) {
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
}
