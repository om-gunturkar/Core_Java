package SynchronizedPrograms;

public class User1 extends Thread {

    Calculate c1;

    public User1(Calculate c1) {
        this.c1 = c1;
    }

    @Override
    public void run() {
        c1.getNum(2);
    }
}

