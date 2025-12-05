package P_multiThreading;

public class MyRunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }
}
