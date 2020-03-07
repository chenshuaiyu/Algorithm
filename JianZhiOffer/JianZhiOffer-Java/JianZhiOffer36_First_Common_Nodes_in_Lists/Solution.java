package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer36_First_Common_Nodes_in_Lists;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null)
            return null;
        ListNode n1 = pHead1, n2 = pHead2;
        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
            if (n1 == null && n2 == null) {
                break;
            }
            if (n1 == null) {
                n1 = pHead2;
            }
            if (n2 == null) {
                n2 = pHead1;
            }
        }
        return n1;
    }

    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        int len1 = len(pHead1);
        int len2 = len(pHead2);
        //长链表先走过多余的节点，然后同步向后遍历
        if (len1 > len2)
            pHead1 = walkStep(pHead1, len1 - len2);
        else
            pHead2 = walkStep(pHead2, len2 - len1);
        while (pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }

    private ListNode walkStep(ListNode pHead1, int i) {
        while (i-- != 0)
            pHead1 = pHead1.next;
        return pHead1;
    }

    private int len(ListNode pHead) {
        int count = 0;
        while (pHead != null) {
            count++;
            pHead = pHead.next;
        }
        return count;
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Set<ListNode> set = new HashSet<>();
        while (pHead1 != null) {
            set.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            if (set.contains(pHead2)) {
                return pHead2;
            }
            pHead2 = pHead2.next;
        }
        return null;
    }
}
