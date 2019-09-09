package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer12_Power;

public class Solution {
    public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double Power1(double base, int exponent) {
        double ans = 1;
        boolean flag = false;//记录指数正负
        if (exponent == 0)
            return 1;
        else if (exponent < 0) {
            exponent = -exponent;
            flag = true;
        }
        while (exponent != 0) {
            //指数最右边一位是否为1
            if ((exponent & 1) == 1) {
                exponent--;
                ans *= base;
            }
            exponent >>= 1;
            base *= base;
        }
        return flag ? 1 / ans : ans;
    }
}
