package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer05_Queue_with_Two_Stacks;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //进队节点全部压入stack1
    public void push(int node) {
        stack1.push(node);
    }

    //将stack1中的节点转移至stack2，取出stack2栈顶的值，将stack2中的节点再转移回stack1
    public int pop() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        int pop = stack2.pop();
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
        return pop;
    }
}
