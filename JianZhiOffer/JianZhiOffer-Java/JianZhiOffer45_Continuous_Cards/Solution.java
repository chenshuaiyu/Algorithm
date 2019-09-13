package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer45_Continuous_Cards;

import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length != 5) return false;
        int len = numbers.length;
        int zero = 0; //记录大小王的张数
        int need = 0; //记录需要的大小王的张数
        Arrays.sort(numbers);
        for (int i = 0; i < len; i++) {
            if (numbers[i] == 0)
                zero++;
            else if (i + 1 < len) {
                if (numbers[i] == numbers[i + 1])
                    return false;
                need += numbers[i + 1] - numbers[i] - 1;
            }
        }
        return zero >= need;
    }
}
