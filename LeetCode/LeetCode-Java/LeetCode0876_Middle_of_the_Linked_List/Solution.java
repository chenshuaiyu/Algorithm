package LeetCode0876_Middle_of_the_Linked_List;

public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null || fast.next == null)
                return slow;
        }
    }
}
