package LeetCode0747_Largest_Number_At_Least_Twice_of_Others;


public class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0], index = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n > max){
                max = n;
                index = i;
            }
        }
        for (int i : nums) {
            if (i != max && i * 2 > max)
                return -1;
        }

        return index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.dominantIndex(new int[]{3, 6, 1, 0});
        System.out.println(ans);
    }
}
