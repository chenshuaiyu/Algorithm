package LeetCode0434_Number_of_Segments_in_a_String;

public class Solution {
    public int countSegments(String s) {
        if (s == null || s.length() == 0) return 0;
        int ans = 0;
        boolean f = s.charAt(0) == ' ';
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (!f) {
                    ans++;
                    f = true;
                }
            } else {
                f = false;
            }
        }
        if (!f) ans++;
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.countSegments("Hello, my name is John");
        System.out.println(ans);
    }
}
