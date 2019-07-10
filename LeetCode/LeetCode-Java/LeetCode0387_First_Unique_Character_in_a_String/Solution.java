package LeetCode0387_First_Unique_Character_in_a_String;

import java.util.HashMap;

public class Solution {
    public int firstUniqChar(String s) {
        int ans = s.length();
        for (int i = 'a'; i <= 'z'; i++) {
            int index = s.indexOf(i);
            if (index != -1 && index == s.lastIndexOf(i))
                ans = Math.min(ans, index);
        }
        return ans == s.length() ? -1 : ans;
    }

    public int firstUniqChar1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            Integer integer = map.get(c);
            if (integer == null)
                map.put(c, 1);
            else
                map.put(c, integer + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.firstUniqChar("loveleetcode");
        System.out.println(ans);
    }
}
