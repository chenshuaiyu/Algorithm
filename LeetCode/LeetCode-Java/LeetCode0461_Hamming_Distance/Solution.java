package LeetCode0461_Hamming_Distance;

public class Solution {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        int ans = 0;
        while (a != 0) {
            if (a % 2 == 1)
                ans++;
            a /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.hammingDistance(1, 4);
        System.out.println(ans);
    }
}
