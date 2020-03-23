package LeetCode.LeetCode_Java.LeetCode0191_Number_of_1_Bits;

public class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            n &= n - 1;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.hammingWeight(00000000000000000000000000001011);
        System.out.println(ans);
    }
}
