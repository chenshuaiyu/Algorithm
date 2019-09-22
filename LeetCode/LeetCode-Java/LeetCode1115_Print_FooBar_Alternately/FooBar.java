package LeetCode.LeetCode_Java.LeetCode1115_Print_FooBar_Alternately;

public class FooBar {
    private int n;
    private boolean flag;

    public FooBar(int n) {
        this.n = n;
        flag = false;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (flag)
                wait();
            printFoo.run();
            flag = true;
            notifyAll();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (!flag)
                wait();
            printBar.run();
            flag = false;
            notifyAll();
        }
    }
}
