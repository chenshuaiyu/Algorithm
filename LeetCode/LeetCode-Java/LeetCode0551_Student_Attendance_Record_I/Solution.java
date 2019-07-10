package LeetCode0551_Student_Attendance_Record_I;

public class Solution {
    public boolean checkRecord(String s) {
        boolean flag = false;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = array[i];
            if (c == 'A' && flag) return false;
            if (c == 'A') flag = true;
            if (c == 'L' && i > 0 && i < s.length() - 1 && array[i - 1] == 'L' && array[i + 1] == 'L') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.checkRecord("LLPPPLL");
        System.out.println(ans);
    }
}
