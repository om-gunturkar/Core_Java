package P_multiThreading.DaemonThread;

public class Mythread implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {

            if(Thread.currentThread().isDaemon()) {
                System.out.println(i + " : Daemon Thread -> " + Thread.currentThread().getName());
            } else {
                System.out.println(i + " : NOT Daemon -> " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

