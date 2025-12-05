package SynchronizedPrograms;

public class Account1 {

    private static int balance = 1000;

    public static synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Final balance: " + balance);
    }
}

