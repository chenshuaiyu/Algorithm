package LeetCode0804_Unique_Morse_Code_Words;

import java.util.HashSet;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] t = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        HashSet<String> ans = new HashSet<>();

        for (String w : words) {
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < w.length(); i++) {
                sb.append(t[w.charAt(i) - 'a']);
            }
            ans.add(sb.toString());
        }
        return ans.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        System.out.println(ans);
    }
}
