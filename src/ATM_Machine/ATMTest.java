package ATM_Machine;

public class ATMTest {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread user1 = new Thread(new ATM(account, "withdraw", 2000), "ATM User 1");
        Thread user2 = new Thread(new ATM(account, "deposit", 3000), "ATM User 2");
        Thread user3 = new Thread(new ATM(account, "check", 0), "ATM User 3");

        user1.start();
        user2.start();
        user3.start();
    }
}

