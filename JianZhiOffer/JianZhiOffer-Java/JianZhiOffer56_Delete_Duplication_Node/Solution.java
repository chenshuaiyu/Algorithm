package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer56_Delete_Duplication_Node;

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode h = new ListNode(-1);
        h.next = pHead;
        ListNode pre = h;
        ListNode cur = pHead;
        while (pre.next != null) {
            if (cur.next != null && pre.next.val == cur.next.val) {
                cur = cur.next;
            } else {
                if (pre.next != cur) {
                    pre.next = cur.next;
                    cur = cur.next;
                } else {
                    pre = pre.next;
                    cur = cur.next;
                }
            }
        }
        return h.next;
    }
}
