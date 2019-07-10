package LeetCode0905_Sort_Array_By_Parity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> other = new ArrayList<>();

        for (int a: A) {
            if (a % 2 == 0)
                odd.add(a);
            else
                other.add(a);
        }
        odd.addAll(other);
        for (int i = 0; i < odd.size(); i++) {
            A[i] = odd.get(i);
        }

        return A;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.sortArrayByParity(new int[]{3,1,2,4});
        System.out.println(Arrays.toString(ans));
    }
}
