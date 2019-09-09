package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer15_Reverse_List;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        //pre节点连接已反转的链表
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
