package E_Loops;

import java.util.Scanner;

public class doWhile_Task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter positive number : ");
            number=sc.nextInt();
            if(number<0){
                System.out.println("Negative Number Entered ");
                break;
            }
        }while(number<=0);
        if(number>0){
            System.out.println("You entered positive number " +number);
        }
    }
}
