package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer55_Entry_Node_of_Loop;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        boolean flag = false;
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (flag) {
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
