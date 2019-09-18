package LeetCode.LeetCode_Java.LeetCode0002_Add_Two_Numbers;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/13 18:38
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode current = l;
        int n = 0;
        while (l1 != null || l2 != null) {
            int a = (l1 == null) ? 0 : l1.val;
            int b = (l2 == null) ? 0 : l2.val;
            current.next = new ListNode((a + b + n) % 10);
            n = (a + b + n) >= 10 ? 1 : 0;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            current = current.next;
        }
        if (n > 0) {
            current.next = new ListNode(n);
            current = current.next;
        }
        current.next = null;
        return l.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        ListNode l11 = l1;
        l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(3);
        l1.next.next = null;
        ListNode l2 = new ListNode(5);
        ListNode l22 = l2;
        l2.next = new ListNode(6);
        l2 = l2.next;
        l2.next = new ListNode(4);
        l2.next.next = null;
        ListNode l = solution.addTwoNumbers(l11, l22);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }
}
