package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer37_Number_of_K;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int GetNumberOfK2(int[] array, int k) {
        int l = 0, r = array.length - 1, mid;
        while (l <= r) {
            mid = (l + r) >>> 1;
            if (array[mid] > k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        int ans = 0;
        for (int i = l; i < array.length && array[i] == k; i++) {
            ans++;
        }
        for (int i = l - 1; i >= 0 && array[i] == k; i--) {
            ans++;
        }
        return ans;
    }

    public int GetNumberOfK(int[] array, int k) {
        if (array.length == 0) return 0;
        int firstk = getFirstK(array, k, 0, array.length - 1);
        int lastk = getLastK(array, k, 0, array.length - 1);
        if (firstk != -1 && lastk != -1)
            return lastk - firstk + 1;
        else
            return 0;
    }

    //递归
    private int getFirstK(int[] array, int k, int start, int end) {
        if (start > end)
            return -1;
        int mid = (start + end) >> 1;
        if (array[mid] < k)
            return getFirstK(array, k, mid + 1, end);
        else if (array[mid] > k)
            return getFirstK(array, k, start, mid - 1);
        else if (mid - 1 >= 0 && array[mid - 1] == k)
            return getFirstK(array, k, start, mid - 1);
        else
            return mid;
    }

    //循环
    private int getLastK(int[] array, int k, int start, int end) {
        int mid;
        while (start <= end) {
            mid = (start + end) >> 1;
            if (array[mid] < k)
                start = mid + 1;
            else if (array[mid] > k)
                end = mid - 1;
            else if (mid + 1 < array.length && array[mid + 1] == k)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public int GetNumberOfK1(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : array) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        return map.getOrDefault(k, 0);
    }
}
