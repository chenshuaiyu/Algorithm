package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer07_Fibonacci;

public class Solution {
    public int Fibonacci(int n) {
        if (n <= 1) return n;
        int ans = 0, n1 = 0, n2 = 1;
        for (int i = 2; i <= n; i++) {
            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }
        return ans;
    }
}
