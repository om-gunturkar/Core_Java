package SynchronizedPrograms;
public class Test {

    public static void main(String[] args) {

        Calculate c1 = new Calculate();

        User1 t1 = new User1(c1);
        t1.start();

        User2 t2 = new User2(c1);
        t2.start();
    }
}

