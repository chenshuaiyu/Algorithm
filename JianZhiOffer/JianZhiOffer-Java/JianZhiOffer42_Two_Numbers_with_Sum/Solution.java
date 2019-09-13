package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer42_Two_Numbers_with_Sum;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> ans = new ArrayList<>();
        int l = 0, r = array.length - 1;
        while (l < r) {
            if (array[l] + array[r] == sum) {
                //间隔最大，乘积最小
                ans.add(array[l]);
                ans.add(array[r]);
                break;
            }
            while (l < r && array[l] + array[r] > sum) r--;
            while (l < r && array[l] + array[r] < sum) l++;
        }
        return ans;
    }
}
