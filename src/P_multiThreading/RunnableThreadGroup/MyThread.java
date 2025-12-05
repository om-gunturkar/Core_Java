package P_multiThreading.RunnableThreadGroup;

public class Mythread implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName() + "  Priority: " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

