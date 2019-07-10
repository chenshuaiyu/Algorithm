package LeetCode0020_Valid_Parentheses;

import java.util.ArrayList;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/20 22:35
 */
public class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        int index;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.add(c);
                    break;
                case ')':
                    index = stack.size() - 1;
                    if (index != -1 && stack.get(index) == '(')
                        stack.remove(index);
                    else
                        return false;
                    break;
                case ']':
                    index = stack.size() - 1;
                    if (index != -1 && stack.get(index) == '[')
                        stack.remove(index);
                    else
                        return false;
                    break;
                case '}':
                    index = stack.size() - 1;
                    if (index != -1 && stack.get(index) == '{')
                        stack.remove(index);
                    else
                        return false;
                    break;
                default:
                    break;
            }
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.isValid("{[]}");
        System.out.println(ans);
    }
}
