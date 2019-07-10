package JianZhiOffer36_First_Common_Nodes_in_Lists;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        int len1 = len(pHead1);
        int len2 = len(pHead2);
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
