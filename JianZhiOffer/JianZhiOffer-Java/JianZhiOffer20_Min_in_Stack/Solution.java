package JianZhiOffer20_Min_in_Stack;

import java.util.Stack;

public class Solution {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (minStack.isEmpty() || minStack.peek() > node)
            minStack.push(node);
    }

    public void pop() {
        int n = stack.pop();
        if (n == minStack.peek())
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
