/*
taking input from user , give 10% discount , print final amount deducting discount price from amount

*/

package Basics;
import java.util.Scanner;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of product : ");
        int price=sc.nextInt();

        double discount = price*0.1;
        System.out.println("The discount is : "+discount);

        System.out.println("The final amount is : "+(price-discount));
    }
}
