package LeetCode0067_Add_Binary;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/21 17:33
 */
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
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
            i = num >= 2 ? 1 : 0;
            ans.append(num % 2);
        }
        if (i == 1) {
            ans.append(i);
        }
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.addBinary("100", "101100");
        System.out.println(ans);
    }
}
