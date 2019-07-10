package LeetCode0860_Lemonade_Change;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/21 21:39
 */
public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int i : bills) {
            if (i == 5) {
                five++;
            } else if (i == 10) {
                if (five >= 1) {
                    ten++;
                    five--;
                } else
                    return false;
            } else {
                // 一张5美元和一张10美元 优先于 三张5美元
                if (five >= 1 && ten >= 1) {
                    five--;
                    ten--;
                } else if (five >= 3)
                    five -= 3;
                else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.lemonadeChange(new int[]{5, 5, 10, 10, 20});
        System.out.println(ans);
    }
}
