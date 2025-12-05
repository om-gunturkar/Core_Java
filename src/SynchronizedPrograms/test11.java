package SynchronizedPrograms;

public class test11 {

    public static void main(String[] args) {

        Calculate c1 = new Calculate();

        Thread t1 = new Thread() {
            public void run() {
                c1.getNum(3);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                c1.getNum(5);
            }
        };

        t1.start();
        t2.start();
    }
}

