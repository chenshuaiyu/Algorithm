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

    //递归实现
    public int Fibonacci1(int n) {
        if (n <= 1) return n;
        return Fibonacci1(n - 1) + Fibonacci1(n - 2);
    }
}
