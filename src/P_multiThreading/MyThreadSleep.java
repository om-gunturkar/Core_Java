package P_multiThreading;

public class MyThreadSleep extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
            try {
                Thread.sleep(4000); // 4 seconds delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
