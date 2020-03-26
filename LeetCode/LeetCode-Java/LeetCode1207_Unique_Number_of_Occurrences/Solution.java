package LeetCode.LeetCode_Java.LeetCode1207_Unique_Number_of_Occurrences;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : map.keySet()) {
            set.add(map.get(i));
        }
        return map.size() == set.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
        System.out.println(ans);
    }
}
