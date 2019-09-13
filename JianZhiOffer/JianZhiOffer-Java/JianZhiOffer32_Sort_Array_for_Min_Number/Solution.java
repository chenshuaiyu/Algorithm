package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer32_Sort_Array_for_Min_Number;

import java.util.ArrayList;
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

    public String PrintMinNumber1(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            return "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : numbers) {
            list.add(n);
        }
        //自定义比较器
        list.sort((o1, o2) -> ("" + o1 + o2).compareTo("" + o2 + o1));
        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer);
        }
        return sb.toString();
    }
}
