package D_Functions;
import java.util.Scanner;
public class Q_3
{
    static double balance=1000;
    public  static void Checkbalance()
    {
        System.out.println("Your Current balance is "+balance);
    }

    public static void DepositMoney(double Amount)
    {
        balance+=Amount; //balance=amount +balance
        System.out.println("You deposited Amount rs"+Amount);
        System.out.println("Your new BAlance is "+balance);
    }
    public static void Withdraw(double Amount)
    {
        if(Amount>0 && Amount<=balance)
        {
            balance-=Amount;
            System.out.println("You withdraw amount rs"+Amount);
            System.out.println("Your new Balance is Rs"+balance);
        }
        else {
            System.out.println("Insuffincent Balance or inavalid amout");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        boolean running=true;
        while(running)
        {
            System.out.println("Welcmoe TO ATM!!!!");
            System.out.println("Select Option According to your Choice");
            System.out.println("1 for Check Balance");
            System.out.println("2 for Deposit Money");
            System.out.println("3 For Withdraw Money");
            System.out.println("4 For exit......");

            int option =sc.nextInt();
            switch(option)
            {
                case 1:
                    Checkbalance();
                    break;
                case 2:
                    System.out.println("ENter the Deposit amount");
                    double deposit=sc.nextDouble();
                    DepositMoney(deposit);
                    break;
                case 3:
                    System.out.println("Enter the withdraw Amount");
                    double Withdraw=sc.nextDouble();
                    Withdraw(Withdraw);
                    break;

                case 4:
                    System.out.println("YOu select Exit..Exiting Now....");
                    running=false;
                    break;

                default:
                    System.out.println("Ivalid Option , please select Proper option");

            }
        }
    }
}
