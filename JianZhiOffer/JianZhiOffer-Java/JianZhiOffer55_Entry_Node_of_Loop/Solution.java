package JianZhiOffer55_Entry_Node_of_Loop;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        boolean ans = false;
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ans = true;
                break;
            }
        }
        if (ans) {
            fast = pHead;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
