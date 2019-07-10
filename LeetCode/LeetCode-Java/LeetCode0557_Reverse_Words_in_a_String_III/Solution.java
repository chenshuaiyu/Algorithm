package LeetCode0557_Reverse_Words_in_a_String_III;

public class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String s1 : strings) {
            ans.append(new StringBuilder(s1).reverse().toString() + " ");
        }
        return ans.toString().trim();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.reverseWords("Let's take LeetCode contest");
        System.out.println(ans);
    }
}
