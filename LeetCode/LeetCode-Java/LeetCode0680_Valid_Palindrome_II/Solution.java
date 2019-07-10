package LeetCode0680_Valid_Palindrome_II;

public class Solution {
    //贪心算法
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        char[] arr = s.toCharArray();
        while (l < r) {
            if (arr[l] != arr[r]) {
                return isPalindrome(arr, l + 1, r) || isPalindrome(arr, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isPalindrome(char[] arr, int i, int j) {
        int l = i, r = j;
        while (l < r) {
            if (arr[l] != arr[r])
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.validPalindrome("abca");
        System.out.println(ans);
    }
}
