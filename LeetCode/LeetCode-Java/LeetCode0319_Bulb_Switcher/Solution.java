package LeetCode0319_Bulb_Switcher;

public class Solution {
    public int bulbSwitch(int n) {
        //完全平方数肯定是亮的
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.bulbSwitch(3);
        System.out.println(ans);
    }
}
