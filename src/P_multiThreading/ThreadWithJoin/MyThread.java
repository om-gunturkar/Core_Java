package P_multiThreading.ThreadWithJoin;

public class Mythread extends Thread {

    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

