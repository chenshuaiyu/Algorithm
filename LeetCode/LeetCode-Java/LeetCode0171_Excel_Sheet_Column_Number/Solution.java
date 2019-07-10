package LeetCode0171_Excel_Sheet_Column_Number;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/21 16:55
 */
public class Solution {
    public int titleToNumber(String s) {
        char[] array = s.toCharArray();
        int len = array.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += ((int) (array[len - i - 1] - 'A') + 1) * Math.pow(26, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.titleToNumber("ZY");
        System.out.println(ans);
    }
}
