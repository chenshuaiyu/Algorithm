package LeetCode0561_Array_Partition_I;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        int[] data = new int[20001];
        for (int i = 0; i < nums.length; i++) {
            data[nums[i] + 10000]++;
        }
        boolean flag = true;
        int ans = 0;
        for (int i = 0; i < data.length; i++) {
            while (data[i] > 0) {
                if (flag)
                    ans += i - 10000;
                flag = !flag;
                data[i]--;
            }
        }
        return ans;
    }

    public int arrayPairSum1(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            ans += nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.arrayPairSum(new int[]{1, 4, 3, 2});
        System.out.println(ans);
    }
}
