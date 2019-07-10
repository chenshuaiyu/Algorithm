package LeetCode0151_Reverse_Words_in_a_String;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        s.trim();
        String[] strings = s.split(" ");
        for (String s1 : strings) {
            if (s1.length() == 0)
                continue;
            ans.insert(0, s1 + " ");
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.reverseWords("the sky is blue");
        System.out.println(ans);
    }
}
