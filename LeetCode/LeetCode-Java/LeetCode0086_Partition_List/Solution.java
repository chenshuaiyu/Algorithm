package LeetCode0086_Partition_List;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);

        ListNode lessCurrent = less;
        ListNode greaterCurrent = greater;

        ListNode c = head;

        while (c != null) {
            int n = c.val;
            if (c.val < x) {
                lessCurrent.next = new ListNode(n);
                lessCurrent = lessCurrent.next;
            } else {
                greaterCurrent.next = new ListNode(n);
                greaterCurrent = greaterCurrent.next;
            }
            c = c.next;
        }
        greaterCurrent.next = null;
        lessCurrent.next = greater.next;

        return less.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l = new ListNode(1);
        l.next = new ListNode(4);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(2);
        l.next.next.next.next = new ListNode(5);
        l.next.next.next.next.next = new ListNode(2);

        ListNode ans = solution.partition(l, 3);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
