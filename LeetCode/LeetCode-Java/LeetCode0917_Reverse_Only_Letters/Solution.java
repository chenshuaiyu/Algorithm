package LeetCode0917_Reverse_Only_Letters;

import java.util.LinkedList;

public class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        StringBuilder ans = new StringBuilder();
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (!isLetters(arr[i]))
                ans.appendCodePoint(arr[i]);
            else {
                while (!isLetters(arr[j]))
                    j--;
                ans.appendCodePoint(arr[j--]);
            }
        }
        return ans.toString();
    }

    //使用栈
    public String reverseOnlyLetters1(String S) {
        LinkedList<Character> stack = new LinkedList<>();
        char[] arr = S.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (isLetters(arr[i]))
                stack.addFirst(arr[i]);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!isLetters(arr[i]))
                ans.appendCodePoint(arr[i]);
            else
                ans.appendCodePoint(stack.pollFirst());
        }
        return ans.toString();
    }

    private boolean isLetters(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.reverseOnlyLetters("ab-cd");
        System.out.println(ans);
    }
}
