package LeetCode.LeetCode_Java.LeetCode0058_Length_of_Last_Word;

public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int ans = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        if (i == -1)
            return ans;
        for (int j = i; j >= 0 && s.charAt(j) != ' '; j--) {
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.lengthOfLastWord("Hello World");
        System.out.println(ans);
    }
}
