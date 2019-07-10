package JianZhiOffer10_Rect_Cover;

public class Solution {
    //斐波拉切数列的应用
    public int RectCover(int target) {
        if (target <= 2) return target;
        int ans = 0, n1 = 1, n2 = 2;
        for (int i = 3; i <= target; i++) {
            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }
        return ans;
    }
}
