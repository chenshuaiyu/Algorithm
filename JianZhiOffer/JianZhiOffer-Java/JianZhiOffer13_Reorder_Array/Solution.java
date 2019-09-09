package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer13_Reorder_Array;

public class Solution {
    public void reOrderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //奇数
            if ((array[i] & 1) == 1) {
                int t = array[i];
                int j;
                //向前寻找上一个奇数
                for (j = i; j - 1 >= 0 && (array[j - 1] & 1) == 0; j--) {
                    array[j] = array[j - 1];
                }
                array[j] = t;
            }
        }
    }
}
