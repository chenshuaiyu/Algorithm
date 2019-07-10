package LeetCode0006_ZigZag_Conversion;

import java.util.ArrayList;
import java.util.List;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/16 11:10
 */
public class Solution {
    // 以行为单位
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            list.add(new StringBuilder());
        }
        boolean goDown = false;
        int row = 0;
        for (char c : s.toCharArray()) {
            list.get(row).append(c);
            if (row == 0 || row == numRows - 1)
                goDown = !goDown;
            row += goDown ? 1 : -1 ;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb: list) {
            ans.append(sb);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.convert("PAYPALISHIRING", 3);
        System.out.println(ans);
    }
}
