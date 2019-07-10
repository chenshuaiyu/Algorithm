package JianZhiOffer33_Ugly_Number;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7) return index;
        int[] ans = new int[index];
        ans[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < index; i++) {
            ans[i] = Math.min(Math.min(ans[i2] * 2, ans[i3] * 3), ans[i5] * 5);
            if (ans[i] == ans[i2] * 2) i2++;
            if (ans[i] == ans[i3] * 3) i3++;
            if (ans[i] == ans[i5] * 5) i5++;
        }
        return ans[index - 1];
    }
}
