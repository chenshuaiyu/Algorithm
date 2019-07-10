package LeetCode0504_Base_7;

public class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return num + "";
        StringBuilder sb = new StringBuilder();
        int t = Math.abs(num);
        while (t != 0) {
            sb.append(String.valueOf(t % 7));
            t /= 7;
        }
        if (num >= 0)
            return sb.reverse().toString();
        else
            return "-" + sb.reverse().toString();
    }

    //递归
    public String convertToBase7_1(int num) {
        if (num != 0) {
            if (num / 7 == 0)
                return String.valueOf(num % 7);
            else
                return convertToBase7_1(num / 7) + Math.abs(num % 7);
        } else
            return "0";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.convertToBase7(100);
        System.out.println(ans);
    }
}
