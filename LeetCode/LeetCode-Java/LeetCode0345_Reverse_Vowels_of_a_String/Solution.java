package LeetCode0345_Reverse_Vowels_of_a_String;

public class Solution {
    //元音字母 a e i o u
    public String reverseVowels(String s) {
        int[] index = new int[s.length()];
        int p = 0;

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                index[p++] = i;
            }
        }
        char t;
        for (int i = 0; i < p / 2; i++) {
            t = arr[index[i]];
            arr[index[i]] = arr[index[p - 1 - i]];
            arr[index[p - 1 - i]] = t;
        }

        return String.valueOf(arr);
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.reverseVowels("leetcode");
        System.out.println(ans);
    }
}
