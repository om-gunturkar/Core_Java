package SynchronizedPrograms;
public class User2 extends Thread {

    Calculate c1;

    public User2(Calculate c1) {
        this.c1 = c1;
    }

    @Override
    public void run() {
        c1.getNum(3);
    }
}

