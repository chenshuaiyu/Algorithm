package LeetCode0977_Squares_of_a_Sorted_Array;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] ans = new int[len];
        int p = len - 1;
        int l = 0, r = len - 1;
        while (l <= r) {
            if (A[l] * A[l] > A[r] * A[r]) {
                ans[p--] = A[l] * A[l];
                l++;
            } else {
                ans[p--] = A[r] * A[r];
                r--;
            }
        }
        return ans;
    }

    public int[] sortedSquares1(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println(Arrays.toString(ans));
    }
}
