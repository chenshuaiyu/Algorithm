package LeetCode0830_Positions_of_Large_Groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0, len = S.length();
        for (int j = 0; j < len; j++) {
            if (j == len - 1 || S.charAt(j) != S.charAt(j + 1)) {
                if (j - i + 1 >= 3)
                    ans.add(Arrays.asList(i, j));
                i = j + 1;
            }
        }
        return ans;
    }

    public List<List<Integer>> largeGroupPositions1(String S) {
        List<List<Integer>> ans = new ArrayList<>();
        int start = 0, count = 1;
        char[] arr = S.toCharArray();
        char c = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (c == arr[i]) {
                count++;
                if (count == 3)
                    ans.add(Arrays.asList(start, i));
                if (count > 3) {
                    int index = ans.size() - 1;
                    ans.get(index).set(1, ans.get(index).get(1) + 1);
                }
            } else {
                c = arr[i];
                start = i;
                count = 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.largeGroupPositions("abbxxxxzzy");
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
