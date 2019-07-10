package LeetCode0455_Assign_Cookies;

import java.util.Arrays;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/27 16:45
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int ans = 0;
        while (i != g.length && j != s.length) {
            if (s[j] >= g[i]) {
                i++;
                j++;
                ans++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3});
        System.out.println(ans);
    }
}
