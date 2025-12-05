package P_multiThreading.DaemonThread;

public class Test {

    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("Team Leader");

        Thread t1 = new Thread(tg, new Mythread());
        t1.setName("one");
        t1.start();

        Thread t2 = new Thread(tg, new Mythread());
        t2.setName("two");
        t2.setDaemon(true);
        t2.start();

        System.out.println("Thread group name: " + tg.getName());
        tg.list();
    }
}
