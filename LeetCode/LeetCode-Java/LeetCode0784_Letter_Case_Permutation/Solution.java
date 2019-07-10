package LeetCode0784_Letter_Case_Permutation;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> letterCasePermutation(String S) {
        dfs(S.toCharArray(), -1);
        return ans;
    }

    private void dfs(char[] s, int index) {
        if (index + 1 == s.length) {
            ans.add(String.valueOf(s));
            return;
        }
        char c = s[index + 1];
        if (c >= 'a' && c <= 'z') {
            s[index + 1] = (char) (c + 'A' - 'a');
            dfs(s, index + 1);
        } else if (c >= 'A' && c <= 'Z') {
            s[index + 1] = (char) (c + 'a' - 'A');
            dfs(s, index + 1);
        }
        s[index + 1] = c;
        dfs(s, index + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> ans = solution.letterCasePermutation("a1b2");
        System.out.println(ans);
    }
}
