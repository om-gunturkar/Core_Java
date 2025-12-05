package ATM_Machine;

public class ATM implements ATMInterface, Runnable {

    BankAccount account;
    String task;
    int amount;

    public ATM(BankAccount account, String task, int amount) {
        this.account = account;
        this.task = task;
        this.amount = amount;
    }

    @Override
    public void run() {
        if(task.equals("deposit"))
            deposit(amount);
        else if(task.equals("withdraw"))
            withdraw(amount);
        else if(task.equals("check"))
            checkBalance();
    }

    @Override
    public void checkBalance() {
        account.checkBalance();
    }

    @Override
    public void deposit(int amount) {
        account.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        account.withdraw(amount);
    }
}

