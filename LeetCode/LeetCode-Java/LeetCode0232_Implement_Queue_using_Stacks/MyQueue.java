package LeetCode0232_Implement_Queue_using_Stacks;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> stack1;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack = new Stack<>();
        stack1 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        while (!stack.isEmpty())
            stack1.push(stack.pop());
        stack1.push(x);
        while (!stack1.isEmpty())
            stack.push(stack1.pop());
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return stack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return stack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
