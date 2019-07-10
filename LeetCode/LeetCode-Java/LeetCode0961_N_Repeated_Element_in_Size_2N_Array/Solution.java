package LeetCode0961_N_Repeated_Element_in_Size_2N_Array;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            if (set.contains(a))
                return a;
            set.add(a);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.repeatedNTimes(new int[]{1, 2, 3, 3});
        System.out.println(ans);
    }
}
