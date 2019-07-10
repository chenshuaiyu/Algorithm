package LeetCode0821_Shortest_Distance_to_a_Character;

import java.util.Arrays;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/17 22:59
 */
public class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        int[] i = new int[S.length()];
        int p = 0;
        char[] arr = S.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == C) {
                i[p++] = j;
            }
        }
        int cur = 0;
        for (int j = 0; j < S.length(); j++) {
            if (j <= i[0])
                ans[j] = i[cur] - j;
            else if (j >= i[p - 1])
                ans[j] = j - i[p - 1];
            else {
                if (j <= i[cur] || j >= i[cur + 1])
                    cur++;
                ans[j] = Math.min(j - i[cur], i[cur + 1] - j);
            }
        }
        return ans;
    }

    public int[] shortestToChar1(String S, char C) {
        int[] ans = new int[S.length()];
        char[] str = S.toCharArray();
        int pre = Integer.MIN_VALUE + 10005;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == C) pre = i;
            ans[i] = i - pre;
        }

        pre = Integer.MAX_VALUE - 10005;
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] == C) pre = i;
            ans[i] = Math.min(ans[i], pre - i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.shortestToChar("loveleetcode", 'e');
        System.out.println(Arrays.toString(ans));
    }
}
