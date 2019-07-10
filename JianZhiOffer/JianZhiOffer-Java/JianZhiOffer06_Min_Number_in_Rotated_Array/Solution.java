package JianZhiOffer06_Min_Number_in_Rotated_Array;

public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return 0;
        int l = 0, r = array.length - 1, mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (array[mid] >= array[l] && array[mid] <= array[r])
                return array[l];
            else if (array[mid] < array[l])
                r = mid;
            else
                l = mid + 1;
        }
        return array[l];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.minNumberInRotateArray(new int[]{4, 5, 1, 2, 3});
        System.out.println(ans);
    }
}
