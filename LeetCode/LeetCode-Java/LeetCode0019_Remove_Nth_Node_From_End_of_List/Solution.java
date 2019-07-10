package LeetCode0019_Remove_Nth_Node_From_End_of_List;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        if (len == n)
            return head.next;
        cur = head;
        for (int i = 0; i < len - n - 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode ans = solution.removeNthFromEnd(listNode, 2);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
