package P_multiThreading.RunnableThreadGroup;

public class Test {

    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("Team Leader");

        Thread t1 = new Thread(tg, new Mythread());
        t1.setName("ooo");
        t1.start();

        Thread t2 = new Thread(tg, new Mythread());
        t2.setName("pppp");
        t2.start();

        System.out.println("Thread group name: " + tg.getName());
        tg.list();
    }
}

