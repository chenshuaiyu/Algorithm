package LeetCode0922_Sort_Array_By_Parity_II;

import java.util.Arrays;

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int p1 = 0, p2 = 1;
        for (; p1 < A.length; p1 += 2) {
            if ((A[p1] & 1) == 1){
                while (p2 < A.length && (A[p2] & 1) == 1 ) {
                    p2 += 2;
                }
                int t = A[p1];
                A[p1] = A[p2];
                A[p2] = t;
            }
        }
        return A;
    }

    public int[] sortArrayByParityII1(int[] A) {
        int[] ans = new int[A.length];
        int p1 = 0, p2 = 1;
        for (int n : A) {
            if ((n & 1) == 0) {
                ans[p1] = n;
                p1 += 2;
            } else {
                ans[p2] = n;
                p2 += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.sortArrayByParityII(new int[]{4, 2, 5, 7});
        System.out.println(Arrays.toString(ans));
    }
}
