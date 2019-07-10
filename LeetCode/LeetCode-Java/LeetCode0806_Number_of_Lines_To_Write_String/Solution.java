package LeetCode0806_Number_of_Lines_To_Write_String;

import java.util.Arrays;

public class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int row = 0;
        int count = 0;
        for (char c : S.toCharArray()) {
            int width = widths[c - 'a'];
            if (count + width > 100) {
                row++;
                count = width;
            } else {
                count += width;
            }
        }
        if (count > 0)
            row++;
        return new int[]{row, count};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.numberOfLines(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "abcdefghijklmnopqrstuvwxyz");
        System.out.println(Arrays.toString(ans));
    }
}
