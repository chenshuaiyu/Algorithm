package LeetCode0168_Excel_Sheet_Column_Title;

import java.util.ArrayList;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/21 17:03
 */
public class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while (n != 0) {
            int t = (n - 1) % 26;
            s = (char) ('A' + t) + s;
            n = (n - 1) / 26;
        }
        return s;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.convertToTitle(28);
        System.out.println(ans);
    }
}
