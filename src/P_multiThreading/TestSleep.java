package P_multiThreading;

public class TestSleep {

    public static void main(String[] args) {

        MyThreadSleep t1 = new MyThreadSleep();
        t1.setName("Thread-One");
        t1.start();

        MyThreadSleep t2 = new MyThreadSleep();
        t2.setName("Thread-Two");
        t2.start();
    }
}
