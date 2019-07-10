package LeetCode0929_Unique_Email_Addresses;

import java.util.HashSet;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet();
        for (String e : emails) {
            set.add(get(e));
        }
        return set.size();
    }

    private String get(String e) {
        int i = e.indexOf("+");
        int i1 = e.indexOf("@");
        String s = null;
        if (i != -1)
             s = e.substring(0, i);
        else
            s = e.substring(0, i1);
        return s.replace(".", "") + e.substring(i1, e.length());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.numUniqueEmails(new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"});
        System.out.println(ans);
    }
}
