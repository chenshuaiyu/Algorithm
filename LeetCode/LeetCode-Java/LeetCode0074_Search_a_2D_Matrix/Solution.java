package LeetCode0074_Search_a_2D_Matrix;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/29 7:25
 */
public class Solution {
    // 两次二分
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        if (matrix[0] == null || matrix[0].length == 0)
            return false;

        int l = 0, r = matrix.length - 1, mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (matrix[mid][0] == target)
                return true;
            else if (matrix[mid][0] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        int targetRow = (l + r) / 2;
        System.out.println(targetRow);
        l = 0;
        r = matrix[0].length - 1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (matrix[targetRow][mid] == target)
                return true;
            else if (matrix[targetRow][mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        if (matrix[0] == null || matrix[0].length == 0)
            return false;
        int lastRol = matrix[0].length - 1;
        int i;
        for (i = 0; i < matrix.length; i++) {
            if (matrix[i][lastRol] == target) {
                return true;
            } else if (matrix[i][lastRol] > target)
                break;
        }
        if (i == matrix.length)
            return false;
        int l = 0, r = matrix[0].length - 1, mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (matrix[i][mid] == target)
                return true;
            else if (matrix[i][mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 30);
        System.out.println(ans);
    }
}
