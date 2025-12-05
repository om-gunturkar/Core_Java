package SynchronizedPrograms;

public class Test_Account1 {

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                Account1.deposit(2000);
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                Account1.deposit(3000);
                System.out.println(Thread.currentThread().getName());
            }
        };

        t1.start();
        t2.start();
    }
}

