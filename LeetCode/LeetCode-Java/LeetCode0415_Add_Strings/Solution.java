package LeetCode0415_Add_Strings;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/21 17:53
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        char[] array1 = num1.toCharArray();
        char[] array2 = num2.toCharArray();
        int p1 = array1.length - 1;
        int p2 = array2.length - 1;
        int i = 0;
        while (p1 != -1 || p2 != -1) {
            int num = 0;
            if (p1 != -1 && p2 != -1) {
                num = array1[p1] - '0' + array2[p2] - '0' + i;
                p1--;
                p2--;
            } else if (p1 != -1) {
                num = array1[p1] - '0' + i;
                p1--;
            } else if (p2 != -1) {
                num = array2[p2] - '0' + i;
                p2--;
            }
            i = num >= 10 ? 1 : 0;
            ans.append(num % 10);
        }
        if (i == 1) {
            ans.append(i);
        }
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.addStrings("123", "99998");
        System.out.println(ans);
    }
}
