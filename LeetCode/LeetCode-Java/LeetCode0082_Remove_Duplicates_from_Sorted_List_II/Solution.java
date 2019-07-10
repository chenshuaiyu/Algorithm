package LeetCode0082_Remove_Duplicates_from_Sorted_List_II;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode pre = h;
        ListNode cur = head;
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

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next.next = new ListNode(5);

        ListNode ans = solution.deleteDuplicates(listNode);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
