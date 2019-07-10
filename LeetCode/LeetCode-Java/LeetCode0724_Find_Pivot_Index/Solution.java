package LeetCode0724_Find_Pivot_Index;


public class Solution {
    public int pivotIndex(int[] nums) {
        int lSum = 0, sum = 0;
        //使用Stream方式速度会降低
//        sum = Arrays.stream(nums).sum();
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (lSum == sum - lSum - nums[i])
                return i;
            lSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        System.out.println(ans);
    }
}
