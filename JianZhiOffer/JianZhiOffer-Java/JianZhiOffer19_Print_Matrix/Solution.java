package JianZhiOffer19_Print_Matrix;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;
        if (matrix[0] == null || matrix[0].length == 0) return ans;

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int n = 1;
        while (top <= bottom && left <= right) {
            switch (n) {
                case 1:
                    for (int i = left; i <= right; i++) {
                        ans.add(matrix[top][i]);
                    }
                    n = 2;
                    top++;
                    break;
                case 2:
                    for (int i = top; i <= bottom; i++) {
                        ans.add(matrix[i][right]);
                    }
                    n = 3;
                    right--;
                    break;
                case 3:
                    for (int i = right; i >= left; i--) {
                        ans.add(matrix[bottom][i]);
                    }
                    n = 4;
                    bottom--;
                    break;
                case 4:
                    for (int i = bottom; i >= top; i--) {
                        ans.add(matrix[i][left]);
                    }
                    n = 1;
                    left++;
                    break;
                default:
                    break;
            }
        }
        return ans;
    }
}
