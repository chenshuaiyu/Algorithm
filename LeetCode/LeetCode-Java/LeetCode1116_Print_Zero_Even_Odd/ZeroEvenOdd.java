package LeetCode.LeetCode_Java.LeetCode1116_Print_Zero_Even_Odd;

import java.util.function.IntConsumer;

public class ZeroEvenOdd {
    private int n;
    private boolean even;
    private boolean odd;

    public ZeroEvenOdd(int n) {
        this.n = n;
        even = false;
        odd = false;
    }

    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (this) {
                while (even || odd)
                    wait();
                printNumber.accept(0);
                if ((i + 1) % 2 != 0)
                    odd = true;
                else
                    even = true;
                notifyAll();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            synchronized (this) {
                while (!even)
                    wait();
                printNumber.accept(i);
                even = false;
                notifyAll();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            synchronized (this) {
                while (!odd)
                    wait();
                printNumber.accept(i);
                odd = false;
                notifyAll();
            }
        }
    }
}
