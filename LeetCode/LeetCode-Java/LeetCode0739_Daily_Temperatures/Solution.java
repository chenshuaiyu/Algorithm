package LeetCode0739_Daily_Temperatures;

import java.util.Arrays;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/27 15:56
 */
public class Solution {
    //从后往前进行判断
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] ans = new int[len];
        ans[len - 1] = 0;
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j += ans[j]) {
                if (T[i] < T[j]) {
                    ans[i] = j - i;
                    break;
                } else if (ans[j] == 0){
                    ans[i] = 0;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(ans));
    }
}
