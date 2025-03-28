package Functions;

import java.util.Scanner;

public class Q_2 {


    public static void CalculateDiscount(double amount){

        if(amount>500){
            double total_discount= amount*0.2;
            double total_amount=amount-total_discount;
            System.out.println(total_amount);
        } else if (amount>200) {
            double total_discount= amount*0.2;
            double total_amount=amount-total_discount;
            System.out.println(total_amount);
        }else if(100<amount && amount<200){
            double total_discount=amount*0.05;
            double total_amount=amount-total_discount;
            System.out.println(total_amount);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of amount : ");
        double amount=sc.nextInt();
        CalculateDiscount(amount);
    }



}
