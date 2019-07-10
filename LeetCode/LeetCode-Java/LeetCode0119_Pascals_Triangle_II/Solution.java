package LeetCode0119_Pascals_Triangle_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            int size = ans.size();
            for (int j = size; j >= 1; j--) {
                if (j != size)
                    ans.set(j, ans.get(j - 1) + ans.get(j));
                else
                    ans.add(1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> ans = solution.getRow(3);
        System.out.println(ans);
    }
}
