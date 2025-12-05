package ATM_Machine;

public class BankAccount {

    private int balance = 5000; // initial balance

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " Deposited | Updated Balance = " + balance);
    }

    public synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + " Withdrawn | Updated Balance = " + balance);
        } else {
            System.out.println("Insufficient Funds! Available Balance = " + balance);
        }
    }

    public synchronized void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

