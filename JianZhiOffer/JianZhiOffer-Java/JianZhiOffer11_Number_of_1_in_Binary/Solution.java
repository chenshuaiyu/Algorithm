package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer11_Number_of_1_in_Binary;

public class Solution {
    public int NumberOf1(int n) {
        int flag = 1;
        int ans = 0;
        while (flag != 0) {
            if ((n & flag) != 0)
                ans++;
            flag <<= 1;
        }
        return ans;
    }

    //一个数减1后与原数做与运算，会把原数的最右边的一个1变0，原数的二进制中有多少个1，就可以做多少次这样的运算
    public int NumberOf1_1(int n) {
        int ans = 0;
        while (n != 0) {
            n = n & (n - 1);
            ans++;
        }
        return ans;
    }
}
