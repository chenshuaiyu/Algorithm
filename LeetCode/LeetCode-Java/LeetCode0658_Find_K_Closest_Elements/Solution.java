package LeetCode0658_Find_K_Closest_Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - k, mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (Math.abs(arr[mid] - x) > Math.abs(arr[mid + k] - x))
                l = mid + 1;
            else
                r = mid;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = l; i < l + k; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }

    //效率低
    public List<Integer> findClosestElements1(int[] arr, int k, int x) {
        List<Integer> data = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(data, (a, b) -> a == b ? a - b : Math.abs(x - a) - Math.abs(x - b));
        System.out.println(data);
        List<Integer> ans = data.subList(0, k);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> ans = solution.findClosestElements(new int[]{0, 0, 1, 2, 3, 3, 4, 7, 7, 8}, 3, 5);
        System.out.println(ans);
    }
}
