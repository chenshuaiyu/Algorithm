package LeetCode0976_Largest_Perimeter_Triangle;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; i--) {
            if (A[i] + A[i + 1] > A[i + 2])
                return A[i] + A[i + 1] + A[i + 2];
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.largestPerimeter(new int[]{2, 1, 2});
        System.out.println(ans);
    }
}
