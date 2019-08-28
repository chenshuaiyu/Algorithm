package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer01_Find_in_Partially_Sorted_Matrix;

public class Solution {
    public boolean Find(int target, int[][] array) {
        int row = 0, col = array[0].length - 1;
        while (col >= 0 && row < array.length && array[row][col] != target) {
            if (array[row][col] > target)
                col--;
            else
                row++;
        }
        return col >= 0 && row < array.length;
    }
}
