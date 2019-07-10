package LeetCode0752_Open_the_Lock;

import java.util.*;

public class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> d = new HashSet<>(Arrays.asList(deadends));
        LinkedList<String> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        queue.add("0000");
        visited.add("0000");
        if (d.contains("0000")) return -1;
        if (target == "0000") return 0;
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            for (int i = queue.size() - 1; i >= 0; i--) {
                String s = queue.pollFirst();
//                System.out.println(s);
                List<String> next = getNext(s);
                for (String s1 : next) {
                    if (s1.equals(target))
                        return count;
                    if (!d.contains(s1) && !visited.contains(s1)) {
                        queue.add(s1);
                        visited.add(s1);
                    }
                }
            }
//            System.out.println("结束 " + count);
        }
        return -1;
    }

    private List<String> getNext(String s) {
        List<String> list = new ArrayList<>();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (c > '0' && c < '9') {
                list.add(new StringBuilder(s).replace(i, i + 1, String.valueOf((char) (c + 1))).toString());
                list.add(new StringBuilder(s).replace(i, i + 1, String.valueOf((char) (c - 1))).toString());
            } else if (c == '0') {
                list.add(new StringBuilder(s).replace(i, i + 1, String.valueOf((char) (c + 1))).toString());
                list.add(new StringBuilder(s).replace(i, i + 1, String.valueOf((char) (c + 9))).toString());
            } else {
                list.add(new StringBuilder(s).replace(i, i + 1, String.valueOf((char) (c - 1))).toString());
                list.add(new StringBuilder(s).replace(i, i + 1, String.valueOf((char) (c - 9))).toString());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202");
        System.out.println(ans);
    }
}
