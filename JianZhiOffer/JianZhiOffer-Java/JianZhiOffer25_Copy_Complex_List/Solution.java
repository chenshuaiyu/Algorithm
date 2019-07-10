package JianZhiOffer25_Copy_Complex_List;

public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        //将每个节点复制，并放在原节点之后
        RandomListNode curNode = pHead;
        while (curNode != null) {
            RandomListNode node = new RandomListNode(curNode.label);
            node.next = curNode.next;
            curNode.next = node;
            curNode = node.next;
        }
        //将复制节点的random指针赋值
        curNode = pHead;
        while (curNode != null) {
            RandomListNode node = curNode.next;
            if (curNode.random != null)
                node.random = curNode.random.next;
            curNode = node.next;
        }
        //拆分链表
        curNode = pHead;
        RandomListNode head = pHead.next;
        while (curNode.next != null){
            RandomListNode temp = curNode.next;
            curNode.next = temp.next;
            curNode = temp;
        }
        return head;
    }
}
