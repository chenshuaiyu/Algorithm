package LeetCode0050_Pow_x_n;

public class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public double myPow1(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        double ans = 1;
        long abs = Math.abs((long) n);
        while (abs != 0) {
            if ((abs & 1) == 1)
                ans *= x;
            x *= x;
            abs >>= 1;
        }
        return n < 0 ? 1 / ans : ans;
    }
}
