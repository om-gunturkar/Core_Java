package P_multiThreading.ThreadPriorityDemonstration;

import P_multiThreading.ThreadWithJoin.Mythread; //important to import from thread with join

public class Test {
    public static void main(String[] args) {

        Mythread t1 = new Mythread();
        t1.setName("one");
        t1.setPriority(1);
        t1.start();

        Mythread t2 = new Mythread();
        t2.setName("two");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        Mythread t3 = new Mythread();
        t3.setName("three");
        t3.setPriority(9);
        t3.start();

        Mythread t4 = new Mythread();
        t4.setName("kkk");
        t4.setPriority(Thread.MIN_PRIORITY);
        t4.start();
    }
}
