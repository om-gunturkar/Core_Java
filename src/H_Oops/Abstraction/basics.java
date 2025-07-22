package H_Oops.Abstraction;

public class basics extends demo{

    private int balance = 1000;

    void withdraw(int amount){
        System.out.println("Take cash :"+amount);
        balance-=amount;
        System.out.println("Your balance is "+balance);
    }
    void deposit(int amount){
        System.out.println("Deposited amount :"+amount);
        balance+=amount;
        System.out.println("You balance is :"+balance);

    }
    void displayBalance(){
        System.out.println("The balance is :"+balance);
    }

    public static void main(String[] args) {
        basics obj=new basics();
        obj.displayBalance();
        obj.deposit(1000);
        obj.withdraw(500);
    }
}
