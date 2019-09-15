package LeetCode.LeetCode_Java.LeetCode1114_Print_in_Order;

public class Foo {
    private boolean firstFinished;
    private boolean secondFinished;
    private Object lock;

    public Foo() {
        firstFinished = false;
        secondFinished = false;
        lock = new Object();
    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (lock) {
            printFirst.run();
            firstFinished = true;
            lock.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (lock) {
            while (!firstFinished)
                lock.wait();
            printSecond.run();
            secondFinished = true;
            lock.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (lock) {
            while (!secondFinished)
                lock.wait();
            printThird.run();
        }
    }
}
