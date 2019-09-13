package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer47_Accumulate;

public class Solution {
    public int Sum_Solution(int n) {
        int ans = n;
        //利用短路作为递归返回入口
        boolean b = ((ans > 0) && ((ans += Sum_Solution(n - 1)) > 0));
        return ans;
    }

    //使用库函数
    public int Sum_Solution1(int n) {
        return (int) (Math.pow(n, 2) + n) >> 1;
    }
}
