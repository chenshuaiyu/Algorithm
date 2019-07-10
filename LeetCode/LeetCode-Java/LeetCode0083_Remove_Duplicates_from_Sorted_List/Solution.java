package LeetCode0083_Remove_Duplicates_from_Sorted_List;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/30 11:03
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head;
        ListNode current = head;
        while (current != null && current.next != null) {
            node = current.next;
            if (current.val == node.val)
                current.next = node.next;
            else
                current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(3);

        ListNode ans = solution.deleteDuplicates(head);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
