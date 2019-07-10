package JianZhiOffer32_Sort_Array_for_Min_Number;

import java.util.Arrays;

public class Solution {
    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";
        return Arrays.stream(numbers)
                .boxed()
                .map(String::valueOf)
                .sorted((str1, str2) -> (str1 + str2).compareTo(str2 + str1))
                .reduce((str1, str2) -> str1 + str2)
                .get();
    }
}
