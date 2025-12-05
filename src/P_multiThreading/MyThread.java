package P_multiThreading;


    public class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Running thread: " + Thread.currentThread().getName());
        }
    }

