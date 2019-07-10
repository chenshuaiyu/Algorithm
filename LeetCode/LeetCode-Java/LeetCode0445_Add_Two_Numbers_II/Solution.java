package LeetCode0445_Add_Two_Numbers_II;

import java.util.ArrayList;

/**
 * Coder : chenshuaiyu
 * Time : 2018/11/20 17:57
 */
public class Solution {
    // 利用栈反转
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                list1.add(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                list2.add(l2.val);
                l2 = l2.next;
            }
        }
        int num1 = list1.size() - 1;
        int num2 = list2.size() - 1;
        int i = 0;
        ListNode node = null;
        ListNode n = null;
        while (num1 != -1 || num2 != -1) {
            int num = 0;
            if (num1 != -1 && num2 != -1) {
                num = list1.get(num1) + list2.get(num2) + i;
                num1--;
                num2--;
            } else if (num1 != -1) {
                num = list1.get(num1) + i;
                num1--;
            } else if (num2 != -1) {
                num = list2.get(num2) + i;
                num2--;
            }
            i = num >= 10 ? 1 : 0;
            n = new ListNode(num % 10);
            n.next = node;
            node = n;
        }
        if (i == 1) {
            n = new ListNode(i);
            n.next = node;
            node = n;
        }
        return node;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(7);
        ListNode l11 = l1;
        l1.next = new ListNode(2);
        l1 = l1.next;
        l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(3);
        l1.next.next = null;
        ListNode l2 = new ListNode(5);
        ListNode l22 = l2;
        l2.next = new ListNode(6);
        l2 = l2.next;
        l2.next = new ListNode(4);
        l2.next.next = null;
        ListNode l = solution.addTwoNumbers(l11, l22);
        while (l != null) {
            System.out.print(l.val);
            l = l.next;
        }
    }
}
