package SynchronizedPrograms;

public class Test1 {

    public static void main(String[] args) {

        Account a1 = new Account();

        Thread t1 = new Thread() {
            public void run() {
                a1.deposit(2000);
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                a1.deposit(5000);
                System.out.println(Thread.currentThread().getName());
            }
        };

        t1.start();
        t2.start();
    }
}

