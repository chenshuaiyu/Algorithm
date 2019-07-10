package LeetCode0930_Binary_Subarrays_With_Sum;

public class Solution {
    //效率高，难以理解
    public int numSubarraysWithSum(int[] A, int S) {
        int[] sumCnt = new int[A.length + 1];
        int sCnt = 0, preSum = 0;
        sumCnt[0] = 1;
        for (int a : A) {
            preSum += a;
            if (preSum >= S) sCnt += sumCnt[preSum - S];
            sumCnt[preSum]++;
        }
        return sCnt;
    }

    public int numSubarraysWithSum1(int[] A, int S) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum > S)
                    break;
                if (sum == S)
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2);
        System.out.println(ans);
    }
}
