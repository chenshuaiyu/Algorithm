package LeetCode0344_Reverse_String;


public class Solution {
    public void reverseString(char[] s) {
        char t;
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            t = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = t;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        System.out.println(s);
    }
}
