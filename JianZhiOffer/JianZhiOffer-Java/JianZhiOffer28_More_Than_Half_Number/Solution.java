package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer28_More_Than_Half_Number;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int len = array.length;
        int num = array[0], count = 1;
        for (int i = 1; i < len; i++) {
            if (array[i] == num)
                count++;
            else
                count--;
            if (count == 0) {
                num = array[i];
                count = 1;
            }
        }
        count = 0;
        for (int i1 : array) {
            if (num == i1) count++;
        }
        if (count * 2 > len)
            return num;
        return 0;
    }

    //借助HashMap记录
    public int MoreThanHalfNum_Solution1(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : array) {
            int num = map.getOrDefault(a, 0) + 1;
            if (num > array.length / 2)
                return a;
            map.put(a, num);
        }
        return 0;
    }
}
