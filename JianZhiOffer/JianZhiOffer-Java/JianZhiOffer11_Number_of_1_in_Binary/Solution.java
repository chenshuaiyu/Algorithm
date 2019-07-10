package JianZhiOffer11_Number_of_1_in_Binary;

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
}
