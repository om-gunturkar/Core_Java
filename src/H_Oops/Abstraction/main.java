package H_Oops.Abstraction;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter acc holder name :");
        String name=sc.next();
        System.out.println("Enter you balance :");
        double balance=sc.nextDouble();
        Bankdetailoperation obj=new Bankdetailoperation(name,balance);

        while(true){
            System.out.println("1. For Deposit");
            System.out.println("2. For Withdraw");
            System.out.println("3. For Balance");
            System.out.println("4. For Exit");

            System.out.println("Select suitable option");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter deposit amount you want :");
                    double depositamount=sc.nextDouble();
                    obj.Deposit(depositamount);
                    break;
                case 2:
                    System.out.println("Enter withdraw amount you want :");
                    double Withdrawamount=sc.nextDouble();
                    obj.Withdraw(Withdrawamount);
                    break;
                case 3: obj.displayBalance();
                        break;
                case 4:
                    System.out.println("Exiting Now!");
                    break;
                default:
                    System.out.println("Invalid option selected");

            }
        }
    }
}
