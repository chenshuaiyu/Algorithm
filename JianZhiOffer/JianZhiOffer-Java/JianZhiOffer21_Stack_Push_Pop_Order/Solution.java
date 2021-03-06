package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer21_Stack_Push_Pop_Order;

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.add(pushA[i]);
            //循环判断栈顶与弹出序列第一个整数是否相等
            while (!stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return j == popA.length;
    }
}
