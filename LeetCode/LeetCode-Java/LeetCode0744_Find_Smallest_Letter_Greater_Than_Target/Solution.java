package LeetCode0744_Find_Smallest_Letter_Greater_Than_Target;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return method2(letters, target);
    }

    //二分，速度较快
    private char method2(char[] letters, char target) {
        int l = 0, r = letters.length - 1, mid;
        while (l < r) {
            mid = (l + r) / 2;
            char c = letters[mid];
            if (target >= c) l = mid + 1;
            else r = mid - 1;
        }
        if (letters[l] <= target) return letters[(l + 1) % letters.length];
        return letters[l];
    }

    //遍历
    private char method1(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            char c = letters[i];
            if (c > target)
                return c;
        }
        return letters[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char ans = solution.nextGreatestLetter(new char[]{'a', 'c', 'e', 'g', 'i'}, 'k');
        System.out.println(ans);
    }
}
