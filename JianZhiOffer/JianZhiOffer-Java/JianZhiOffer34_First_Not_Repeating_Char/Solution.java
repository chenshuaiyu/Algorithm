package JianZhiOffer34_First_Not_Repeating_Char;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int FirstNotRepeatingChar2(String str) {
        char[] chars = new char[58];
        for (int i = 0; i < str.length(); i++)
            chars[str.charAt(i) - 'A']++;
        for (int i = 0; i < str.length(); i++) {
            if (chars[str.charAt(i) - 'A'] == 1)
                return i;
        }
        return -1;
    }

    public int FirstNotRepeatingChar1(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1)
                return i;
        }
        return -1;
    }

    public int FirstNotRepeatingChar(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (str.indexOf(arr[i]) == str.lastIndexOf(arr[i]))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println((int) ('z' - 'A'));
    }
}
