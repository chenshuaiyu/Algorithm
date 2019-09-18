package LeetCode.LeetCode_Java.LeetCode0003_Longest_Substring_Without_Repeating_Characters;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/13 18:38
 */
public class Solution {
    //暴力法
    public int lengthOfLongestSubstring2(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder(s.charAt(i) + "");
            for (int j = i + 1; j < s.length(); j++) {
                if (sb.indexOf(s.charAt(j) + "") != -1) {
                    break;
                } else {
                    sb.append(s.charAt(j));
                }
            }
            ans = Math.max(sb.length(), ans);
        }
        return ans;
    }

    //滑动窗口
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sb.indexOf(s.charAt(i) + "") == -1) {
                sb.append(s.charAt(i));
            } else {
                sb.append(s.charAt(i));
                sb = sb.delete(0, sb.indexOf(s.charAt(i) + "") + 1);
            }
            ans = Math.max(sb.length(), ans);
        }
        return ans;
    }

    //优化的滑动窗口
    public int lengthOfLongestSubstring1(String s) {
        int[] arr = new int[128];
        int ans = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {
            i = Math.max(arr[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            arr[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = solution.lengthOfLongestSubstring(" ");
        System.out.println(num);
    }
}
