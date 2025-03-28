package Abstraction;

public class Bankdetailoperation implements bankoperation {
    String Accholdname;
    double balance;

    public Bankdetailoperation(String Accholdname,double balance){
        this.Accholdname=Accholdname;
        this.balance=balance ;
    }
    public void displayBalance(){
        System.out.println("The acc holder name is "+Accholdname);
        System.out.println("The acc holder balance is "+balance);
    }
    public void Deposit(double amount){
        System.out.println("Amount deposited"+amount);
        balance+=amount;
    }
    public void Withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal success, new balance is "+balance);

        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
