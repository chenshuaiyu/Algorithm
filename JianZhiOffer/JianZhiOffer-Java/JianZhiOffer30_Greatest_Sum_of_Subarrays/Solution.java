package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer30_Greatest_Sum_of_Subarrays;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) return 0;
        int ans = array[0], sum = 0;
        for (int n : array) {
            if (sum > 0)
                sum += n;
            else
                sum = n;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
