package LeetCode0234_Palindrome_Linked_List;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while (slow != null) {
            if (slow.val != head.val)
                return false;
            else {
                slow = slow.next;
                head = head.next;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null) return head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode next;

        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
