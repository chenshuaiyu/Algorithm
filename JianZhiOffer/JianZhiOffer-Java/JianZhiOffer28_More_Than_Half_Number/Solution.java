package JianZhiOffer28_More_Than_Half_Number;

public class Solution {
    public int MoreThanHalfNum_Solution(int[] array) {
        int len = array.length;
        if (array == null || len == 0) return 0;
        int num = array[0], count = 1;
        for (int i = 1; i < len; i++) {
            if (array[i] == num) count++;
            else count--;
            if (count == 0) {
                num = array[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < len; i++) {
            if (num == array[i]) count++;
        }
        if (count * 2 > len)
            return num;
        return 0;
    }
}
