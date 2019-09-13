package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer31_Number_of_1;

public class Solution {
    //未理解
    public int NumberOf1Between1AndN_Solution(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i;
            int b = n % i;
            ans += (a + 8) / 10 * i + ((a % 10 == 1) ? 1 : 0) * (b + 1);
        }
        return ans;
    }
}
