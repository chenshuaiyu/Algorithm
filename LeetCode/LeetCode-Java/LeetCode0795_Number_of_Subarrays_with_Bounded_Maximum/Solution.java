package LeetCode0795_Number_of_Subarrays_with_Bounded_Maximum;

public class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
//        最大元素满足大于等于 L ,小于等于 R 的子数组个数 = 最大元素小于等于 R 的子数组个数 - 最大元素小于等于 L-1的子数组个数
        return getLessArray(A, R) - getLessArray(A, L - 1);
    }

    private int getLessArray(int[] A, int i) {
        int count = 0, n = 0;
        for (int a: A) {
            if (a <= i){
                n++;
                count += n;
            } else {
                n = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3);
        System.out.println(ans);
    }
}
