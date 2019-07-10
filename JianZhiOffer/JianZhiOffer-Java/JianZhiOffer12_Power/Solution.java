package JianZhiOffer12_Power;

public class Solution {
    public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double Power1(double base, int exponent) {
        double ans = 1;
        boolean flag = false;
        if (exponent == 0)
            return 1;
        else if (exponent < 0) {
            exponent = -exponent;
            flag = true;
        }
        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                exponent--;
                ans *= base;
            }
            exponent >>= 1;
            base *= base;
        }
        return flag ? 1 / ans : ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        double v = solution.Power1(10, 5);
        System.out.println(v);
    }
}
