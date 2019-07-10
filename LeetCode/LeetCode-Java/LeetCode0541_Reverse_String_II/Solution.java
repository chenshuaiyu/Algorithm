package LeetCode0541_Reverse_String_II;

public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i += 2 * k) {
            if (len - i >= k)
                reverse(arr, i, i + k - 1);
            else
                reverse(arr, i, len - 1);
        }
        return String.valueOf(arr);
    }

    private void reverse(char[] arr, int l, int r) {
        char t;
        for (int i = 0; i < (r - l + 1) / 2; i++) {
            t = arr[l + i];
            arr[l + i] = arr[r - i];
            arr[r - i] = t;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.reverseStr("abcdefg", 2);
        System.out.println(ans);
    }
}
