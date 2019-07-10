package LeetCode0841_Keys_and_Rooms;

import java.util.*;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return bfs(rooms);
    }

    // BFS，时间较长
    private boolean bfs(List<List<Integer>> rooms) {
        LinkedList<Integer> queue = new LinkedList<>();
        HashSet<Integer> entry = new HashSet<>();
        queue.add(0);
        entry.add(0);
        while(!queue.isEmpty()) {
            for (Integer i: rooms.get(queue.poll())) {
                if (!entry.contains(i)) {
                    System.out.println(i);
                    entry.add(i);
                    queue.add(i);
                }
            }
        }
        return (entry.size() == rooms.size());
    }

    //普通方式 DFS，时间较短
    private int dfs1(List<List<Integer>> rooms, int i, HashSet<Integer> entry) {
        if (entry.size() == rooms.size() || entry.contains(i)) return entry.size();
        entry.add(i);
        for (Integer integer: rooms.get(i)) {
            dfs1(rooms, integer, entry);
        }
        return entry.size();
    }


    //使用 Stream 方式 DFS，时间较长
    private int dfs(List<List<Integer>> rooms, int i, HashSet<Integer> entry) {
        entry.add(i);
        rooms.get(i).stream().filter(r -> !entry.contains(r)).forEach(r -> dfs(rooms, r, entry));
        return entry.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1));
        lists.add(Arrays.asList(2));
        lists.add(Arrays.asList(3));
        lists.add(Arrays.asList());
        boolean ans = solution.canVisitAllRooms(lists);
        System.out.println(ans);
    }
}
