package J_innerClass;

public class BankAccount {
     // main class
    private String Account_number;
    private double Balance;

    public BankAccount(String Account_number,double Balance){

            this.Account_number=Account_number;
            this.Balance=Balance;

    }
    public void displayDetails(){
        System.out.println("Acc holder number is : "+Account_number);
        System.out.println("Balance is : "+Balance);
    }
    class Transaction{
        public void deposit(double amount){
            Balance+=amount;
            System.out.println("Acc holder number is : "+Account_number);
            System.out.println("Balance is : "+Balance);


        }
        public void withdraw(double amount){
            Balance-=amount;
            System.out.println("Acc holder number is : "+Account_number);
            System.out.println("Balance is : "+Balance);

        }

    }

    public static void main(String[] args) {

        BankAccount obj=new BankAccount("ICICI45612",2000);
        obj.displayDetails();
        BankAccount.Transaction trans=obj.new Transaction();
        trans.deposit(4000);
        trans.withdraw(1000);
    }

}
