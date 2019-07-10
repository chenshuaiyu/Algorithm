package JianZhiOffer05_Queue_with_Two_Stacks;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        int pop = stack2.pop();
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
        return pop;
    }
}
