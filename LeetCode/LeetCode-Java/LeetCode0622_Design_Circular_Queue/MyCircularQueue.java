package LeetCode0622_Design_Circular_Queue;

public class MyCircularQueue {
    private int[] data;
    private int length = 0;
    private int first = 0;
    private int last = 0;
    private int size = 0;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        data = new int[k];
        length = k;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (size >= length) {
            return false;
        } else {
            data[last] = value;
            last = (last + 1) % length;
            size++;
            return true;
        }
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (size == 0) {
            return false;
        }else {
            first = (first + 1) % length;
            size--;
            return true;
        }
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (size == 0)
            return -1;
        else
            return data[first];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (size == 0)
            return -1;
        else
            return data[(last + length - 1) % length];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return size == length;
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
    }
}
