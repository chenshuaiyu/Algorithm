package LeetCode0677_Map_Sum_Pairs;

import java.util.HashMap;

public class MapSum {
    private HashMap<String, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        if (map.containsKey(key))
            map.remove(key);
        map.put(key, val);
    }

    public int sum(String prefix) {
        int ans = 0;
        for (String s : map.keySet()) {
            if (s.startsWith(prefix)) {
                ans += map.get(s);
            }
        }
        return ans;
    }
}
