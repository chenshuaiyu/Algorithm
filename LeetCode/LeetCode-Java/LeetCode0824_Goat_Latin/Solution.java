package LeetCode0824_Goat_Latin;


public class Solution {
    public String toGoatLatin(String S) {
        StringBuilder ans = new StringBuilder();
        String[] strings = S.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            char c = s.charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                ans.append(s + "ma");
            else
                ans.append(s.substring(1) + c + "ma");
            for (int j = 0; j <= i; j++) {
                ans.append('a');
            }
            ans.append(" ");
        }
        return ans.deleteCharAt(ans.length() - 1).toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String ans = solution.toGoatLatin("I speak Goat Latin");
        System.out.println(ans);
        System.out.println(ans.equals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa"));
    }
}
