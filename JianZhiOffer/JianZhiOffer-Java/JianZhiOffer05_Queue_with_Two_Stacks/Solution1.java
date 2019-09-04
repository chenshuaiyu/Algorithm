package JianZhiOffer.JianZhiOffer_Java.JianZhiOffer05_Queue_with_Two_Stacks;

import java.util.Stack;

public class Solution1 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //进队节点全部压入stack1
    public void push(int node) {
        stack1.push(node);
    }

    //当stack2不为空时，栈顶为出队节点，当stack2为空时，将stack1中的节点转移至stack2，并将stack2栈顶节点出队
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
