package P_multiThreading.ThreadWithJoin;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Mythread t1 = new Mythread();
        t1.setName("one");
        t1.start();

        Mythread t2 = new Mythread();
        t2.setName("two");
        t2.start();

        t2.join();   // Main waits for t2 to complete

        Mythread t3 = new Mythread();
        t3.setName("three");
        t3.start();
    }
}

