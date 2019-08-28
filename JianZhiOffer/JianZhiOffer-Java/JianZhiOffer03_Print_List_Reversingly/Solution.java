package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer03_Print_List_Reversingly;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans = new ArrayList<>();
        while (listNode != null) {
            ans.add(listNode.val);
            listNode = listNode.next;
        }
        //调用集合的反转函数
        Collections.reverse(ans);
        return ans;
    }

    private ArrayList<Integer> ans = new ArrayList<>();

    //递归到最底层再返回
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        if (listNode != null){
            printListFromTailToHead1(listNode.next);
            ans.add(listNode.val);
        }
        return ans;
    }
}
