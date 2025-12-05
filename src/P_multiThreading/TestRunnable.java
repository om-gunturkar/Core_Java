package P_multiThreading;

public class TestRunnable {

    public static void main(String[] args) {

        MyRunnableThread r1 = new MyRunnableThread();

        Thread t1 = new Thread(r1, "Thread-One");
        t1.start();

        Thread t2 = new Thread(r1, "Thread-Two");
        t2.start();

        Thread t3 = new Thread(r1, "Thread-Three");
        t3.start();
    }
}

