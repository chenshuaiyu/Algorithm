package LeetCode0202_Happy_Number;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int t = 0;
            while (n != 0) {
                t += (n % 10) * (n % 10);
                n /= 10;
            }
            n = t;
        }
        return n == 1;
    }

    public boolean isHappy1(int n) {
        while (true) {
            if (n == 1) return true;
            if (n == 4) return false;
            int t = 0;
            while (n != 0) {
                t += (n % 10) * (n % 10);
                n /= 10;
            }
            n = t;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.isHappy(19);
        System.out.println(ans);
    }
}
