package JianZhiOffer40_Numbers_Appear_Once;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (!set.contains(i))
                set.add(i);
            else
                set.remove(i);
        }
        Object[] arr = set.toArray();
        num1[0] = (int) arr[0];
        num2[0] = (int) arr[1];
    }

    public void FindNumsAppearOnce1(int[] array, int num1[], int num2[]) {
        int n = 0;
        for (int i = 0; i < array.length; i++)
            n ^= array[i];
        // n  = 两个只出现一次的数字相异或的值
        int index = 0;
        while ((n & 1) == 0) {
            n >>= 1;
            index++;
        }
        num1[0] = num2[0] = 0;
        for (int i = 0; i < array.length; i++) {
            //根据异或值的最低位1的index将其分为两个数
            if (((array[i] >> index) & 1) == 1)
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
    }
}
