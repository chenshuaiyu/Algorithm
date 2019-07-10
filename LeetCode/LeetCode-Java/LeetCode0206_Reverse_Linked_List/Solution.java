package LeetCode0206_Reverse_Linked_List;

public class Solution {
    //递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        //p是最后一个结点
        ListNode p = reverseList(head.next);
        //翻转指向
        head.next.next = head;
        //避免成环
        head.next = null;
        return p;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode pre = null, cur = head, next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = head;
        ListNode currentNode = head.next;
        ListNode nextNode = null;
        while (newHead.next != null)
            newHead = newHead.next;
        newHead.next = head;
        while (currentNode != newHead) {
            nextNode = currentNode.next;
            currentNode.next = newHead.next;
            newHead.next = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = null;
        ListNode ans = solution.reverseList(listNode);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
