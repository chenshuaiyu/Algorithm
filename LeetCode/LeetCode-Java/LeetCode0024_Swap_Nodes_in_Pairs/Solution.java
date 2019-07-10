package LeetCode0024_Swap_Nodes_in_Pairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre1 = null;
        ListNode pre2 = head;
        ListNode cur = head.next;
        ListNode h = cur;
        while (pre2 != null && pre2.next != null) {
            cur = pre2.next;
            pre2.next = cur.next;
            cur.next = pre2;
            if (pre1 != null)
                pre1.next = cur;
            pre1 = pre2;
            pre2 = pre2.next;
        }
        return h;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        ListNode ans = solution.swapPairs(listNode);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
