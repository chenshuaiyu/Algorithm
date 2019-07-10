package JianZhiOffer14_Kth_Node_from_End;

public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0) return null;
        ListNode cur = head;
        for (int i = 0; i < k - 1 && cur != null; i++)
            cur = cur.next;
        if (cur != null) {
            while (cur.next != null) {
                cur = cur.next;
                head = head.next;
            }
            return head;
        } else
            return null;
    }
}
