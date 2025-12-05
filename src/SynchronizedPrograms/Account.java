package SynchronizedPrograms;

public class Account {

    private int balance = 1000;

    public void deposit(int amount) {

        synchronized (this) {  // locking only required block
            balance += amount;
        }

        System.out.println("Final balance: " + balance);
    }
}

