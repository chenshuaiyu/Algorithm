package LeetCode0203_Remove_Linked_List_Elements;

public class Solution {
    //递归
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode node = removeElements(head.next, val);
        if (head.val == val)
            return node;
        else {
            head.next = node;
            return head;
        }
    }

    //添加头节点
    public ListNode removeElements2(ListNode head, int val) {
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode cur = h;
        ListNode pre = null;
        while (cur != null) {
            if (cur.val == val) {
                cur = cur.next;
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return h.next;
    }

    public ListNode removeElements1(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null)
            return head;
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
//            System.out.println(cur.val);
            if (cur.val == val) {
                cur = cur.next;
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next = new ListNode(6);
//        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(2);
//        listNode.next.next.next = new ListNode(1);
        ListNode ans = solution.removeElements(listNode, 6);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
