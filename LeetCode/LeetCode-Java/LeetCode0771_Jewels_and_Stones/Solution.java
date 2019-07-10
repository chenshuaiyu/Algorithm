package LeetCode0771_Jewels_and_Stones;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        int ans = 0;
        int[] have = new int[58];
        for (char c : J.toCharArray()) {
            have[c - 'A'] = 1;
        }
        for (char c : S.toCharArray()) {
            if (have[c - 'A'] == 1){
                ans++;
            }
        }
        return ans;
    }

    public int numJewelsInStones1(String J, String S) {
        char[] s = S.toCharArray();
        int ans = 0;
        for (char c : s) {
            if (J.contains(c + "")){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.numJewelsInStones("z", "ZZ");
        System.out.println(ans);
    }
}
