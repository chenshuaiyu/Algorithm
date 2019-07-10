package LeetCode0599_Minimum_Index_Sum_of_Two_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        ArrayList<String> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String s1 = list2[i];
            if (map.containsKey(s1)) {
                if (i + map.get(s1) == min)
                    ans.add(s1);
                else if (i + map.get(s1) < min) {
                    ans.clear();
                    ans.add(s1);
                    min = i + map.get(s1);
                }
            }
        }
        return ans.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] ans = solution.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"});
        System.out.println(Arrays.toString(ans));
    }
}
