package P_multiThreading;

public class TestThread {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.setName("Thread-One");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("Thread-Two");
        t2.start();
    }
}
