package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer14_Kth_Node_from_End;

public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        //使用两个均指向head的指针，第一个先走k个节点，然后两个指针同步向后运动，
        //直到第一个结点走到最后，第二个结点的位置即为倒数第k个结点
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
