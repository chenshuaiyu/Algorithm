package LeetCode0013_Roman_to_Integer;

public class Solution {
    public int romanToInt(String s) {
        int[] res = new int[26];
        int sum = 0;
        res['I' - 'A'] = 1;
        res['V' - 'A'] = 5;
        res['X' - 'A'] = 10;
        res['L' - 'A'] = 50;
        res['C' - 'A'] = 100;
        res['D' - 'A'] = 500;
        res['M' - 'A'] = 1000;

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'I':
                    if (i + 1 < arr.length && (arr[i + 1] == 'V' || arr[i + 1] == 'X')) {
                        sum += res[arr[i + 1] - 'A'] - res['I' - 'A'];
                        i++;
                    } else
                        sum++;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (i + 1 < arr.length && (arr[i + 1] == 'L' || arr[i + 1] == 'C')) {
                        sum += res[arr[i + 1] - 'A'] - res['X' - 'A'];
                        i++;
                    } else
                        sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (i + 1 < arr.length && (arr[i + 1] == 'D' || arr[i + 1] == 'M')) {
                        sum += res[arr[i + 1] - 'A'] - res['C' - 'A'];
                        i++;
                    } else
                        sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.romanToInt("MCMXCIV");
        System.out.println(ans);
    }
}
