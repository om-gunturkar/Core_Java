package Loops;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        while(true){
            System.out.println("Enter the customer number to get entry : ");
            number=sc.nextInt();
            if(number>100){
                System.out.println("Offer valid for 100 customers only");
                break;
            }
        }
    }
}
